package Bankomate.exceptions;

public class CriticalLoginFailException extends RuntimeException{
    public CriticalLoginFailException() {
        super ("No more tries, the card has been blocked. See you in the bank!");
    }
}
