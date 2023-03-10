package com.emsi.ebankservices.entities;

import com.emsi.ebankservices.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Date dateCreation;
    private Double solde;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
