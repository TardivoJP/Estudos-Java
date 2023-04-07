import java.util.Scanner;

public class Bee1848 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int sum=0;
        int count=0;
        while(count<3){
            while(true){
                String leftEye="",middleEye="",rightEye="";
                String arr[] = s.nextLine().split("");
                if(arr[0].equalsIgnoreCase("c")){
                    break;
                }

                if(arr[0].equalsIgnoreCase("-")){ //MSB
                    leftEye="0";
                }else{
                    leftEye="1";
                }
                if(arr[1].equalsIgnoreCase("-")){
                    middleEye="0";
                }else{
                    middleEye="1";
                }
                if(arr[2].equalsIgnoreCase("-")){ //LSB
                    rightEye="0";
                }else{
                    rightEye="1";
                }
                String binary = leftEye+middleEye+rightEye;
                int decimal = Integer.parseInt(binary,2);
                sum+=decimal;
            }
            System.out.println(sum);
            sum=0;
            count++;
        }
        s.close();
    }
}