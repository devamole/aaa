package com.credibanco.cards.infraestructure.persistence.repository;

import com.credibanco.cards.infraestructure.persistence.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CardJpaRepository extends JpaRepository<CardEntity, Long> {
    Optional<CardEntity> findByCardNumber(String cardNumber);
}

