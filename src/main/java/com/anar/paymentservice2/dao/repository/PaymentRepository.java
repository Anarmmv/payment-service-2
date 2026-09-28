package com.anar.paymentservice2.dao.repository;

import com.anar.paymentservice2.dao.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository <PaymentEntity,Long>{
    Optional<PaymentEntity> findByEmail(String email);
}
