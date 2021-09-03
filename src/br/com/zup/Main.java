package br.com.zup;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();

        Boolean finalizar = false;

        while (finalizar == false) {

            System.out.println("--------------------------------------------------");
            System.out.println("|                 MENU DE OPÇÕES                 |");
            System.out.println("|------------------------------------------------|");
            System.out.println("|  Digite 1 para exibir a lista de funcionários  |");
            System.out.println("|  Digite 2 para cadastrar um funcionário        |");
            System.out.println("|  Digite 3 para pesquisar um funcionário        |");
            System.out.println("|  Digite 4 para remover um funcionário          |");
            System.out.println("|  Digite 5 para finalizar                       |");
            System.out.println("--------------------------------------------------");
            System.out.print("Digite um número referente a opção desejada: ");
            int opcaoDesejada = input.nextInt();
            input.nextLine();

            if (opcaoDesejada == 1 ){
                System.out.println("--------------------------------------------------");
            }
            else if (opcaoDesejada == 2){
                System.out.println("--------------------------------------------------");
            }
            else if (opcaoDesejada == 3) {
                System.out.println("--------------------------------------------------");
            }
            else if (opcaoDesejada == 4) {
                System.out.println("--------------------------------------------------");
            }
            else if (opcaoDesejada == 5) {
                System.out.println("PROGRAMA FINALIZADO!");
                finalizar = true;
            }
            else {
                System.out.println("OPÇÃO INVÁLIDA! Por favor, digite um número de acordo com o menu de opções!");
            }
        }
    }
}
