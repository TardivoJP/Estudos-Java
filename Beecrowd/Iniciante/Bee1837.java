import java.util.Scanner;

public class Bee1837 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int q,r;
        if(a>=0) {
        	q=a/b;
        	r=a%b;	
        }else{
        	int x=0, y=0;
        	if(b<0){
                x=b*-1;
            }else{
                x=b;
            }
        	
        	for(r=0;r<x;r++){
        		y=a-r;
        		if(y%b==0){
                    break;
                }
        	}
        	q=y/b;
        }
        System.out.println(q+" "+r);
        s.close();
    }
}