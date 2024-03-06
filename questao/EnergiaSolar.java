class EnergiaSolar{
    private int en[];
    private int i;
    private Pilha linha_forca;
    
    public EnergiaSolar(int tam){
        en = new int[tam];
        linha_forca = new Pilha(1);
        i = 0;
    }
    public void inserir(int e){
        en[i] = e;
        i++;
    }
    public Pilha criarLinhaForca(Pilha percorrer){
        Pilha resto = new Pilha(1);
        while(!percorrer.isEmpty()){
            int n1 = percorrer.pop();
            int n2 = 0;
            if(percorrer.size() >= 1){
                n2 = percorrer.pop();
                percorrer.push(n2);
            }
            if(n1 < n2){
                resto.push(n2);
            }
        }
        linha_forca = resto;
        return linha_forca;
    }   
}
