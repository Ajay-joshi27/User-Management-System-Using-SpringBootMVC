/**
 * 
 */
package com.ajay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ajay.Entity.User;

/**
 * 
 */
@Component
public interface IUserRepo extends JpaRepository<User, Integer> {
          
}
