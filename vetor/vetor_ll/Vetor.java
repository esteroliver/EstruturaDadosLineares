class Vetor{
    private No first, last;
    private int tam;
    /**
     * TODO
     *  Implementar com lista duplamente ligada:
     *  - insertAtRank
     *  - removeAtRank
     *  - elemAtRank
     *  - replaceAtRank
     */
    public Vetor(){
        first = null;
        last = null;
        tam = 0;
    }

    public int size(){
        return tam;
    }

    public boolean isEmpty(){
        if(tam == 0) return true;
        return false;
    }

    public void insertAtRank(Integer i, Object o){
        if(tam == 0 && i == 0){
            No novo_no = new No(o);
            first = novo_no;
            last = novo_no;
        }
        else if(i == 0){
            No novo_no = new No(o);
            novo_no.setProximo(first);
            first.setAnterior(novo_no);
            first = novo_no;
        }
        else if(i < tam){ //inserir no meio
            No novo_no = new No(o);
        
            No aux = first;
            for(int j = 0; j < i; j++){
                aux = aux.getProximo();
            }
            No aux_a = aux.getAnterior(); 

            aux_a.setProximo(novo_no);
            novo_no.setAnterior(aux_a);

            aux.setAnterior(novo_no);
            novo_no.setProximo(aux);

            if(i == 0) first = novo_no;
        }
        else if(i == tam){
            No novo_no = new No(o);

            last.setProximo(novo_no);
            novo_no.setAnterior(last);
            last = novo_no;
        }
        else throw new EForaIndice("Índice inválido.");
        tam++;
    }

    public Object removeAtRank(Integer i){
        if(i < tam && tam != 0){
            No remove = new No(null); 
            remove = first;
            for(int j = 0; j < i; j++){
                remove = remove.getProximo();
            }
            Object elem = remove.getElemento();
            No aux1 = new No(null);
            aux1 = remove.getAnterior();
            No aux2 = new No(null);
            aux2 = remove.getProximo();
            aux1.setProximo(aux2);
            aux2.setAnterior(aux1);
            tam--;
            return elem;
        }
        else throw new EForaIndice("Índice inválido ou lista vazia.");
    }

    public Object elemAtRank(Integer i){
        if(i == 0) return first.getElemento();
        else if( i < tam){
            No aux = first;
            for(int j = 0; j < i; j++){
                aux = aux.getProximo();
            }
            return aux.getElemento();
        }
        return -1;
    }

    public Object replaceAtRank(Integer i, Object o){
        if(i >= tam) throw new EForaIndice("Fora do índice da lista.");
        No aux = first;
        for(int j = 0; j < i; j++)
            aux = aux.getProximo();
        Object elem = aux.getElemento();
        aux.setElemento(o);
        return elem;
    }
}

class EForaIndice extends RuntimeException{
    public EForaIndice(String err) {
		super(err);
	}
}