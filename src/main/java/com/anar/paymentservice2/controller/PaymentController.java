package com.anar.paymentservice2.controller;

import com.anar.paymentservice2.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/v1/payments")
@RequiredArgsConstructor



public class PaymentController {

    private final PaymentService paymentService;


@PostMapping
    public void pay (@RequestParam String userName, @RequestParam BigDecimal amount){
        paymentService.pay(userName, amount);
    }



}
