import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Integer array[] = new Integer[10];
        Scanner obj = new Scanner(System.in); 
        for(int i = 0; i < 10; i++){
            Integer num = obj.nextInt();
            array[i] = num;
        }
        TimSort tim = new TimSort();
        tim.timSort(array, 10);
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + ' ');
        }
    }
}
