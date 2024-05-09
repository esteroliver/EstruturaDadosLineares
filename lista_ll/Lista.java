class Lista{
    private No first, last;
    private int tam;
    
    public Lista(){
        first = null;
        last = null;
        tam = 0;
    }

/**
 * **Métodos genéricos**

- size()
- isEmpty()

**Métodos de consulta**

- isFirst(p)
- isLast(p)

**Métodos de acesso**

- first()
- last()
- prev(p) - retorna o nó antes do nó p.
- next(p) - retorna o nó depois do nó p.

**Métodos de atualização**

- replaceElement(p,o) - troca o valor do elemento do nó p, colocando o valor do segundo parâmetro.
- swapElements(p,q) - troca os valores dos elementos de dois nós. O valor do elemento de p vai para q, e o valor do elemento de q vai para q.
- insertBefore(p,o) - inserir antes do nó p um novo nó com valor o.
- insertAfter(p,o) - inserir depois do nó p um novo nó com valor o.
- insertFirst(p) - inserir no início da lista o nó p.
- insertLast(p) - inserir no final da lista o nó p.
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

}