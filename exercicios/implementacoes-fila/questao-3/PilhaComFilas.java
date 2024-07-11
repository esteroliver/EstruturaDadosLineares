class PilhaComFilas{
    private Fila f1;
    private Fila f2;
    private int tm;

    public PilhaComFilas(){
        tm = 0;
        f1 = new Fila(1);
        f2 = new Fila(1);
    }
    public boolean isEmpty(){
        if (tm == 0) return true;
        return false;
    }
    public int size(){
        return tm;
    }
    public Object objectTop(){
        if(isEmpty()) throw new EPilhaVazia("Pilha vazia.");
        for(int i = 0; i < tm-1; i++){
            f2.enfileirar(f1.desenfileirar());
        }
        Object x = f1.desenfileirar();
        f2.enfileirar(x);
        for(int i = 0; i < tm; i++){
            f1.enfileirar(f2.desenfileirar());
        }
        return x;
    }
    public void push(Object x){
        f1.enfileirar(x);
        tm++;
    }
    public Object pop(){
        if(isEmpty()) throw new EPilhaVazia("Pilha vazia.");
        for(int i = 0; i < tm-1; i++){
            f2.enfileirar(f1.desenfileirar());
        }
        Object x = f1.desenfileirar();
        tm--;
        for(int i = 0; i < tm; i++){
            f1.enfileirar(f2.desenfileirar());
        }
        return x;
    }
}
class EPilhaVazia extends RuntimeException {
	public EPilhaVazia(String err) {
		super(err);
	}
}