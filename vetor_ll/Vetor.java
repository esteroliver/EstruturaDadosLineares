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
        first = new No(null);
        last = new No(null);
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
            first.setElemento(o);
            last.setElemento(o);

            first.setProximo(null);
            last.setProximo(null);

            first.setAnterior(null);
            last.setAnterior(null);

            tam++;
        }
        else if(i < tam){ //inserir no meio
            No novo_no = new No(o);
        
            No aux = new No(null); 
            aux = first;
            for(int j = 0; j < i; j++){
                aux = aux.getProximo();
            }
            No aux_a = new No(null);
            aux_a = aux.getAnterior();

            aux_a.setProximo(novo_no);
            novo_no.setAnterior(aux_a);

            aux.setAnterior(novo_no);
            novo_no.setProximo(aux);

            if(i == 0) first = novo_no;
            
            tam++;
        }
        else if(i == tam){
            No novo_no = new No(o);

            last.setProximo(novo_no);
            novo_no.setAnterior(last);
            last = novo_no;

            tam++;
        }
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
    // public void insertAtRank(int i, Object o){
    //     if(i == 0 && tam == 0){
    //         first.setElemento(o);
    //         last.setElemento(o);
    //         last.setProximo(null);
    //         first.setProximo(null);
    //         tm++;
    //     }
    //     else if(i == 0){
    //         No novo_no = new No(o);
    //         novo_no.setProximo(first);
    //         first = novo_no;
    //     }
    //     else if(i < tm){
    //         No aux = new No(null);
    //         aux = first;
    //         for(int j = 0; j < i; j++){
    //             aux = aux.proximo();
    //         }
    //         No novo_no = new No(o);
    //         novo_no.setProximo(aux.proximo());
    //         aux.setProximo(novo_no);
    //     }
    //     else if(i == tm){
    //         No novo_no = new No(o);
    //         novo_no.setProximo(null);
    //         last.setProximo(novo_no);
    //         last = novo_no;
    //     }
    // }

    // public Object removeAtRank(int i){
    //     if(i == 0){ //remover primeiro elemento
    //         Object elem = first.getElemento();
    //         first = first.getProximo();
    //         return elem;
    //     }
    //     else if(i < tam){ //menor do que tamanho
    //         No aux = new No(null);
    //         aux = first;
    //         for(int j = 0; j < i; j++){
    //             aux = aux.getProximo();
    //         }
    //         Object elem = aux.getElemento();
    //         No aux_p = new No(null);
    //         aux_p = aux.getProximo().getProximo();
    //         aux.setProximo(aux_p);
    //         return elem;
    //     }
    //     else if(i == tam-1){ //remover o último
    //         Object elem = last.getElemento();
    //         No aux = new No(null);

    //     }
    // }
}

class EForaIndice extends RuntimeException{
    public EForaIndice(String err) {
		super(err);
	}
}