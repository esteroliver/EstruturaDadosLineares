package arvores.arvorebipesquisa;

public class ArvoreBinaria {
    private No raiz;
    private Integer tam;
    public ArvoreBinaria(Integer raiz){
        tam = 1;
        this.raiz = new No(raiz);
    }
     public Integer size(){
        return tam;
     }
     public Boolean isEmpty(){
        if(tam == 0) return true;
        return false;
     }
     public Boolean isInternal(No node){
        if(node.getFilho_direita() != null || node.getFilho_esquerda() != null) return true;
        return false;
     }
     public Boolean isExternal(No node){
        if(node.getFilho_direita() == null && node.getFilho_esquerda() == null) return true;
        return false;
     }
     public void insertNode(Integer obj){
        No new_node = new No(obj);
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
        // if(node_search == node) return true;
        // if(node_search.getElemento() < node.getElemento())
        //     return searchNode(node_search, node.getFilho_esquerda());
        // if(node_search.getElemento() > node.getElemento())
        //     return searchNode(node_search, node.getFilho_direita());
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
        if(isExternal(node_removed)) node_removed = null;
        //nó com um filho
        else if(node_removed.oneChild()){
            No node_percorrer = node_removed.getPai();
            while(!node_percorrer.trueNode()){
                
            }
        }
        //nó com dois filhos
        else if(!node_removed.oneChild() && !isExternal(node_removed)){

        }
     }
    //  public void removeNode(No node_removed){
    //     if(isExternal(node_removed)) node_removed = null;
        
    //     if(node_removed.getFilho_direita() != null && node_removed.getFilho_esquerda() == null){
    //         No filho_direita = node_removed.getFilho_direita();
    //         No pai = node_removed.getPai();
    //         if(node_removed == pai.getFilho_esquerda()){
    //             pai.setFilho_esquerda(filho_direita);
    //             filho_direita.setPai(pai);
    //             if(filho_direita.getElemento() > pai.getElemento()){
    //                 No filho_direita_save = filho_direita;
    //                 filho_direita = pai;
    //                 pai = filho_direita_save;
    //             }
    //         }
    //         else{
    //             pai.setFilho_direita(filho_direita);
    //             filho_direita.setPai(pai);
    //         }
    //         node_removed = null;
    //     }
        
    //     else if(node_removed.getFilho_direita() == null && node_removed.getFilho_esquerda() != null){
            
    //     }
    //  }
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