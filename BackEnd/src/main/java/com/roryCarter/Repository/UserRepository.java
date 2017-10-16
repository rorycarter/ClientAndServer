package com.roryCarter.Repository;

import com.roryCarter.Domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
