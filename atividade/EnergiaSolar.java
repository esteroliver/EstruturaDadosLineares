package atividade;

public class EnergiaSolar {
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
        Pilha linha = new Pilha(2);
        Pilha resto = new Pilha(2);
        while(!percorrer.isEmpty()){
            int n1 = percorrer.pop();
            int n2 = percorrer.pop();
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
}