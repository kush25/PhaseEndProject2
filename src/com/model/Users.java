package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	
	@Id
	String uname;
	String uemail,upassword,ucity;

	public Users(String uname, String uemail, String upassword, String ucity) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
		this.ucity = ucity;
	}
	
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}	

}
