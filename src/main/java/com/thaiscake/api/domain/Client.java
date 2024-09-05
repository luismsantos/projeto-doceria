package com.thaiscake.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "client")
@Entity
public class Client {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private int age;

    private String address;

    private String cpf;
}
