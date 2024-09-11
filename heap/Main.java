class Main {
    public static void main(String[] args){
        MinHeap heap = new MinHeap();
        heap.insert(2, "ester");
        heap.insert(5, "Theo");
        heap.insert(3, "Matias");
        heap.insert(1, "Duda");
        heap.removeMin();
        heap.printHeap();
    }
}
