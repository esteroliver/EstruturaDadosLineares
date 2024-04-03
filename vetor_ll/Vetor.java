class Vetor{
    private No first, last;
    private int tm;
    public Vetor(){
        first = new No(null);
        last = new No(null);
        tm = 0;
    }

    public int size(){
        return tm;
    }

    public boolean isEmpty(){
        if(tm == 0) return true;
        return false;
    }

    public void insertAtRank(int i, Object o){
        if(i == 0 && tam == 0){
            first.setElemento(o);
            last.setElemento(o);
            last.setProximo(null);
            first.setProximo(null);
            tm++;
        }
        else if(i == 0){
            No novo_no = new No(o);
            novo_no.setProximo(first);
            first = novo_no;
        }
        else if(i < tm){
            No aux = new No(null);
            aux = first;
            for(int j = 0; j < i; j++){
                aux = aux.proximo();
            }
            No novo_no = new No(o);
            novo_no.setProximo(aux.proximo());
            aux.setProximo(novo_no);
        }
        else if(i == tm){
            No novo_no = new No(o);
            novo_no.setProximo(null);
            last.setProximo(novo_no);
            last = novo_no;
        }
    }

    public Object removeAtRank(int i){
        if(i == 0){
            Object elem = first.getElemento();
            first = first.getProximo();
            return elem;
        }
        if(i == tam){
            Object elem = last.getElemento();
            //implementar laço
            return elem;
        }
        No aux = new No(null);
        aux = first;
        for(int j = 0; j < i; j++){
            aux = aux.getProximo();
        }



    }
}