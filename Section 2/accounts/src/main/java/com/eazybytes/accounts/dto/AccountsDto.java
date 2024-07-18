package com.eazybytes.accounts.dto;

import lombok.Data;

//Lombook - Annotation for Getter Setter RequiredArgsConstrcutor Equals and HashCode
@Data
public class AccountsDto {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
