class Main{
    public static void main(String args[]){
        Vetor v = new Vetor();
        for(int i = 0; i < 5; i++){
            v.insertAtRank(0, i+2);
        }
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.elemAtRank(i));
        }
        System.out.println("----------------------");
        v.removeAtRank(2);
        v.replaceAtRank(3, 12314);
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.elemAtRank(i));
        }
    }
}