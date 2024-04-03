class Main{
    public static void main(String args[]){
        Vetor v = new Vetor();
        for(int i = 0; i < 5; i++){
            v.insertAtRank(0, i+5);
        }
        for(int i = 0; i < 5; i++){
            System.out.println(v.removeAtRank(0));
        }
    }
}