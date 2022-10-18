package Aplicacao;

import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.FuncionarioTerceirizado;

public class Program {
    public static void main(String[] args) throws ParseException{
        
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Digite o numero de funcionários: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Funcionário #" + i + "Informações");
            System.out.print("Terceirizado? (s/n) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Horas: ");
            Integer horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 's'){
                System.out.print("Valor da taxa adicional: ");
                double despesaAdicional = sc.nextDouble();
                Funcionario emp = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);
                list.add(emp);
            }
            else{
                Funcionario emp = new Funcionario(nome, horas, valorPorHora);
                list.add(emp);
            }
        }
        
        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for(Funcionario emp : list){
            System.out.println(emp.getNome() + " -$ " + String.format("%.2f", emp.pagamento()));
        }

        sc.close();
    }
}
