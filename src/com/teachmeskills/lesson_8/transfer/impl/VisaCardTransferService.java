package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;
import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class VisaCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard sendingCard, BaseCard receivingCard, int amountTransfer) {
        //Добавил проверку чтобы сумма не была меньше нуля и комментарии
        if (sendingCard.checkCardLimitTransfer(amountTransfer) && amountTransfer > 0) {
            sendingCard.amount -= amountTransfer;
            receivingCard.amount += amountTransfer;
            return new Check(amountTransfer, new Date(), sendingCard, "success");
        }else if(amountTransfer <= 0){
            return new Check(amountTransfer, new Date(), sendingCard, "transfer amount is less than or equal to 0");
        }else {
            return new Check(Constants.VISA_CARD_LIMIT, new Date(), sendingCard, "limit exceeded error");
        }


    }

    @Override
    public Check transferFromCardToAccount(BaseCard sendingCard, Account receivingAccount, int amountTransfer) {
        //Добавил проверку чтобы сумма не была меньше нуля и комментарии
        if (sendingCard.checkCardLimitTransfer(amountTransfer) && amountTransfer > 0){
            sendingCard.amount -= amountTransfer;
            receivingAccount.amount += amountTransfer;
            return new Check(amountTransfer, new Date(), sendingCard, "success");
        }else if(amountTransfer <= 0){
            return new Check(amountTransfer, new Date(), sendingCard, "transfer amount is less than or equal to 0");
        }else {
            return new Check(Constants.VISA_CARD_LIMIT, new Date(), sendingCard, "limit exceeded error");
        }

    }
}
