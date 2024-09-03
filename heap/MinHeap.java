class MinHeap {
    private Integer tamanho;
    private No raiz;
    private No ultimo;

    public MinHeap(No raiz){
        this.tamanho = 1;
        this.raiz = raiz;
        this.ultimo = raiz;
    }

// - insert(k, o) - Insere um item com chave k e elemento o.
// - removeMin() - Remove e retorna o item com maior prioridade (menor chave)
// - min() - Retorna sem remover o item com maior prioridade
// - size(), isEmpty()

    public void insert(Integer c, Object o){
        No novo_elemento = No(c, o);
        while(novo_elemento.getPai() == null){
            if(ultimo.getFilho_direita() == null){
                ultimo.setFilho_direita(novo_elemento);
                novo_elemento.setPai(ultimo);
            }
            else if(ultimo.getFilho_esquerda() == null){
                ultimo.setFilho_esquerda(novo_elemento);
                novo_elemento.setPai(ultimo);
            }
            // terminar
        }
    }
    
}