import React from 'react'
import {Dropdown, Popover,Button,Icon, Menu, Modal, Table} from 'antd';
import Detail from './Detail';

var confirm = Modal.confirm;
var userData;
export default React.createClass({
    getInitialState() {
        return {
            selectedRowKeys: [], // 这里配置默认勾选列
            loading: false,
            data: [],
            pagination: {},
            canEdit: true,
            visible: false,
            visibleLook: false,
            assignVisible: false,
            visible:false,
            title:"用户详情",
            detail:{}
        };
    },
    componentWillReceiveProps(nextProps, nextState) {
        this.setState({
            params: nextProps.params,
        });
        this.fetch(nextProps.params);
    },
    componentDidMount() {
        this.fetch();
    },
    hideModal() {
        this.setState({
            visible: false,
            visibleLook: false,
            assignVisible: false
        });
        var pagination = this.state.pagination;
        this.fetch();
    },
    //打开分配弹窗
    showAssignModal(title, record) {
        this.setState({
            assignVisible: true,
            title: title,
            record: record
        });
    },
    rowKey(record) {
        return record.id;
    },

    //分页
    handleTableChange(pagination, filters, sorter) {
        const pager = this.state.pagination;
        pager.current = pagination.current;
        this.setState({
            pagination: pager,
        });
        this.fetch({
            pageSize: pagination.pageSize,
            current: pagination.current,
            params:this.state.params
        });
    },
    fetch(params = {
        pageSize: 10,
        current: 1
    }) {
        this.setState({
            loading: true
        });
        Utils.ajaxData({
            url: '/act/get/userdata/list.htm',
            data: params,
            callback: (result) => {
                const pagination = this.state.pagination;
                pagination.total = result.page.total;
                this.setState({
                    loading: false,
                    data: result.data,
                    pagination,
                });
                this.clearList();
            }
        });
    },
    clearList() {
        this.setState({
            selectedRowKeys: [],
        });
    },
    refreshList() {
        this.fetch();
    },
    setAuditStatus(value,record) {
        var me = this;
        Utils.ajaxData({
            url: "/act/set/userdata/status.htm",
            data: {
                borrowerId:value.userId,
                audit: record.key,
            },
            method: 'post',
            callback: (result) => {
                me.refreshList();
            }
        });
    },
    handleMenuClick(temp,value,record){
        this.setAuditStatus(value,record);
    },
    showDetail(title, record, canEdit) {
        // var record = this.state.selectedRow;

        this.setState({
            visibleLook: true,
            canEdit: canEdit,
            record: record,
            title: title
        },() => {
            Utils.ajaxData({
                url: '/act/get/user/basedetail.htm',
                method: "post",
                data: {userId:record.userId},
                callback: (result) => {
                    if(result.code == '200'){
                        this.refs.Lookdetails.setFieldsValue(result);
                        this.setState({
                            detail: result.data,
                        });
                    }else{
                        Modal.error({
                            title: result.msg
                        })
                    }

                }
            });
        })
    },

    /*getUserDetail(userId){
        Utils.ajaxData({
            url: "/act/get/user/basedetail.htm",
            data: {
                userId:userId
            },
            callback: (result) => {
                if(result.code == '200'){
                    this.refs.Lookdetails.setFieldsValue(result);
                    this.setState({
                        detail: result.data,
                    });
                }else{
                    Modal.error({
                        title: result.msg
                    })
                }
            }
        });
    },*/
    render() {
        var me = this;
        const {
            loading,
            selectedRowKeys
        } = this.state;
        const rowSelection = {
            selectedRowKeys,
            onChange: this.onSelectChange,
        };
        const hasSelected = selectedRowKeys.length > 0;

        var columns = [{
            title: '手机号',
            dataIndex: 'authMobile'
        }, {
            title: '运营商',
            dataIndex: "mobileOperator",
            render(value){
                if(value==1){
                    return "移动";
                }else if(value ==2){
                    return "电信";
                }else if(value ==3){
                    return "联通";
                }
            }
        }, {
            title: '姓名',
            dataIndex: "realName",
        },  {
            title: '年龄',
            dataIndex: "age"
        }, {
            title: '性别',
            dataIndex: "sex",
            render(value){
                if(value == 0){
                    return "女";
                }else if(value == 1){
                    return "男";
                }
            }
        },{
            title: '地区',
            dataIndex: "address",
        },{
            title: 'QQ号',
            dataIndex: "qq"
        },{
            title: '芝麻分',
            dataIndex: "zhimaScore"
        }, {
            title: '日期',
            dataIndex: "addTime",
            render(value){
                if(value){
                    var time = value.substring(0,10);
                    return time;
                }else{
                    return "";
                }
            }
        }, {
            title: '扣款',
            dataIndex: "price"  ,
        }, {
            title: '状态',
            dataIndex: "audit",
            render(value,record){
                if(value==0||value==null){
                    return "未审核"
                }else if(value==1){
                    return <font color={"green"}>已通过</font>
                }else if(value==2){
                    return <font color={"red"}>未通过</font>
                }
            }
        }, {
            title: '查看详情',
            dataIndex: "userId",
            render(value,record){
                return <Button type="primary" onClick={me.showDetail.bind(null,'详细信息',record,false)}>详情</Button>
            }
        },{
            title: '操作',
            dataIndex: "",
            render(value, record) {
                return <div style={{ textAlign: "left" }}>
                    <Dropdown  overlay={
                        <Menu onClick={me.handleMenuClick.bind(null,value,record)}>
                            <Menu.Item key="1" disabled={record.audit!=0&&record.audit!=null?true:false}>审核通过</Menu.Item>
                            <Menu.Item key="2" disabled={record.audit!=0&&record.audit!=null?true:false}>审核拒绝</Menu.Item>
                        </Menu>}>
                        <Button >
                            管理 <Icon type="down" />
                        </Button>
                    </Dropdown>
                </div>
            }
        }];

        var state = this.state;
        return (
            <div className="block-panel">
                <Table columns={columns} rowKey={this.rowKey}  size="middle"
                       params ={this.props.params}
                       dataSource={this.state.data}
                       pagination={this.state.pagination}
                       loading={this.state.loading}
                       onChange={this.handleTableChange}  />

                <Detail ref="Detail" visible={state.visibleLook} title={state.title} hideModal={me.hideModal} record={state.rowRecord}
                             canEdit={state.canEdit} detail={state.detail} />
            </div>
        );
    }
})