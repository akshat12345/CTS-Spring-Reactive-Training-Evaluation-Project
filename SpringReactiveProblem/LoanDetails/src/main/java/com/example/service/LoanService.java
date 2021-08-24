package com.example.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


import com.example.model.Loan;

import reactor.core.publisher.Mono;

@Service
public interface LoanService {

	Mono<Loan> applyLoan(Loan loan);

	Mono<Loan> getLoanDetails(Integer id);

	Flux<Loan> getLoanDetailsByAccId(Integer id);

}
