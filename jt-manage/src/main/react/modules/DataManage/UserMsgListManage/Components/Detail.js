import React from 'react';
import {
  Button,
  Form,
  Input,
  InputNumber,
  Modal,
  Row,
  Col,
  Select,
  Checkbox,
  Radio,
  message,
  DatePicker,
  Icon
  
} from 'antd';
const CheckboxGroup = Checkbox.Group
const createForm = Form.create;
const FormItem = Form.Item;
const Option = Select.Option;
const objectAssign = require('object-assign');
var Detail = React.createClass({
  getInitialState() {
    return {
       checked: true,
       disabled: false,
       data:"",
       timeString:"",
       record:"",
       show: false
    };
  },
  handleCancel() {
    this.props.form.resetFields();
    this.props.hideModal();
  },
  componentWillReceiveProps(nextProps) {
      this.setState({
        record:nextProps.record
      })
  },
  show(){
    this.setState({
      show: !this.state.show
    })
  },
  render() {
    const {
      getFieldProps
    } = this.props.form;
    // console.log(this.props.form)
    var props = this.props;
    var state = this.state;
   var modalBtnstwo= [
      <button key="back" className="ant-btn" onClick={this.handleCancel}>关闭</button>,
    ];
    const formItemLayout = {
      labelCol: {
        span: 4
      },
      wrapperCol: {
        span: 6
      },
    };
    const formItemLayouttwo = {
      labelCol: {
        span: 8
      },
      wrapperCol: {
        span: 16
      },
    };
 
 
    return (
      <Modal title={props.title} visible={props.visible} onCancel={this.handleCancel} width="900" footer={modalBtnstwo} maskClosable={false} >
         <Form horizontal  form={this.props.form}>
           <Row>
            <Col span="12">
              <FormItem  {...formItemLayouttwo} label="学历:">
                  <Input {...getFieldProps('education', { initialValue: '' }) } disabled={true} />
              </FormItem>
                <FormItem  {...formItemLayouttwo} label="是否学生:">
                    <Input {...getFieldProps('isStudent', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="是否有工作:">
                    <Input {...getFieldProps('isWork', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="工作地址:">
                    <Input {...getFieldProps('workAddr', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="公积金:">
                    <Input {...getFieldProps('pubFund', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="联系人数量:">
                    <Input {...getFieldProps('contactsNum', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="手机实名月数:">
                    <Input {...getFieldProps('mobRealMons', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="三号是否统一:">
                    <Input {...getFieldProps('is3codeUnify', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="花呗额度:">
                    <Input {...getFieldProps('hbLimit', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="借呗额度:">
                    <Input {...getFieldProps('jbLimit', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="芝麻分:">
                    <Input {...getFieldProps('zhimaScore', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="基金:">
                    <Input {...getFieldProps('fund', { initialValue: '' }) } disabled={true} />
                </FormItem>

            </Col>
            <Col span="12">
                <FormItem  {...formItemLayouttwo} label="余额:">
                    <Input {...getFieldProps('balance', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="余额宝:">
                    <Input {...getFieldProps('yuEBao', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="招财宝:">
                    <Input {...getFieldProps('zhaoCaiBao', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="存金宝:">
                    <Input {...getFieldProps('cunJinBao', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="淘宝理财:">
                    <Input {...getFieldProps('tbLiCai', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="淘宝实名:">
                    <Input {...getFieldProps('tbName', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="淘宝认证身份证:">
                    <Input {...getFieldProps('tbIdCard', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="淘宝认证邮箱:">
                    <Input {...getFieldProps('tbEmail', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="淘宝认证手机号:">
                    <Input {...getFieldProps('tbMobile', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="反欺诈评分:">
                    <Input {...getFieldProps('antiFraudScore', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="是否有支付宝负面:">
                    <Input {...getFieldProps('zfbNegative', { initialValue: '' }) } disabled={true} />
                </FormItem>
                <FormItem  {...formItemLayouttwo} label="紧急联系人:">
                    <Input {...getFieldProps('exigentContacts', { initialValue: '' }) } disabled={true} />
                </FormItem>

            </Col>
         </Row>
        </Form>
      </Modal>
    );
  }
});
Detail = createForm()(Detail);
export default Detail;