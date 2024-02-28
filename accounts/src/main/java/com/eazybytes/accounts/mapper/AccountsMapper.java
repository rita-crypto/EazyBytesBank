package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.Accountdto;
import com.eazybytes.accounts.dto.Customerdto;
import com.eazybytes.accounts.entity.Account;
import com.eazybytes.accounts.entity.Customer;

public class AccountsMapper {

    public static Accountdto mapToAccountDto(Account account, Accountdto accountdto){
        accountdto.setAccountNumber(account.getAccountNumber());
        accountdto.setAccountType(account.getAccountType());
        accountdto.setBranchAddress(account.getBranchAddress());

        return accountdto;
    }

    public static Account mapToAccount(Accountdto accountdto, Account account){
        account.setAccountNumber(accountdto.getAccountNumber());
        account.setAccountType(accountdto.getAccountType());
        account.setBranchAddress(accountdto.getBranchAddress());

        return account;
    }

}
