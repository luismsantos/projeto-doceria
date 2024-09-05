package com.thaiscake.api.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "order-itens")
@Entity
public class OrderItens {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "order-id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product-id")
    private Product product;
}
