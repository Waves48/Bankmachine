package Bankomate.service;

import Bankomate.entity.Card;
import Bankomate.exceptions.LoginFailException;

public interface AuthorizationService { // все методы интерфейсов всегда public
    void logIn(Card card, int pin) throws LoginFailException;
    void logOut();

}
