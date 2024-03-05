package EnergiaSolar;

import java.util.ArrayList;

public class EnergiaSolar {
    private int en[];
    private int i;
    private Pilha en_pilha;
    public EnergiaSolar(int tam){
        en = new int[tam];
        en_pilha = new Pilha(tam);
        i = 0;
    }
    public void inserir(int e){
        en[i] = e;
        en_pilha.push(e);
        i++;
    }
    public boolean criarLinhaForca(){
        Pilha linha = new Pilha(i);
        Pilha linha2 = new Pilha(i);
        while(!en_pilha.isEmpty()){
            int n1 = en_pilha.pop();
            int n2 = en_pilha.pop();
            if(n1 > n2){
                linha.push(n1);
                linha2.push(n2);
            }
        }
        if(linha.size() != 0) return true;
        return false;
    }   
}
