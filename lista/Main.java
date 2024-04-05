class Main {
    public static void main(String args[]){
        Lista l = new Lista();
        for(int i = 0; i < 5; i++){
            l.insertFirst(i+5);
            System.out.println(l.first());
        }
    }
    
}
