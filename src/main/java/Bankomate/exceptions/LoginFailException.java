package Bankomate.exceptions;

public class LoginFailException extends Exception{
    public LoginFailException(int triesCount){
        super ("Wrong PIN! Tries left: " + triesCount);
    }
}
