package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//Use : inherited method : List<User> findAll()
	@Query("Select u from User u Where email = ?1 and password = ?2")
	public User findByEmail(String email, String Password);

//	@Modifying
//	@Query(value= "Update User set email=?1 where userId=?2", nativeQuery = true )
//	public User updateDetails( User detachedUser  );
//	

}
