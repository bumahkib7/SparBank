package org.codewarrior.sparbank.repo;

import org.codewarrior.sparbank.models.Bankdetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankDetailsRepo extends MongoRepository<Bankdetails, Long> {


}
