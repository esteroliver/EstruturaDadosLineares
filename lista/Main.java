class Main {
    public static void main(String args[]){
        Lista l = new Lista();
        for(int i = 0; i < 5; i++){
            l.insertLast(i+5);
            System.out.println(l.last());
        }
        System.out.println(l.before(l.last()));
        System.out.println(l.after(l.first()));

        Object o = 7;
        System.out.println(l.before(o));
        System.out.println(l.after(o));

        l.insertBefore(666, o);
        System.out.println(l.before(o));
        l.insertAfter(777, o);
        System.out.println(l.after(o));

        Object capeta = 666;
        Object anjo = 777;
        l.swapElements(capeta, anjo);
        System.out.println(l.before(o));
        System.out.println(l.after(o));
        System.out.println(l.after(anjo));
        for(int i = 0; i < 7; i++){
            Object i_1 = i+5;
            System.out.println(l.after(i_1));
        }
    }
    
}
