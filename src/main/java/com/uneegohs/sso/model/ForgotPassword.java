package com.uneegohs.sso.model;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class ForgotPassword extends ActionSupport{
	String forgotPasswordEmailID;
	public String getForgotPasswordEmailID() {
		return forgotPasswordEmailID;
	}

	public void setForgotPasswordEmailID(String forgotPasswordEmailID) {
		this.forgotPasswordEmailID = forgotPasswordEmailID;
	}
	
	public String getIsPasscodeValid() {
		return isPasscodeValid;
	}

	public void setIsPasscodeValid(String isPasscodeValid) {
		this.isPasscodeValid = isPasscodeValid;
	}

	public String isPasscodeValid;

	public boolean isPasscodeSent() {
		return isPasscodeSent;
	}

	public void setPasscodeSent(boolean isPasscodeSent) {
		this.isPasscodeSent = isPasscodeSent;
	}

	boolean isPasscodeSent;
	public boolean isSetNewPassword() {
		return setNewPassword;
	}

	public void setSetNewPassword(boolean setNewPassword) {
		this.setNewPassword = setNewPassword;
	}

	boolean setNewPassword;
	
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

	String newPassword;
	String confirmNewPassword;
	
	public String forgotPassword() {
		if (forgotPasswordEmailID.equals("chetancc609@gmail.com")) {
			isPasscodeSent = true;
		}
		else {
			isPasscodeSent = false;
		}
		return "success";
	}
	
	public String validatePasscode() {
		if(isPasscodeSent=true && isPasscodeValid.equals("abc1234")) {
			setNewPassword=true;
		}
		else {
			setNewPassword=false;
		}
		return "success";
	}
	
	public String setNewPassword() {
		return null;
	}
	
	
}