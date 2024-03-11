import java.util.ArrayList;

class EnergiaSolar{
    private Pilha linha_forca;
    public EnergiaSolar(){
        linha_forca = new Pilha(1);
    }
    public Pilha criarLinhaForca(Pilha percorrer){
        Pilha linha = new Pilha(1);
        Pilha resto = new Pilha(1);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int dup1 = 0;
        int dup2 = 0;
        while(!percorrer.isEmpty()){
            dup1 = percorrer.pop();
            if(percorrer.size() == 0) break;
            dup2 = percorrer.objectTop();
            if(dup1 < dup2){
                a.add(dup2);
            }
        }
        for(int i = a.size(); i >= 1; i--){
            linha.push(a.get(i-1));
        }
        linha_forca = linha;
        return linha_forca;
    }   
}
