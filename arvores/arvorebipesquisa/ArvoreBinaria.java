import java.util.ArrayList;

class ArvoreBinaria {
    private No raiz;
    private Integer tam;
    private ArrayList<No> visitas;
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

            tam--;
        }
     }

    //visitas
    private void preOrder_func(No o){
        visitas.add(o);
        if(o.getFilho_direita() != null) preOrder_func(o.getFilho_direita());
        if(o.getFilho_esquerda() != null) preOrder_func(o.getFilho_esquerda());
    }
    public ArrayList<No> preOrder_print(){
        visitas = new ArrayList<No>();
        preOrder_func(raiz);
        return visitas;
    }
    private void inOrder_func(No o){
        if(isInternal(o) && o.getFilho_esquerda() != null)
            inOrder_func(o.getFilho_esquerda());
        visitas.add(o);
        if(isInternal(o) && o.getFilho_direita() != null)
            inOrder_func(o.getFilho_direita());
    }
    public ArrayList<No> inOrder_print(){
        visitas = new ArrayList<No>();
        inOrder_func(raiz);
        return visitas;
    }
}

    /**
- integer size( ) - retorna o número de nós da árvore
- integer height( ) - retorna a altura da árvore
- boolean isEmpty( ) - indica se a árvore não possui nós
- Iterator elements( ) - percorrer os elementos da árvore
- Iterator nos( ) - percorrer os nós da árvore
- No root( ) - retorna o nó raiz
- No parente(No) - retorna o nó pai do parâmetro
- Iterator children(No) - percorre os filhos do nó parâmetro

- boolean isInternal(No) - indica se o nó é interno
- boolean isExternal(No) - indica se o nó é externo
- boolean isRoot(No) - indica se o nó é raiz
- integer depth(No) - retorna a profundidade de um nó

- No leftChild(v) - retorna o filho esquerdo de v
- No rightChild(v) - retorna o filho direito de v
- boolean hasLeft(v) - retorna se v tem filho esquerdo
- boolean hasRight(v) - retorna se v tem filho direito

- inserir
- remover
- buscar
     */