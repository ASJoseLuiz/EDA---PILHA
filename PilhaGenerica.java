package PILHA;

public class PilhaGenerica<T> implements Stack<T>{

    private final int MAX = 4;
    private Object[] array;
    private int top;

    public PilhaGenerica(){
        this.array = new Object[MAX];
        this.top = -1; // Inicializa o topo como -1, indicando que a pilha está vazia
    }

    @Override
    public void push(T element) throws StackOverFlowException {
        if(isFull()){
            throw new StackOverFlowException();
        }
        else{
            top++;
            array[top] = element;
        }
    }

    @Override
    public T pop() throws StackUnderFlowException {
        if(isEmpty()){
            throw new StackUnderFlowException();
        }
        
        @SuppressWarnings("unchecked")
        T element = (T) array[top];
        top--;
        return element;
    }

    @Override
    public T top() throws StackUnderFlowException{
        if(isEmpty()){
            throw new StackUnderFlowException();
        }

        @SuppressWarnings("unchecked")        
        T element = (T) array[top];
        return element;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == MAX - 1;
    }

}
