class Main{
    public static void main(String args[]){
        PilhaComFilas p = new PilhaComFilas();
        System.out.println(p.isEmpty());
        for(int i = 0; i < 5; i++){
            p.push(i+2);
        }
        System.out.println(p.isEmpty());
        System.out.println(p.objectTop());
        System.out.println(p.size());
        for(int i = 0; i < 5; i++){
            Object x = p.pop();
            System.out.println(x);
        }
    }
}