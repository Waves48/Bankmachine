package Bankomate.service;

import Bankomate.entity.Card;
import Bankomate.exceptions.LoginFailException;
import Bankomate.exceptions.NotEnoughCashException;

public class CardServiceImpl implements CardService {

    private AuthorizationService authorizationService;
    private Card card;

    public CardServiceImpl(AuthorizationService authorizationService, Card card) {
        this.authorizationService = authorizationService;
        this.card = card;
    }

    public void cashIssue(int amount) throws NotEnoughCashException {
        if (card.getCashAmount() < amount) {
            throw new NotEnoughCashException();
        } else {
            card.setCashAmount(card.getCashAmount() - amount);

        }
    }

    public String viewBalance() {
        return String.valueOf(card.getCashAmount());
    }

    public String changePin(int oldPin, int newPin) throws LoginFailException {
        authorizationService.logIn(card, oldPin);
        card.setPinCode(newPin);
        return "PIN changed successfully!";
    }

    public String addCash(int amount) {

        return null;
    }
}
