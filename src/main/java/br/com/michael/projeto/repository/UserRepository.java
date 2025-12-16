package br.com.michael.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michael.projeto.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
