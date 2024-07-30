import java.util.ArrayList;

class ArvoreBinaria {
    private No raiz;
    private Integer tam;

    private ArrayList<No> visitas;
    private No no_inorder;

    public ArvoreBinaria(No raiz){
        tam = 1;
        this.raiz = raiz;
    }
    public Integer size(){
        return tam;
    }
    public Boolean isEmpty(){
        if(tam == 0) return true;
        return false;
    }
    public Boolean isLeftChild(No no){
        if(no.getPai().getFilho_esquerda() == no) return true;
        return false;
    }
    public Boolean isRightChild(No no){
        if(no.getPai().getFilho_direita() == no) return true;
        return false;
    }
    public Boolean isExternal(No node){
        if(node.getFilho_direita() == null && node.getFilho_esquerda() == null) return true;
        return false;
    }
    public Boolean isInternal(No node){
        if(!isExternal(node)) return true;
        return false;
    }
    public Boolean isRoot(No node){
        if(node == raiz) return true;
        return false;
    }
    public Boolean hasLeftChild(No node){
        if(node.getFilho_esquerda() != null) return true;
        return false;
    }
    public Boolean hasRightChild(No node){
        if(node.getFilho_direita() != null) return true;
        return false;
    }
    public Integer height(No o){
        if(isExternal(o)) return 0;
        else{
            Integer max = 0;
            Integer h = height(o.getFilho_direita())+1;
            Integer h2 = height(o.getFilho_esquerda())+1;
            if(h > max) max = h;
            if(h2 > max) max = h2;
            return max;
        }
    }
    public Integer depth(No o){
        if(o == raiz) return 0;
        return 1 + depth(o.getPai());
    }
    public void insertNode(No new_node){
        No node = raiz;
        while(new_node.getPai() == null){
            if(new_node.getElemento() > node.getElemento()){
                if(node.getFilho_direita() == null){
                    node.setFilho_direita(new_node);
                    new_node.setPai(node);
                }
                else
                    node = node.getFilho_direita();
            }
            else if(new_node.getElemento() < node.getElemento()){
                if(node.getFilho_esquerda() == null){
                    node.setFilho_esquerda(new_node);
                    new_node.setPai(node);
                }
                else
                    node = node.getFilho_esquerda();
            }
        }
        tam++;
    }
    public Boolean searchNode(No node_search, No node){
        if(isExternal(node_search)) return true;
        while(node != node_search && node != null){
            if(node_search.getElemento() > node.getElemento()){
                node = node.getFilho_direita();
            }
            else if(node_search.getElemento() < node.getElemento()){
                node = node.getFilho_esquerda();
            }
        }
        if(node == null) return false;
        return true;
    }
    public void removeNode(No node_removed){
        //nó sem filhos
        if(isExternal(node_removed)){
            if(isLeftChild(node_removed)) node_removed.getPai().setFilho_esquerda(null);
            else node_removed.getPai().setFilho_direita(null); 
            node_removed = null;
            tam--;
        }
        //nó com um filho
        else if(node_removed.oneChild()){
            No node_pai = node_removed.getPai();
            if(isLeftChild(node_removed)){
                if(node_removed.getFilho_direita() != null) node_pai.setFilho_esquerda(node_removed.getFilho_direita());
                else node_pai.setFilho_esquerda(node_removed.getFilho_esquerda());
            }
            else{
                if(node_removed.getFilho_direita() != null) node_pai.setFilho_direita(node_removed.getFilho_direita());
                else node_pai.setFilho_direita(node_removed.getFilho_esquerda());
            }
            tam--;
        }
        //nó com dois filhos
        else{
            No node = node_removed.getFilho_direita();
            No node_pai = node_removed.getPai();
            No node_sub = inOrder_return(node);
            node_sub.setFilho_esquerda(node_removed.getFilho_esquerda());
            if(isLeftChild(node_removed)){
                node_pai.setFilho_esquerda(node_sub);
            }
            else{
                node_pai.setFilho_direita(node_sub);
            }
            tam--;
        }
    }

    //visitas
    private void preOrder_func(No o){
        visitas.add(o);
        if(o.getFilho_esquerda() != null) preOrder_func(o.getFilho_esquerda());
        if(o.getFilho_direita() != null) preOrder_func(o.getFilho_direita());
    }
    public ArrayList<No> preOrder_print(){
        visitas = new ArrayList<No>();
        preOrder_func(raiz);
        return visitas;
    } 
    public void posOrder_func(No o){
        if(o.getFilho_esquerda() != null) posOrder_func(o.getFilho_esquerda());
        if(o.getFilho_direita() != null) posOrder_func(o.getFilho_direita());
        visitas.add(o);
    }
    public ArrayList<No> posOrder_print(){
        visitas = new ArrayList<No>();
        posOrder_func(raiz);
        return visitas;
    }
    public ArrayList<No> inOrder_print(){
        visitas = new ArrayList<No>();
        inOrder_func(raiz);
        return visitas;
    }
    private void inOrder_func(No o){
        if(isInternal(o) && o.getFilho_esquerda() != null)
            inOrder_func(o.getFilho_esquerda());
        visitas.add(o);
        if(isInternal(o) && o.getFilho_direita() != null)
            inOrder_func(o.getFilho_direita());
    } 
    private void inOrder_visite(No o, Boolean break_rec){
        if(isInternal(o) && o.getFilho_esquerda() != null)
            inOrder_func(o.getFilho_esquerda());
        if(break_rec){
            return;
        }
        if(o.oneChild() || isExternal(o)){
            no_inorder = o;
            break_rec = true;
        }
        if(isInternal(o) && o.getFilho_direita() != null)
            inOrder_func(o.getFilho_direita());
    }
    private No inOrder_return(No o){
        no_inorder = new No();
        inOrder_visite(o, false);
        return no_inorder;
    }

    public No root(){
        return raiz;
    }
    public No parent(No node){
        return node.getPai();
    }
    public No leftChild(No node){
        return node.getFilho_esquerda();
    }
    public No rightChild(No node){
        return node.getFilho_direita();
    }
}