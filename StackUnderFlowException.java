package PILHA;

public class StackUnderFlowException extends Exception{
    public StackUnderFlowException(){
        super("Pilha Vazia");
   }
}
