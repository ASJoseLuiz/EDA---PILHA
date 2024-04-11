package PILHA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        PilhaGenerica<Integer> s = new PilhaGenerica<>();
        Scanner sc = new Scanner(System.in);
        int ele = 0;
        int op = 0;
        do{
            System.out.println("1: Empilhar um Elemento na pilha \n2: Desempilhar um Elemento na Pilha \n3: Mostrar o Topo da Pilha \n4: Sair");
            op = sc.nextInt();
            try{
                if(op == 1){
                    System.out.println("Digite o elemento a ser empilhado: ");
                    ele = sc.nextInt();
                    s.push(ele);
                }
                else if(op == 2){
                    s.pop();
                    System.out.println("Topo Desempilhado");
                }
                else if(op == 3){
                    System.out.println("O elemento no topo é " + s.top());
                }
                
            }catch (StackOverFlowException | StackUnderFlowException e){
                e.printStackTrace();
            }
        }while(op != 4);
        sc.close();
    }  
}
