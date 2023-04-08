import java.util.Scanner;

public class Bee2176 {
    public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
		String message[] = s.nextLine().split("");
		int contador=0;
		StringBuilder messageFinal = new StringBuilder();
		for(int i=0;i<message.length;i++){
			messageFinal.append(message[i]);
			if(message[i].equals("1")){
				contador++;
			}
		}
		if(contador % 2 == 0){
			messageFinal.append("0");
		}else{
			messageFinal.append("1");
		}
		System.out.println(messageFinal.toString());
        s.close();
    }
}