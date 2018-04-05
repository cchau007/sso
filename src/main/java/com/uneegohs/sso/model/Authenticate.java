package com.uneegohs.sso.model;

public class Authenticate {

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
			System.out.println("inside authenticate user action class");
			if((userid.equals("chetan")) && (password.equals("java"))) {
				String result="success";
				return result;
			}
			else {
				String result ="failure";
				return result;
			}
		}
}
