package com.eazybytes.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Lombook
@Getter
@Setter
@ToString
//Super class for all entity classes
@MappedSuperclass 
public class BaseEntity {

    @Column(updatable=false)
    private LocalDateTime createdAt;

    @Column(updatable=false)
    private String createdBy;

    @Column(insertable=false)
    private LocalDateTime updatedAt;

    @Column(insertable=false)
    private String updatedBy;
}
