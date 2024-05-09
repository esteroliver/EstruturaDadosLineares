import java.io.EOFException;

class Lista {
    private Object[] array;
    private Integer tam;
    public Lista(){
        array = new Object[1];
        tam = 0;
    }
    /**
     * MÉTODOS PARA ACESSAR
     * - before(n)
     * - after(n)
     * MÉTODOS PARA ATUALIZAR
     * - replaceElement(n, o)
     * - swapElements(n, q)
     * - insertBefore(n, o)
     * - insertAfter(n, o)
     * - remove(n)
     */
    public Integer size(){
        return tam;
    }
    public Boolean isEmpty(){
        if (tam == 0) return true;
        return false;
    }
    public Boolean isFirst(Object o){
        if (array[0] == o) return true;
        return false;
    }
    public Boolean isLast(Object o){
        if(array[tam-1] == o) return true;
        return false;
    }
    public Object first(){
        if(isEmpty()) throw new EListaVazia("Lista vazia.");
        return array[0];
    }
    public Object last(){
        if(isEmpty()) throw new EListaVazia("Lista vazia.");
        return array[tam-1];
    }
    public Object before(Object o){
        if(isEmpty()) throw new EListaVazia("Lista vazia.");
        if(tam == 1) throw new EListaVazia("Há apenas um elemento nessa lista.");
        int ant = 0;
        for(int i = 0; i < tam; i++){
            if(array[i] == o) break;
            ant = i;
        }
        if(array[ant] != null) return array[ant];
        else throw new EListaVazia("Elemento não existe.");
    }

    public Object after(Object o){
        if(isEmpty()) throw new EListaVazia("Lista vazia.");
        if(tam == 1) throw new EListaVazia("Há apenas um elemento nessa lista.");
        int post = 0;
        for(int i = tam-1; i >= 0; i--){
            post = i+1;
            if(array[i] == o) break;
        }
        if(array[post] != null) return array[post];
        else throw new EListaVazia("Elemento não existe.");
    }
    public void insertFirst(Object o){
        if(array.length == tam){
            Object aux[] = new Object[tam*2];
            for(int i = 0; i < tam; i++) 
                aux[i] = array[i];
            array = aux;
        }
        for(int i = tam; i > 0; i--)
            array[i] = array[i-1];
        array[0] = o;
        tam++;
    }
    public void insertLast(Object o){
        if(array.length == tam){
            Object aux[] = new Object[tam*2];
            for(int i = 0; i < tam; i++) 
                aux[i] = array[i];
            array = aux;
        }
        array[tam] = o;
        tam++;
    }
}

class EListaVazia extends RuntimeException {
	public EListaVazia(String err) {
		super(err);
	}
}
