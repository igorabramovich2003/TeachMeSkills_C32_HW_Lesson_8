package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

public class VisaCard extends BaseCard{

    int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double amount, int cashback) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.cashback = cashback;
    }


    @Override
    public boolean checkCardLimitTransfer(int transferAmount) {
        return Constants.VISA_CARD_LIMIT >= transferAmount;
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит

        // это пока стоит как ответ-заглушка
    }
}
