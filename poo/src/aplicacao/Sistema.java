package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.FuncionarioCheckpoint;
import entidades.enums.Nivel;

public class Sistema {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Departamento: ");
		String depto = sc.nextLine();
		System.out.println("Nome do funcionário: ");
		String func = sc.nextLine();
		System.out.println("Nível do funcionário: ");
		String nivel = sc.nextLine();
		System.out.println("Salário base do funcionário: ");
		double salario = sc.nextDouble();
		
		FuncionarioCheckpoint funcionario = new FuncionarioCheckpoint(func, Nivel.valueOf(nivel), salario, new Departamento(depto));
		
		System.out.println("Contratos associados a este funcionário: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Contrato nº"+i+":");
			System.out.println("Data do contrato (DD/MM/AAAA): ");
			Date data = sdf.parse(sc.next());
			System.out.println("Valor da hora trabalhada: ");
			double valor = sc.nextDouble();
			System.out.println("Quantidade de horas trabalhadas: ");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(data, valor, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println("Informe o mês e ano (MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome "+funcionario.getNome()+".");
		System.out.println("Departamento "+funcionario.getDepartamento().getNome()+".");
		System.out.println("Salário de "+mesAno+" R$ "+String.format("%.2f", funcionario.ganho(ano, mes))+".");
		
		
		sc.close();
	}

}
