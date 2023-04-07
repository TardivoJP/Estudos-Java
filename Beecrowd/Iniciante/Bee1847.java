import java.util.Scanner;

public class Bee1847 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        boolean subiuPrim=false,desceuPrim=false,subiuSeg=false,desceuSeg=false;
        int qtdSubiuPrim=0,qtdDesceuPrim=0,qtdSubiuSeg=0,qtdDesceuSeg=0;
        if(b-a>0){
            subiuPrim=true;
            qtdSubiuPrim=b-a;
        }else if(b-a<0){
            desceuPrim=true;
            qtdDesceuPrim=(b-a)*(-1);
        }

        if(c-b>0){
            subiuSeg=true;
            qtdSubiuSeg=c-b;
        }else if(c-b<0){
            desceuSeg=true;
            qtdDesceuSeg=(c-b)*(-1);
        }

        if(desceuPrim && (subiuSeg || (!subiuSeg && !desceuSeg))){
            System.out.println(":)");
        }
        if(subiuPrim && (desceuSeg || (!subiuSeg && !desceuSeg))){
            System.out.println(":(");
        }
        if(subiuPrim && subiuSeg && qtdSubiuPrim>qtdSubiuSeg){
            System.out.println(":(");
        }
        if(subiuPrim && subiuSeg && qtdSubiuPrim<=qtdSubiuSeg){
            System.out.println(":)");
        }
        if(desceuPrim  && desceuSeg && qtdDesceuPrim>qtdDesceuSeg){
            System.out.println(":)");
        }
        if(desceuPrim  && desceuSeg && qtdDesceuPrim<=qtdDesceuSeg){
            System.out.println(":(");
        }
        if(!subiuPrim && !desceuPrim && subiuSeg){
            System.out.println(":)");
        }
        if(!subiuPrim && !desceuPrim && (desceuSeg || (!subiuSeg && !desceuSeg))){
            System.out.println(":(");
        }

        s.close();
    }
}