package com.anar.paymentservice2.service;

import com.anar.paymentservice2.dao.entity.PaymentEntity;
import com.anar.paymentservice2.dao.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public void pay(String usernName, BigDecimal amount) {
        var payment = PaymentEntity.builder()
                .name(usernName)
                .amount(amount)
                .build() ;



        System.out.println("Username: " + usernName + "amount: " + amount);
    }
}
