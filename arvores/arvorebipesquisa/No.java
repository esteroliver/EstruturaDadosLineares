public class No{
    private Integer elemento;
    private No pai;
    private No filho_esquerda;
    private No filho_direita;
    public No() {
    }
    public No(Integer elemento) {
        this.elemento = elemento;
        this.pai = null;
        this.filho_esquerda = null;
        this.filho_direita = null;
    }
    public Integer getElemento() {
        return elemento;
    }
    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }
    public No getPai() {
        return pai;
    }
    public void setPai(No pai) {
        this.pai = pai;
    }
    public No getFilho_esquerda() {
        return filho_esquerda;
    }
    public void setFilho_esquerda(No filho_esquerda) {
        this.filho_esquerda = filho_esquerda;
    }
    public No getFilho_direita() {
        return filho_direita;
    }
    public void setFilho_direita(No filho_direita) {
        this.filho_direita = filho_direita;
    }
    public Boolean oneChild(){
        if((filho_direita == null && filho_esquerda != null) || (filho_direita != null && filho_esquerda == null)) return true;
        return false;
    }
    public Boolean trueNode(){
        if(filho_esquerda.getElemento() < pai.getElemento() && filho_direita.getElemento() > pai.getElemento()) return true;
        return false;
    }
    
}