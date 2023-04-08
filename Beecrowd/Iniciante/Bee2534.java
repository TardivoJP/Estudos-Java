import java.util.Scanner;

public class Bee2534 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int pop = s.nextInt();
            int consultas = s.nextInt();
            int populacao[] = new int[pop];
            for(int i=0;i<pop;i++){
                populacao[i]=s.nextInt();
            }
            quickSort(populacao, 0, populacao.length - 1);
            for(int i=0;i<consultas;i++){
                int consulta = s.nextInt();
                System.out.println(populacao[populacao.length-consulta]);
            }
        }
        s.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}