package PILHA;

public interface Stack<T> {
    public void push(T element) throws StackOverFlowException;
    public T pop() throws StackUnderFlowException; 
    public T top() throws StackUnderFlowException;  
    public boolean isEmpty();
    public boolean isFull();
}
