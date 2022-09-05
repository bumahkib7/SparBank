package org.codewarrior.sparbank.repo;

import org.codewarrior.sparbank.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, Long> {





}
