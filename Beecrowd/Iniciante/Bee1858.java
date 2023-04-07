import java.util.Scanner;

public class Bee1858 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String arr[] = s.nextLine().split(" ");
        int menor = Integer.parseInt(arr[0]);
        int idx=1;
        for(int i=0;i<arr.length;i++){
            if(Integer.parseInt(arr[i])<menor){
                menor=Integer.parseInt(arr[i]);
                idx=i+1;
            }    
        }
        System.out.println(idx);
        s.close();
    }
}