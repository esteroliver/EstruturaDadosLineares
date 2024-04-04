class Fila{
    private int tm;
    private No last;
    private No first;
    public Fila(){
        tm = 0;
        this.first = new No(null);
        this.last = new No(null);
    }
    public boolean estaVazio(){
        if(tm == 0) return true;
        return false;
    }
    public int tamanho(){
        return tm;
    }
    public void push(Object x){
        No e = new No(x);
        if(tm == 0){
            first = e;
        }
        else{
            last.setProximo(e);
        }
        last = e;
        tm++;
    }
    public Object pop(){
        if(tm == 0) throw new EFilaVazia("Fila vazia.");
        if(first == last){
            Object e = new Object();
            e = first.getElemento();
            first = null;
            last = null;
            return e;
        }
        Object a = new Object();
        a = first.getElemento();
        first = first.getProximo();
        tm--;
        return a;
    }
}

class No{
    private Object elemento;
    private No proximo;
    public No(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
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

class EFilaVazia extends RuntimeException {
	public EFilaVazia(String err) {
		super(err);
	}
}