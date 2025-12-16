package br.com.michael.projeto.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.michael.projeto.dto.UserDTO;
import br.com.michael.projeto.entity.UserEntity;
import br.com.michael.projeto.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDTO> listAll() {
		List<UserEntity> users = userRepository.findAll();
		return users.stream().map(UserDTO::new).toList();
		}
	
	public void insert(UserDTO user) {
		UserEntity userEntity = new UserEntity(user);
		userRepository.save(userEntity);
	}
	
	public UserDTO update(UserDTO user) {
		UserEntity userEntity = new UserEntity(user);
		return new UserDTO(userRepository.save(userEntity));
	}
	
	public void delete(Long id) {
		UserEntity user = userRepository.findById(id).get();
		userRepository.delete(user);
	}
	
	public UserDTO findById(Long id) {
		UserEntity user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User not found"));
		return new UserDTO(user);
	}
}
