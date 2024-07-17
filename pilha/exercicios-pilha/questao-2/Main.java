class Main{
    public static void main(String[] args){
        long s, e;
        s = System.currentTimeMillis();
        Pilha p = new Pilha(1);
        for(int i = 0; i < 100000; i++){
            p.push(i);
        }
        e = System.currentTimeMillis();
        System.out.println(e-s/1000);
    }
}