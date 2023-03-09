package com.app.dto;

import com.app.entities.Role;

public class UserAdd {
	
		
		private String firstName;
		private String lastName;
		private String email;
		private long mobile;
		private String password;
		private Role role;
		public UserAdd() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public UserAdd(String firstName, String lastName, String email, long mobile, String password, Role role) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.mobile = mobile;
			this.password = password;
			this.role = role;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Role getRole() {
			return role;
		}
		public void setRole(Role role) {
			this.role = role;
		}
		
}