package EnergiaSolar;

public class Pilha{
    private int array[];
    private int top = -1;

    public Pilha(int tam){
        array = new int[tam];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }

    public int objectTop(){
        if(isEmpty()) throw new EPilhaVazia("Pilha vazia.");
        return array[top-1];
    }

    public int pop(){
        if(isEmpty()) throw new EPilhaVazia("Pilha vazia.");
        top--;
        return array[top];
    }

    public void push(int x){
        if(array.length == top){
            int aux[];
            aux = new int[top*2];
            for(int i = 0; i < top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        array[top] = x;
        top++;
    }
}

class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}