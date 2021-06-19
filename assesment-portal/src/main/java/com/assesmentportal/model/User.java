package com.assesmentportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	@Id
 private String id;
 private String firstName;
 private String lastName;
 private String email;
 private String password;
	private String supervisor;
 private String role;
	private String team;
	private String mobile;
	private String companyName;
	private String createdTime;

}
