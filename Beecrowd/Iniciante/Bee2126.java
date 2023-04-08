import java.util.Scanner;

public class Bee2126 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count = 0;
        while(s.hasNext()){
            String input[] = s.nextLine().split("");
            String comparison[] = s.nextLine().split("");
            boolean isSequence = false;
            int j = 0, seq = 0, pos = 0;
            for(int i=0;i<comparison.length;i++){
                if(isSequence && !(comparison[i].equals(input[j]))){
                    isSequence=false;
                    j=0;
                }

                if(comparison[i].equals(input[j])){
                    isSequence=true;
                    if(j==0){
                        pos=i+1;
                    }
                    j++;
                    if(j>=input.length){
                        j=0;
                        seq++;
                    }
                }
            }
            count++;
            System.out.println("Caso #"+count+":");
            if(seq == 0){
                System.out.println("Nao existe subsequencia");
            }else{
                System.out.println("Qtd.Subsequencias: "+seq);
                System.out.println("Pos: "+pos);
            }
            System.out.println();
        }
        s.close();
    }
}