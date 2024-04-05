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
    // public Object before(Object o){

    // }
    // public Object after(Object o){

    // }
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
