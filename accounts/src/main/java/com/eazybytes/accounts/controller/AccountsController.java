package com.eazybytes.accounts.controller;


import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.Customerdto;
import com.eazybytes.accounts.dto.Responsedto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @PostMapping("/create")
   private ResponseEntity<Responsedto> createAccount(@RequestBody Customerdto customerdto){

        return ResponseEntity.status(HttpStatus.CREATED).body(new Responsedto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
   }
}
