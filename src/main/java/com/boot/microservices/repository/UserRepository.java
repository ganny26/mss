package com.boot.microservices.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends  Repository<User, Integer> {

	
	@Query("select u from User u where LOWER(u.account_number)= LOWER(:ACCOUNT_NUMBER)")
    User validateByUserName(@Param("ACCOUNT_NUMBER") Integer ACCOUNT_NUMBER);
}