package io.codelex.testtwo.exercise1;

public class NotEnoughFundsException extends Exception{
    public NotEnoughFundsException(String inputMessage){
        super(inputMessage);
    }
}
