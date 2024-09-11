class Item {
    private Integer chave;
    private Object elemento;
    public Item() {
    }
    public Item(Integer chave, Object elemento) {
        this.chave = chave;
        this.elemento = elemento;
    }
    public Integer getChave() {
        return chave;
    }
    public void setChave(Integer chave) {
        this.chave = chave;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
