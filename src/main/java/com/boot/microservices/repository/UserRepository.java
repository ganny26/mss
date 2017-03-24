package com.boot.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	@Query("select u from User u where LOWER(u.ACCOUNT_NUMBER)= LOWER(:ACCOUNT_NUMBER)")
    User validateByUserName(@Param("ACCOUNT_NUMBER") Integer ACCOUNT_NUMBER);
}