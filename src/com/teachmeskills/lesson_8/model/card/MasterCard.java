package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double amount, String country) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.country = country;
    }


    @Override
    public boolean checkCardLimitTransfer(int transferAmount) {
        return Constants.MASTER_CARD_LIMIT >= transferAmount;
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит

        // это пока стоит как ответ-заглушка
    }
}
