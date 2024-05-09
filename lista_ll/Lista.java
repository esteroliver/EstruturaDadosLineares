class Lista{
    private No first, last;
    private int tam;
    
    public Lista(){
        first = null;
        last = null;
        tam = 0;
    }

/**

**Métodos de acesso**

- prev(p) - retorna o nó antes do nó p.
- next(p) - retorna o nó depois do nó p.

**Métodos de atualização**

- replaceElement(p,o) - troca o valor do elemento do nó p, colocando o valor do segundo parâmetro.
- swapElements(p,q) - troca os valores dos elementos de dois nós. O valor do elemento de p vai para q, e o valor do elemento de q vai para q.
- insertBefore(p,o) - inserir antes do nó p um novo nó com valor o.
- insertAfter(p,o) - inserir depois do nó p um novo nó com valor o.
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
}

class EListaVazia extends RuntimeException {
	public EListaVazia(String err) {
		super(err);
	}
}
