import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Integer array[] = new Integer[128];
        Scanner obj = new Scanner(System.in); 
        for(int i = 0; i < 128; i++){
            int num = obj.nextInt();
            array[i] = num;
        }
        TimSort tim = new TimSort();
        tim.timSort(array, 10);
        System.out.println();
        for(int i = 0; i < 128; i++){
            System.out.print(array[i] + " ");
        }
    }
