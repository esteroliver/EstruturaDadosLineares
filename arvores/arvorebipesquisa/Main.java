import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        No node0 = new No(7);
        No node1 = new No(5);
        No node2 = new No(6);
        No node3 = new No(8);
        No node4 = new No(10);
        No node5 = new No(9);
        No node6 = new No(11);

        ArvoreBinaria arvore = new ArvoreBinaria(node0);
        arvore.insertNode(node2);
        arvore.insertNode(node3);
        arvore.insertNode(node1);
        arvore.insertNode(node4);
        arvore.insertNode(node5);
        arvore.insertNode(node6);

        ArrayList<No> nodes = arvore.preOrder_print();
        for(No no : nodes){
            System.out.println(no.getElemento());
        }


    }
}