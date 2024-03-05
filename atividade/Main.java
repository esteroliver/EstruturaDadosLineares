package atividade;

public class Main {
    public static void main(String[] args){
        EnergiaSolar rua = new EnergiaSolar(5);
        rua.inserir(3);
        rua.inserir(6);
        rua.inserir(2);
        rua.inserir(7);
        rua.inserir(5);

        Pilha percorrer = new Pilha(5);
        percorrer.push(3);
        percorrer.push(6);
        percorrer.push(2);
        percorrer.push(7);
        percorrer.push(5);
        
        int x = 0;
        
        while(!percorrer.isEmpty()){
            percorrer = rua.criarLinhaForca(percorrer);
            x++;
        }
        System.out.println(x);
    }
}
