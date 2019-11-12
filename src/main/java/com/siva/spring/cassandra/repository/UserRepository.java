/**
 * 
 */
package com.siva.spring.cassandra.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.siva.spring.cassandra.model.User;

/**
 * @author Siva
 *
 */
public interface UserRepository extends CassandraRepository<User, Integer> {

	



	List<User> findByAgeGreaterThan(int age);

}
