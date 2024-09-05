package com.thaiscake.api.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Table(name = "order")
@Entity
public class Order {

    @Id
    @GeneratedValue

    private UUID id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String quantity;
}
