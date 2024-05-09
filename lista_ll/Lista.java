class Lista{
    private No first, last;
    private int tam;
    
    public Lista(){
        first = null;
        last = null;
        tam = 0;
    }

/**

**Métodos de atualização**

- replaceElement(p,o) - troca o valor do elemento do nó p, colocando o valor do segundo parâmetro.
- swapElements(p,q) - troca os valores dos elementos de dois nós. O valor do elemento de p vai para q, e o valor do elemento de q vai para q.
- remove(p) - remover o nó p da lista.
 */

     public int size(){
        return tam;
     }
     public boolean isEmpty(){
        if(tam == 0) return true;
        return false;
     }
     public boolean isFirst(Object o){
        if(o == first.getElemento()) return true;
        return false;
     }
     public boolean isLast(Object o){
        if(o == last.getElemento()) return true;
        return false;
     }
     public Object first(){
        if(first != null) return first.getElemento();
        throw new EListaVazia("Lista vazia.");
     }
     public Object last(){
        if(last != null) return last.getElemento();
        throw new EListaVazia("Lista vazia.")
     }
     public Object before(Object o){
        No aux = new No();
        aux = first;
        while(aux.getElemento() != o){
            aux = aux.getProximo();
        }
        if(aux != null){
            return aux.getAnterior().getElemento();
        }
        throw new EListaVazia("Elemento não está na lista.");
     }
     public Object after(Object o){
        No aux = new No();
        aux = first;
        while(aux.getElemento() != o){
            aux = aux.getProximo();
        }
        if(aux != null){
            return aux.getProximo().getElemento();
        }
        throw new EListaVazia("Elemento não está na lista.");
     }
     public void insertFirst(Object o){
        No novo_no = new No(o);
        if(tam > 0){
            first.setAnterior(novo_no);
        }
        else{
            last = novo_no;
        }
        first = novo_no;
        tam++;
     }
     public void insertLast(Object o){
        No novo_no = new No(o);
        if(tam > 0){
            last.setProximo(novo_no);
        }
        else{
            first = novo_no;
        }
        last = novo_no;
        tam++;
     }
     public void insertBefore(Object o){
        No novo_no = new No(o);
        No aux1 = new No();
        aux1 = first;
        while(aux1.getElemento() != o){
            aux1 = aux1.getProximo();
        }
        No aux2 = new No();
        aux2 = aux1.getAnterior();
        aux2.setProximo(novo_no);
        aux1.setAnterior(novo_no);
     }
     public void insertAfter(Object o){
        No novo_no = new No(o);
        No aux1 = new No();
        aux1 = first;
        while(aux1.getElemento() != o){
            aux1 = aux1.getProximo();
        }
        No aux2 = new No();
        aux2 = aux1.getProximo();
        aux1.setProximo(novo_no);
        aux2.setAnterior(novo_no);
     }
}

class EListaVazia extends RuntimeException {
	public EListaVazia(String err) {
		super(err);
	}
}
