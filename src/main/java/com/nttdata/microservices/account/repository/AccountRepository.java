package com.nttdata.microservices.account.repository;

import com.nttdata.microservices.account.entity.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;


public interface AccountRepository extends ReactiveMongoRepository<Account, String>, AccountCustomRepository {

  Mono<Account> findByAccountNumber(String accountNumber);

  Mono<Account> findByAccountNumberAndClientDocumentNumber(String accountNumber, String documentNumber);

}
