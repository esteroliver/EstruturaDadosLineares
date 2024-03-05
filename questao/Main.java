class Main{
    public static void main(String args[]){
        EnergiaSolar rua = new EnergiaSolar(5);
        rua.inserir(3);
        rua.inserir(6);
        rua.inserir(2);
        rua.inserir(7);
        rua.inserir(5);

        Pilha percorrer = new Pilha(5);
        percorrer.push(3);
        percorrer.push(6);
        percorrer.push(2);
        percorrer.push(7);
        percorrer.push(5);
        
        int x = 0;
        
        while(!percorrer.isEmpty()){
            percorrer = rua.criarLinhaForca(percorrer);
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
    public Pilha criarLinhaForca(Pilha percorrer){
        Pilha linha = new Pilha(2);
        Pilha resto = new Pilha(2);
        while(!percorrer.isEmpty()){
            int n1 = percorrer.pop();
            int n2 = percorrer.pop();
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
        return array[top-1];
    }

    public int pop(){
        top--;
        if(top == -1) throw new EPilhaVazia("Pilha vazia.");
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
        top++;
        array[top] = x;
    }
}

class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}