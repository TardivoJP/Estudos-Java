import java.util.Scanner;

public class Bee2152 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for(int i=0;i<n;i++){
			int h = s.nextInt();
			int m = s.nextInt();
			int opt = s.nextInt();

			if(h<10){
				System.out.print("0"+h);
			}else{
				System.out.print(h);
			}
			if(m<10){
				System.out.print(":0"+m);
			}else{
				System.out.print(":"+m);
			}
			if(opt == 1){
				System.out.println(" - A porta abriu!");
			}else{
				System.out.println(" - A porta fechou!");
			}
		}
        s.close();
    }
}