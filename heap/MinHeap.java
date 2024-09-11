class MinHeap {
    private Integer tamanho;
    private Item array[];
    private Item raiz;

    public MinHeap(){
        tamanho = 1;
        array = new Item[10];
    }
    public void printHeap(){
        for(int i = 1; i < tamanho; i++){
            System.out.print(array[i].getElemento() + " ");
        }
        System.out.println();
    }
// - insert(k, o) - Insere um item com chave k e elemento o.
// - removeMin() - Remove e retorna o item com maior prioridade (menor chave)
// - min() - Retorna sem remover o item com maior prioridade
// - size(), isEmpty()
    private void unHeap(){
        Item pai;
        Item elemento = array[tamanho];
        Integer ind_pai;
        Integer ind_filho;
        
        pai = array[tamanho/2];
        ind_pai = tamanho/2;
        ind_filho = tamanho;
        
        while(elemento.getChave() < pai.getChave()){
            System.out.println("Elemento: "+ elemento.getChave() + " "+"Pai: " + pai.getChave());
            array[ind_filho] = pai;
            array[ind_pai] = elemento;

            ind_filho = ind_pai;
            pai = array[ind_pai/2];
            ind_pai = ind_pai/2;

            if(ind_pai == 0) return;
        }
    }
    public void insert(Integer k, Object o){
        Item item = new Item(k, o);
        if(tamanho == array.length){
            Item aux[] = new Item[array.length*2];
            for(int i = 1; i < array.length; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        array[tamanho] = item;
        if(tamanho >= 2)
            unHeap();
        tamanho++;
        
    }
}