package com.devsuperior.devvendas.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_sales", schema = "public")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private OffsetDateTime date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "seller_id")
    private Seller seller;

}
