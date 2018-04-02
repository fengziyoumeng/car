import React from 'react'
import {Button,Col,Checkbox , Form,Select, Input, Row,Modal} from 'antd';

const createForm = Form.create;
const FormItem = Form.Item;
const objectAssign = require('object-assign');




var List = React.createClass({

    getInitialState() {
        return {
            selectedRowKeys: [], // 这里配置默认勾选列
            loading: false,
            data: [],
            provinceList:[],
            formData: {},
            pagination: {},
            canEdit: true,
            visible: false,
            visibleLook: false,
            assignVisible: false,
            editAge:true,
            editAddr:true,
            ageMax:""
        };
    },
    /*componentWillMount () {
        console.log("willMount");
    },*/
    componentDidMount () {
        this.fetch();
        this.requsetProvinceList();
    },
   /* componentWillReceiveProps (nextProps) {
        console.log("WillReceiveProps");
    },*/
    /*shouldComponentUpdate (nextProps,nextState) {
        console.log("shouldComponentUpdate");
    },*/
   /* componentWillUpdate (nextProps,nextState) {
        console.log("WillUpdate");
    },*/
    /*componentDidUpdate (prevProps,prevState) {
        console.log("DidUpdate");
    },*/
   /* componentWillUnmount () {
        console.log("WillUnmount");
    },*/

    fetch(params = {
        pageSize: 10,
        current: 1
    }) {
        this.setState({
            loading: true
        });
        Utils.ajaxData({
            url: '/act/get/querycondition.htm',
            data: params,
            callback: (result) => {
                this.setState({
                    loading: false,
                    data: result.data
                });
                this.props.form.setFieldsValue(result.data);
            }
        });
    },
    requsetProvinceList(){
        Utils.ajaxData({
            url: '/act/select/all/province.htm',
            method: 'get',
            type: 'json',
            callback: (result) => {
                this.setState({
                    provinceList:result.data
                });

            }
        });
    },
    getProvinceList() {
        return this.state.provinceList.map((item, index) => {
            return <Option key={item.id}>{item.name}</Option>
        })
    },
    changeAgeState(value){
        if(value.target.checked){
            this.props.form.setFields({
                ageMin: {
                    value: ""
                },
                ageMax:{
                    value:""
                }
            });
            this.setState({
               editAge:false
            });
        }else {
            this.props.form.setFields({
                ageMin: {
                    value: this.state.data.ageMin
                },
                ageMax:{
                    value:this.state.data.ageMax
                }
            });
            this.setState({
                editAge:true
            });
        }
    },
    changeAddrState(value){
        if(value.target.checked){
            this.props.form.setFields({
                addressFilterVo: {
                    value: []
                }
            });
            this.setState({
                editAddr:false
            });
        }else {
            this.props.form.setFields({
                addressFilterVo: {
                    value: this.state.data.addressFilterVo
                }
            });
            this.setState({
                editAddr:true
            });
        }
    },
    handleOk(e){
        e.preventDefault();
        var props = this.props;
        this.props.form.validateFields((errors, values) => {
            if (!!errors) {
                return;
            }
            var data = objectAssign({}, {
                form: JSON.stringify(objectAssign({}, values, {}))
            });
            var confirm = Modal.confirm;
            confirm({
                title: '确定提交吗？',
                content: '请确认您的查询条件填写无误后点击确定！',
                onOk() {
                    Utils.ajaxData({
                        url: "/act/saveorupdate/querycondition.htm",
                        data: data,
                        callback: (result) => {
                            if (result.code == 200) {
                                Modal.success({
                                    title: "数据设置成功，请到用户数据列表中查看！",
                                });
                            }else {
                                Modal.error({
                                    title: result.msg,
                                });
                            }
                        }
                    });
                },
                onCancel() {},
            });
        })
    },
    render() {
        const {getFieldProps} = this.props.form;

        var props = this.props;
        const formItemLayout = {
            labelCol: {
                span: 8
            },
            wrapperCol: {
                span: 16
            },
        };
        const fromItemAge = {
            labelCol: {
                span: 6
            },
            wrapperCol: {
                span: 6
            },
        };
        const itemLayout = {
            labelCol: {
                span: 6
            },
            wrapperCol: {
                span: 9
            },
        };
        const formItemLay = {
            type:"flex",
            justify:"center",
            align:"middle"
        };
        return (
            <div >
                <Form horizontal form={this.props.form}>
                    <Input  {...getFieldProps('id', {initialValue: ''})} type="hidden"/>

                    <div className="navLine-wrap-left">
                        <h2>设置用户类型</h2>
                    </div>
                        <Row {...formItemLay} >
                            <div>
                                <font color="green">提示：设置条件后将根据条件导入用户数据并执行扣费，请谨慎填写</font>
                            </div>
                        </Row>

                        {/*<Row {...formItemLay}>
                            <Col span="12" >
                            </Col>
                            <Col span={"12"} pull={7}>
                                <FormItem {...itemLayout}  label="芝麻分段：">
                                    <Select disabled={!props.canEdit} defaultValue={1} {...getFieldProps('zmScoreLevel', {rules: [{ required: true, message: '必填'}]})} >
                                        <Option value={1}>450 ~ 550</Option>
                                        <Option value={2} >550 ~ 630</Option>
                                        <Option value={3}>630 以上</Option>
                                    </Select>
                                </FormItem>
                            </Col>
                        </Row>*/}

                        <Row {...formItemLay}>
                            <Col span="4" push={6}>
                                <Checkbox onChange={this.changeAgeState} ></Checkbox>
                            </Col>
                            <Col span="9" push={2}>
                                <FormItem  {...fromItemAge} label="年&emsp;&emsp;龄：">
                                    <Input disabled={!this.state.editAge} {...getFieldProps('ageMin')} type="text"/>
                                </FormItem>
                            </Col>
                            <Col span="2" pull={2}>
                                <span>至</span>
                            </Col>
                            <Col span="9" pull={4}>
                                <FormItem  {...fromItemAge}>
                                    <Input disabled={!this.state.editAge}  {...getFieldProps('ageMax')} type="text"/>
                                </FormItem>
                            </Col>
                        </Row>

                        <Row {...formItemLay}>
                            <Col span="12" push={6}>
                                <Checkbox onChange={this.changeAddrState} ></Checkbox>
                            </Col>
                            <Col span={"12"} pull={7}>
                                <FormItem {...itemLayout}  label="排除省份：">
                                    <Select disabled={!this.state.editAddr} multiple {...getFieldProps('addressFilterVo', {rules: [{type: "array"}]})} >
                                        {this.getProvinceList()}
                                    </Select>
                                </FormItem>
                            </Col>

                        </Row>

                        {/*<Row {...formItemLay}>
                            <Col span="12" >
                            </Col>
                            <Col span="12" pull={7}>
                                <FormItem {...itemLayout} label="需求数量：">
                                    <Input disabled={!props.canEdit}  {...getFieldProps('dataAmount')} placeholder={"请填写你需要多少条数据"} type="text"/>
                                </FormItem>
                            </Col>
                        </Row>*/}
                        <Row {...formItemLay}>
                            <Col span="12"></Col>
                            <Col span="12" pull={4}>
                                <Button pull={3} type="primary" htmlType="submit" onClick={this.handleOk}>&emsp;提&emsp;&emsp;交&emsp;</Button>
                            </Col>
                        </Row>

                </Form>
            </div>
        );
    }
})
List = createForm()(List);
export default List;