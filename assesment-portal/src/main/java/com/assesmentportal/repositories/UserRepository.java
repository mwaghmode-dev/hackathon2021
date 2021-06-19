package com.assesmentportal.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assesmentportal.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
