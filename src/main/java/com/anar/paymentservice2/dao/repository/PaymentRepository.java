package com.anar.paymentservice2.dao.repository;

import com.anar.paymentservice2.dao.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <PaymentEntity,Long>{
}
