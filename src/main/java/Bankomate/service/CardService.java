package Bankomate.service;

import Bankomate.entity.Card;
import Bankomate.exceptions.LoginFailException;
import Bankomate.exceptions.NotEnoughCashException;

public interface CardService {
    void cashIssue(int amount) throws NotEnoughCashException;
    String viewBalance ();
    String changePin (int oldPin, int newPin) throws LoginFailException;
    String addCash (int amount);

}
