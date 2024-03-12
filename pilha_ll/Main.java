import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Pilha p = new Pilha();
        Scanner obj = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            p.push(obj.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(p.pop());
        }
    }
}