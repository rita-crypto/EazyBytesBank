package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.Customerdto;

public interface IAccountsService {

    //@param customerDto - CustomerDto object
    void createAccount(Customerdto customerdto);

    Customerdto fetchAccount(String mobileNumber);

    boolean updateAccount(Customerdto customerdto);

    boolean deleteAccount(String mobileNumber);

    }
}
