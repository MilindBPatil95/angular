package com.adminservice.entity;

public class JwtResponse {

  private String token;
  
  public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

public JwtResponse() {
	// TODO Auto-generated constructor stub
}

public JwtResponse(String token) {
	this.token = token;
}


  
}
