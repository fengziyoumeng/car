package com.rongdu.cashloan.core.common.util.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Create {
	
	public static final Logger logger = LoggerFactory.getLogger(Create.class);
	public static void main(String[] args) {
		Create ot=new Create();
		ot.test();
	}
	
	public void test(){

		// 数据库连接信息
		String url = "jdbc:mysql://192.168.16.253:3306/big_dipper?characterEncoding=UTF-8";
		String MysqlUser = "root";
		String mysqlPassword = "yiqifu@123";
		
		// 数据库及数据表名称
		String database = "big_dipper";
		String table = "crm_user_detail";
		
		// 配置作者及Domain说明
		String classAuthor = "zwk";
		String functionName = "用户详细报表信息表";
		//类名前缀
		String classNamePrefix = "CrmUserDetail";


		// 公共包路径 (例如 BaseDao、 BaseService、 BaseServiceImpl)
		String commonName ="com.rongdu.cashloan.core.common";
		
		String packageName ="com.rongdu.cashloan.manage";
		String moduleName = "";

		//Mapper文件存储地址  默认在resources中
		String batisName = "config/mappers";
		String db="mysql";
		


		try {
			MybatisGenerate.generateCode(db,url, MysqlUser, mysqlPassword, database, table,commonName,packageName,batisName,moduleName,classAuthor,functionName,classNamePrefix);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
	}

}
