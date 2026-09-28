package com.anar.paymentservice2.controller;

import com.anar.paymentservice2.dao.entity.PaymentEntity;
import com.anar.paymentservice2.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/v1/payments")
@RequiredArgsConstructor


public class PaymentController {

    private final PaymentService paymentService;


    @PostMapping
    public void pay(@RequestParam String userName, @RequestParam BigDecimal amount) {
        paymentService.pay(userName, amount);
    }


    @GetMapping
    public ResponseEntity<List<PaymentEntity>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<PaymentEntity> getPaymentByEmail(@PathVariable String email) {
        return ResponseEntity.ok(paymentService.getPaymentByEmail(email));
    }


}
