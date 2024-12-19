package com.reletion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reletion.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long>{
	
	// This is custom search method JPQL QUERY
    
    @Query("SELECT p FROM Profile p WHERE " +
           "p.address LIKE CONCAT('%', :query, '%')" +
           "Or p.phoneNumber LIKE CONCAT('%', :query, '%')" +
           "Or p.department LIKE CONCAT('%', :query, '%')" +
           "Or p.designation LIKE CONCAT('%', :query, '%')" )
    List<Profile> searchUserByProfile(String query); 

}
