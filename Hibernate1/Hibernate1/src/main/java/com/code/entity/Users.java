package com.code.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.mindrot.jbcrypt.BCrypt;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="users")
public class Users {
//member variable
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usersid")
	private int usersid;
	@Column(name="username",length=20,nullable=false,unique=true)
	private String username;
	@Column(name="password",length=255,nullable=false,unique=true)
	private String password;
	@Column(name="email",length=20,nullable=false,unique=true)
	private String email;
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable=false)
	private Role role;
	private String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }
		public Users() {
			this.usersid=0;
			this.username=null;
			this.password = hashPassword("");
			this.email=null;
			this.role=Role.CUSTOMER;
		}
		
		public Users(String username, String password, String email, Role role) {
			super();
			this.username = username;
			this.password =  hashPassword(password);
			this.email = email;
			this.role = role;
		}
		
		//getter and setter
		public int getUsersid() {
			return usersid;
		}

		public void setUsersid(int usersid) {
			this.usersid = usersid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		//Generate toString()
		@Override
		public String toString() {
			return "Users [usersid=" + usersid + ", username=" + username + ", password=" + password + ", email="
					+ email + ", role=" + role + "]";
		}

		
		
		
		
}
