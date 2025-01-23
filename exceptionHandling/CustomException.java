package exceptionHandling;

public class CustomException extends Exception{//creating my own exception 
    public CustomException(String message){
        super(message);
    }
}
