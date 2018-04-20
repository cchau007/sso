package com.uneegohs.sso.model;

import org.springframework.stereotype.Component;
import com.jdbc.DatabaseConnection;
import com.jdbc.UsersTable;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;

@Component
public class Authenticate extends ActionSupport{

		String userid;
		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		String password;
		
		public String authenticateUser() {
			String msg="";
			Connection conn=null;
			try{
				conn = DatabaseConnection.getDBConnection();
				conn.setAutoCommit(false);
				
					boolean result = UsersTable.validateLogin(userid,password,conn);
					if(result==true)
						 msg="success";
					else
						msg="failure";
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			/*if((userid.equals("")) && (password.equals(""))) {
				String result="success";
				return result;
			}
			else {
				String result ="failure";
				return result;
			}*/
		
		return msg;
		}
}
