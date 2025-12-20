package br.com.michael.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.michael.projeto.entity.UserEntity;

public class UserDTO {
	
	private Long id;
			
	private String name;
	
	private String login;
	
	private String password;
	
	private String email;
	
	public UserDTO(UserEntity	user) {
		BeanUtils.copyProperties(user, this);
	}
	
	public UserDTO() {
		
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassoword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
