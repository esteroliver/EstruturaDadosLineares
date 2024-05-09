class Main  {
    public static void main(String[] args){
        Lista l = new Lista();
        l.insertFirst(5);
        l.insertLast(7);
        l.insertBefore(7, 6);

        System.out.println(l.first());
        System.out.println(l.after(l.first()));
        System.out.println(l.last());
    }
}
