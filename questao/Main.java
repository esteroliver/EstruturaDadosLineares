class Main{
    public static void main(String args[]){
        //{8,6,10,4,1,5,3} 
        EnergiaSolar rua = new EnergiaSolar(7);
        rua.inserir(8);
        rua.inserir(6);
        rua.inserir(10);
        rua.inserir(4);
        rua.inserir(1);
        rua.inserir(5);
        rua.inserir(3);

        Pilha percorrer = new Pilha(1);
        percorrer.push(8);
        percorrer.push(6);
        percorrer.push(10);
        percorrer.push(4);
        percorrer.push(1);
        percorrer.push(5);
        percorrer.push(3);
        
        int x = 0;
        
        while(!percorrer.isEmpty()){
            percorrer = rua.criarLinhaForca(percorrer);
            x++;
            rua.mostrarLinhaForca();
        }
        System.out.println(x);
    }
}
