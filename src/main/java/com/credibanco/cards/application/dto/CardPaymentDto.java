package com.credibanco.cards.application.dto;

import jakarta.validation.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class CardPaymentDto {
    @NotNull
    @DecimalMin(value = "0.01", message = "El monto debe ser mayor a cero.")
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

