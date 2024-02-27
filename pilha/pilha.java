public class pilha{
    private Object array[];
    private int top = -1;
    public void arrayStack(){
        array = (Object[]) new Object[1];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }
    public Object objectTop(){
        if(isEmpty()) throw new ExceptionInInitializerError();
        return array[top-1];
    }
    public Object pop(){
        if(isEmpty()) throw new ExceptionInInitializerError();
        top--;
        return array[top];
    }
    public void push(int x){
        if(array.length == top){
            Object[] aux;
            aux = (Object[]) new Object[top*2];
            for(int i = 0; i < top; i++){
                aux[i] = array[i];
            }
            array = aux;
        }
        array[top++] = x;
    }
}