class Pilha{
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
        return array[top];
    }

    public int pop(){
        if(isEmpty()) throw new EPilhaVazia("Pilha vazia.");
        if(top >= array.length*0.25){
            int[] aux = new int[array.length/2 + 1];
            for(int i = 0; i <= top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        top--;
        return array[top + 1];
    }

    public void push(int x){
        if(array.length - 1 == top){
            int[] aux = new int[array.length*2];
            for(int i = 0; i <= top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        top++;
        array[top] = x;
        if(top >= array.length*0.25){
            int[] aux = new int[array.length/2 + 1];
            for(int i = 0; i <= top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
    }
}

class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}