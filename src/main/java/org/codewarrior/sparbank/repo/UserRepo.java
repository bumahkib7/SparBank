package org.codewarrior.sparbank.repo;

import org.codewarrior.sparbank.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {





}
