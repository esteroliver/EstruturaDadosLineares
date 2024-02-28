public class pilha_ll {
    private int top = 0;
    private No last;
    private No first;
    public class pilha_ll(int value){
        top = 0;
        this.first = new No();
        this.first.setElemento(null);
        this.last = new No();
        this.last.setElemento(null);
        this.first.setProximo(last);
    }
    public boolean estaVazio(){
        if(top == 0) return true;
        return false;
    }
    public void push(Object x){
        if(top == 0){
            No e = new No();
            e.setElemento(x);
            e.setProximo(null);
            first = e;
            last = e;
        }
        else{
            No e = new No();
            e.setElemento(x);
            e.setProximo(null);
            last.setProximo(e);
            last = e;
        }
        top++;
    }
    public Object objetoTopo(){
        return last.getElemento();
    }
    public Object pop(){
        if(top == 0) throw new ExceptionInInitializerError();
        if(first == last){
            No elemento = new No();
            elemento = first;
            first.setElemento(null);
            last.setElemento(null);
            return elemento;
        }
        No apagar = new No();
        apagar = first;
        while(apagar.getProximo() != last){
            apagar = apagar.getProximo();
        }
        No retorno = new No();
        retorno = last;
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
