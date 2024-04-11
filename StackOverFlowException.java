package PILHA;

public class StackOverFlowException extends Exception{
    public StackOverFlowException(){
        super("Pilha Cheia");
    }
}
