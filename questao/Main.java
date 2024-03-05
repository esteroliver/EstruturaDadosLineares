class Main{
    public static void main(String args[]){
        //{8,6,10,4,1,5,3} 
        EnergiaSolar rua = new EnergiaSolar(7);
        rua.inserir(8);
        rua.inserir(6);
        rua.inserir(10);
        rua.inserir(4);
        rua.inserir(1);
        rua.inserir(5);
        rua.inserir(3);

        Pilha percorrer = new Pilha(7);
        percorrer.push(8);
        percorrer.push(6);
        percorrer.push(10);
        percorrer.push(4);
        percorrer.push(1);
        percorrer.push(5);
        percorrer.push(3);
        
        int x = 0;
        
        while(!percorrer.isEmpty()){
            percorrer = rua.criarLinhaForca(percorrer,7);
            x++;
        }
        System.out.println(x);
    }
}
class EnergiaSolar{
    private int en[];
    private int i;
    private Pilha linha_forca;
    
    public EnergiaSolar(int tam){
        en = new int[tam];
        linha_forca = new Pilha(tam);
        i = 0;
    }
    public void inserir(int e){
        en[i] = e;
        i++;
    }
    public Pilha criarLinhaForca(Pilha percorrer, int tam){
        Pilha linha = new Pilha(tam);
        Pilha resto = new Pilha(tam);
        while(!percorrer.isEmpty()){
            int n1 = percorrer.pop();
            int n2 = 0;
            if(percorrer.size() > 1){
                n2 = percorrer.pop();
                percorrer.push(n2);
            }
            if(n1 > n2){
                linha.push(n1);
                resto.push(n2);
            }
            else{
                linha.push(n1);
                linha.push(n2);
            }
        }
        linha_forca = resto;
        return linha_forca;
    }   
}
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
        top--;
        return array[top + 1];
    }

    public void push(int x){
        if(array.length - 1 == top){
            int[] aux = new int[top*2];
            for(int i = 0; i <= top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        top++;
        array[top] = x;
    }
}

class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}