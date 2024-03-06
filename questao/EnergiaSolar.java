class EnergiaSolar{
    private int en[];
    private int i;
    private Pilha linha_forca;
    
    public EnergiaSolar(int tam){
        en = new int[tam];
        linha_forca = new Pilha(tam);
        i = 0;
    }
    public void inserir(int e){
        en[i] = e;
        i++;
    }
    public Pilha criarLinhaForca(Pilha percorrer){
        Pilha linha = new Pilha(1);
        Pilha resto = new Pilha(1);
        while(!percorrer.isEmpty()){
            int n1 = percorrer.pop();
            int n2 = 0;
            if(percorrer.size() > 1){
                n2 = percorrer.pop();
                percorrer.push(n2);
            }
            if(n1 > n2){
                linha.push(n1);
                resto.push(n2);
            }
            else{
                linha.push(n1);
                linha.push(n2);
            }
        }
        linha_forca = resto;
        return linha_forca;
    }   
    public void mostrarLinhaForca(){
        for(int i = 0; i < linha_forca.size(); i++){
            int x = linha_forca.pop();
            System.out.println(x + " ");
        }
    }
}
