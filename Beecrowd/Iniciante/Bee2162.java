import java.util.Scanner;

public class Bee2162 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int compara = 0;
		boolean repeticaoPico = false, repeticaoVale = false;
		int result = 1;
		for(int i=0;i<n;i++){
			int x = s.nextInt();
			if(i==0){
				compara = x;
			}else{
				if(compara>x){
					if(repeticaoPico){
						result = 0;
						break;
					}
					repeticaoPico=true;
					repeticaoVale=false;
				}else if(compara<x){
					if(repeticaoVale){
						result = 0;
						break;
					}
					repeticaoVale=true;
					repeticaoPico=false;
				}else{
					result = 0;
					break;
				}
			}
			compara=x;
		}
		System.out.println(result);
        s.close();
    }
}