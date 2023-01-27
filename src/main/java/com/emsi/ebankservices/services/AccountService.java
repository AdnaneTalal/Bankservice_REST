package com.emsi.ebankservices.services;

import com.emsi.ebankservices.dto.BankAccountRequestDTO;
import com.emsi.ebankservices.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);


}
