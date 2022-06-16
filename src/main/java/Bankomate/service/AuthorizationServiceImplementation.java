package Bankomate.service;

import Bankomate.entity.Card;
import Bankomate.exceptions.CriticalLoginFailException;
import Bankomate.exceptions.LoginFailException;

public class AuthorizationServiceImplementation implements AuthorizationService {
    private int triesCount = 3;

    public void logIn(Card card, int pin) throws LoginFailException {
     if (card.getPinCode() != pin){
         triesCount--;
         throw new LoginFailException(triesCount);
     }
    }

    public void logOut() {
    if (triesCount == 0){
        throw new CriticalLoginFailException();
    }
    }
}
