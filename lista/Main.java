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
        Object o_n = 98;
        l.insertBefore(o, o_n);
    }
    
}
