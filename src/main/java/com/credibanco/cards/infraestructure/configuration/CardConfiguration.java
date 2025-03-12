package com.credibanco.cards.infraestructure.configuration;

import com.credibanco.cards.application.service.CardService;
import com.credibanco.cards.application.service.CardServiceImpl;
import com.credibanco.cards.domain.port.CardRepository;
import com.credibanco.cards.infraestructure.persistence.adapter.CardRepositoryAdapter;
import com.credibanco.cards.infraestructure.persistence.repository.CardJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardConfiguration {

    @Bean
    public CardRepository cardRepository(CardJpaRepository cardJpaRepository) {
        return new CardRepositoryAdapter(cardJpaRepository);
    }

    @Bean
    public CardService cardService(CardRepository cardRepository) {
        return new CardServiceImpl(cardRepository);
    }
}

