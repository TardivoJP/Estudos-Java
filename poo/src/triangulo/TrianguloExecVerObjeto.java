package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExecVerObjeto {

	public static void main(String[] args) {
		
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();
		
		entrada(a);
		//Triângulo A
		if(a.validar()==true){
			System.out.println(a.toString());
		}else{
			System.out.println("\nOs lados informados não são de um triângulo\n\n");
		}
		
		entrada(b);
		//Triângulo B
		if(b.validar()==true){
			System.out.println(b);
		}else{
			System.out.println("\nOs lados informados não são de um triângulo\n\n");
		}
		
	}
	
	public static void entrada(Triangulo lado) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite os valores dos lados:");
		lado.x=sc.nextDouble();
		lado.y=sc.nextDouble();
		lado.z=sc.nextDouble();
	}

}
