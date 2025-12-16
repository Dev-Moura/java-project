package br.com.michael.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.michael.projeto.entity.UserEntity;

public class UserDTO {
	
	private Long id;
			
	private String nome;
	
	private String senha;
	
	private String email;
	
	public UserDTO(UserEntity	usuario) {
		BeanUtils.copyProperties(usuario, this);
	}
	
	public UserDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
