package com.credibanco.cards.application.service;

import com.credibanco.cards.domain.model.Card;
import com.credibanco.cards.domain.model.CardType;
import java.math.BigDecimal;

public interface CardService {
    Card createCard(String productId, String titularName, CardType cardType);
    Card rechargeCard(String cardNumber, BigDecimal amount);
    Card debitCard(String cardNumber, BigDecimal amount);
    Card getCard(String cardNumber);
}