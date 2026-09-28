package com.anar.paymentservice2.service;

import com.anar.paymentservice2.dao.entity.PaymentEntity;
import com.anar.paymentservice2.dao.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public void pay(String usernName, BigDecimal amount) {
        var payment = PaymentEntity.builder()
                .name(usernName)
                .amount(amount)
                .build();


        System.out.println("Username: " + usernName + "amount: " + amount);
    }

    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    public PaymentEntity getPaymentByEmail(String email) {
        return paymentRepository.findByEmail(email).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,"Payment not found with email: " + email)) ;
    }

}
