package com.anar.paymentservice2.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@EqualsAndHashCode(of = {"id"})
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentEntity {


    @Id
    @GeneratedValue(strategy =IDENTITY)
    private long id ;

    private BigDecimal amount ;

    @Column(name= "user_name")
    private String name ;
}
