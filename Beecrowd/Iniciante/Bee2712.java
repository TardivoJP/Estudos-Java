import java.util.Scanner;

public class Bee2712{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            String licensePlate[] = s.next().split("");
            if(licensePlate.length==8){
                if(licensePlate[0].matches("[A-Z]+") && licensePlate[1].matches("[A-Z]+") && licensePlate[2].matches("[A-Z]+") && licensePlate[3].matches(".*-.*") && licensePlate[4].matches("\\d+") && licensePlate[5].matches("\\d+") && licensePlate[6].matches("\\d+") && licensePlate[7].matches("\\d+")){
                    switch(licensePlate[licensePlate.length-1]){
                        case "1": System.out.println("MONDAY"); break;
                        case "2": System.out.println("MONDAY"); break;
                        case "3": System.out.println("TUESDAY"); break;
                        case "4": System.out.println("TUESDAY"); break;
                        case "5": System.out.println("WEDNESDAY"); break;
                        case "6": System.out.println("WEDNESDAY"); break;
                        case "7": System.out.println("THURSDAY"); break;
                        case "8": System.out.println("THURSDAY"); break;
                        case "9": System.out.println("FRIDAY"); break;
                        case "0": System.out.println("FRIDAY"); break;
                    }
                }else{
                    System.out.println("FAILURE");
                }
            }else{
                System.out.println("FAILURE");
            }
        }
        s.close();
    }
}