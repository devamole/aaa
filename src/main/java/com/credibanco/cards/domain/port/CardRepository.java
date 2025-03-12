package com.credibanco.cards.domain.port;

import com.credibanco.cards.domain.model.Card;
import java.util.Optional;

public interface CardRepository {
    Card save(Card card);
    Optional<Card> findByCardNumber(String cardNumber);
}

