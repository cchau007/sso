package com.uneegohs.sso.model;

public class Registration {
	String memid;
	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getRegistrationPassword() {
		return registrationPassword;
	}

	public void setRegistrationPassword(String registrationPassword) {
		this.registrationPassword = registrationPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getRegistrationEmail() {
		return registrationEmail;
	}

	public void setRegistrationEmail(String registrationEmail) {
		this.registrationEmail = registrationEmail;
	}

	public String getRegistrationConfirmEmail() {
		return registrationConfirmEmail;
	}

	public void setRegistrationConfirmEmail(String registrationConfirmEmail) {
		this.registrationConfirmEmail = registrationConfirmEmail;
	}
	public boolean isUserRegistered() {
		return isUserRegistered;
	}

	public void setUserRegistered(boolean isUserRegistered) {
		this.isUserRegistered = isUserRegistered;
	}

	boolean isUserRegistered;
	String fName;
	String lName;
	String registrationPassword;
	String phone;
	String ssn;
	String registrationEmail;
	String registrationConfirmEmail;

	
	
	public String registerNewUser(){
		String output;
		if((fName!=null) && (lName!=null) && (memid!=null) && (registrationPassword!=null) && (phone!=null) && (ssn!=null) && (registrationEmail!=null) && (registrationConfirmEmail!=null)) {
		isUserRegistered = true;
		}
		else {
			isUserRegistered = false;
		}
		return "success";
}
}
