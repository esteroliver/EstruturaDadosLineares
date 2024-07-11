import java.util.Scanner;
class Main{
    public static void main(String args[]){
        //{8,6,10,4,1,5,3} 
        //{3,6,2,7,3}
        EnergiaSolar rua = new EnergiaSolar();
        Scanner obj = new Scanner(System.in);
        System.out.println("Tamanho do array:");
        int tam = obj.nextInt();
        int array[] = new int[tam];
        System.out.println("Digite os valores do array:");
        for(int i = 0; i < tam; i++){
            array[i] = obj.nextInt();
        }

        Pilha percorrer = new Pilha(1);

        for(int i = tam; i >= 1; i--){
            percorrer.push(array[i-1]);
        }
        
        int x = 0;
        
        while(!percorrer.isEmpty()){
            percorrer = rua.criarLinhaForca(percorrer);
            x++;
        }

        System.out.println("Quant. de linhas de força: " + x);
    }
}
