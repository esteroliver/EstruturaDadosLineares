import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        No node0 = new No(7);
        No node1 = new No(5);
        No node2 = new No(6);
        No node3 = new No(8);

        ArvoreBinaria arvore = new ArvoreBinaria(node0);
        arvore.insertNode(node2);
        arvore.insertNode(node3);
        arvore.insertNode(node1);

        ArrayList<No> visitas = arvore.preOrder_print();
        for(No no : visitas){
            System.out.println(no.getElemento());
        }

        System.out.println("-----------------");

        arvore.removeNode(node1);
        visitas = arvore.preOrder_print();
        for(No no : visitas){
            System.out.println(no.getElemento());
        }
    }
}