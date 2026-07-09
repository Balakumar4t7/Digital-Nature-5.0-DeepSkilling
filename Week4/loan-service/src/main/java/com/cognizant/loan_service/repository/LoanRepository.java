package com.cognizant.loan_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.loan_service.entity.Loans;

@Repository
public interface LoanRepository extends JpaRepository<Loans, Long > {

}
