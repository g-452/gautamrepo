package com.demo.beans;

public class User {
	
	
	private String fname,lname,gen,country,state,city,email,pass,cpass;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String fname, String lname, String gen, String country, String state, String city, String email,
			String pass, String cpass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gen = gen;
		this.country = country;
		this.state = state;
		this.city = city;
		this.email = email;
		this.pass = pass;
		this.cpass = cpass;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGen() {
		return gen;
	}


	public void setGen(String gen) {
		this.gen = gen;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getCpass() {
		return cpass;
	}


	public void setCpass(String cpass) {
		this.cpass = cpass;
	}


	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", gen=" + gen + ", country=" + country + ", state="
				+ state + ", city=" + city + ", email=" + email + ", pass=" + pass + ", cpass=" + cpass + "]";
	}

	
}
