package day_49_Exceptions;

public class BreakTimeException extends RuntimeException {

public BreakTimeException(String message){
    super(message);

}
public BreakTimeException(){
    super("Its time for a short break.");
}

}
