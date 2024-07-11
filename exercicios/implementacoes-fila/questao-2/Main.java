class Main{
    public static void main(String[] args){
        FilaComPilha f = new FilaComPilha();
        System.out.println(f.estaVazio());
        for(int i = 0; i < 5; i++){
            f.push(i+2);
        }
        System.out.println(f.estaVazio());
        System.out.println(f.objetoTopo());
        System.out.println(f.tamanho());
        for(int i = 0; i < 5; i++){
            Object x = f.pop();
            System.out.println(x);
        }
    }
}