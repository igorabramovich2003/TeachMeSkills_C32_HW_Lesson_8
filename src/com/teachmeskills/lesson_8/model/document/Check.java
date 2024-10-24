package com.teachmeskills.lesson_8.model.document;

import com.teachmeskills.lesson_8.model.card.BaseCard;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {

    public int transferAmount;
    public Date transferDate;
    public BaseCard card;

    public Check(int transferAmount, Date transferDate, BaseCard card) {
        this.transferAmount = transferAmount;
        this.transferDate = transferDate;
        this.card = card;
    }

    public void showCheckInformation(){
        System.out.println("Transfer from card: " + card.cardNumber + "\nAmount: " + transferAmount);
    }


}
