class FilaComPilha{
    private Pilha p1;
    private Pilha p2;
    private int tm;

    public FilaComPilha(){
        tm = 0;
        p1 = new Pilha(1);
        p2 = new Pilha(1);
    }
    public int tamanho(){
        return tm;
    }
    public boolean estaVazio(){
        if(tm == 0) return true;
        return false;
    }
    public Object objetoTopo(){
        if(estaVazio()) throw new EFilaVazia("Fila vazia.");
        for(int i = 0; i < tm; i++){
            p2.push(p1.pop());
        }
        Object r = p2.objectTop();
        for(int i = 0; i < tm; i++){
            p1.push(p2.pop());
        }
        return r;
    }
    public void push(Object o){
        p1.push(o);
        tm++;
    }
    public Object pop(){
        if(estaVazio()) throw new EFilaVazia("Fila vazia.");
        for(int i = 0; i < tm; i++){
            p2.push(p1.pop());
        }
        Object r = p2.pop();
        tm--;
        for(int i = 0; i < tm; i++){
            p1.push(p2.pop());
        }
        return r;
    }
}

class EFilaVazia extends RuntimeException {
	public EFilaVazia(String err) {
		super(err);
	}
}