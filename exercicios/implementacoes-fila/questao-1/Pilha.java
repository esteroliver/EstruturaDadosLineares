public class Pilha {
    private int top = 0;
    private No last;
    private No first;
    public Pilha(){
        top = 0;
        this.first = new No();
        this.first.setElemento(null);
        this.last = new No();
        this.last.setElemento(null);
    }
    public boolean estaVazio(){
        if(top == 0) return true;
        return false;
    }
    public int tamanho(){
        return top;
    }
    public void push(Object x){
        No e = new No();
        e.setElemento(x);
        e.setProximo(null);
        if(top == 0){
            first = e;
        }
        else{
            last.setProximo(e);
        }
        last = e;
        top++;
    }
    public Object objetoTopo(){
        if(estaVazio()) throw new EPilhaVazia("Pilha vazia.");
        return last.getElemento();
    }
    public Object pop(){
        if(top == 0) throw new EPilhaVazia("Pilha vazia.");
        if(first == last){
            Object elemento = new Object();
            elemento = first.getElemento();
            first.setElemento(null);
            last.setElemento(null);
            first.setProximo(null);
            last.setProximo(null);
            return elemento;
        }
        No apagar = new No();
        apagar = first;
        while(apagar.getProximo() != last){
            apagar = apagar.getProximo();
        }
        Object retorno = new Object();
        retorno = last.getElemento();
        apagar.setProximo(null);
        last = apagar;
        top--;
        return retorno;
    }
}

class No{
    private Object elemento;
    private No proximo;
    public Object getElemento(){
        return elemento;
    }
    public void setElemento(Object o){
        elemento = o;
    }
    public No getProximo(){
        return proximo;
    }
    public void setProximo(No n){
        proximo = n;
    }
}

class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}