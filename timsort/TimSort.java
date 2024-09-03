class TimSort {
    public TimSort(){}
    private void insert(Integer array[], Integer esq, Integer dir){
        for(Integer i = esq + 1; i <= dir; i++){
            Integer aux = array[i];
            Integer j = i - 1;
            while(j >= esq && array[j] > aux){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }

    private void merge(Integer array[], Integer i1, Integer j1, Integer i2, Integer j2){
        Integer temp[] = new Integer[(j1 - i1) + (j2 - i2) + 2];
        Integer i, j, k;
        i = i1;
        j = i2;
        k = 0;
        while(i <= j1 && j <= j2){
            if(array[i] < array[j]){
                temp[k] = array[i];
                k++;
                i++;
            }
            else{
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        while(i <= j1){
            temp[k] = array[i];
            k++;
            i++;
        }
        while(j <= j2){
            temp[k] = array[j];
            k++;
            j++;
        }
        for(i = i1, j = 0; i <= j2; i++, j++){
            array[i] = temp[j];
        }
    }

    public void timSort(Integer array[], Integer size){
        Integer RUN = 32;
        for(Integer i = 0; i < size; i+= RUN){
            insert(array, i, ( i + RUN - 1));
        }
        for(Integer s = RUN; s < size; s = 2 * s){
            for(Integer esq = 0; esq < size; esq += 2 * s){
                Integer mid = (esq + s - 1);
                Integer j1 = mid;
                Integer dir = Math.min(esq + 2 * s - 1, size - 1);
                Integer j2 = mid + 1;

                if(mid < dir){
                    merge(array, esq, j1, dir, j2);
                }
            }
        }
    }
}