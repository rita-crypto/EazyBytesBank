package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository<accountNumber> extends JpaRepository<Account, accountNumber> {
}
