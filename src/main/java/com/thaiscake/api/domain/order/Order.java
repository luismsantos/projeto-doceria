package com.thaiscake.api.domain.order;

import com.thaiscake.api.domain.client.Client;
import jakarta.persistence.*;

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
