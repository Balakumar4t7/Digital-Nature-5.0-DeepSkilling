package com.cognizant.account_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.account_service.entity.copy.Account;

import jakarta.annotation.Resource;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
