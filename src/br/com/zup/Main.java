package br.com.zup;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<>();

        String nomeFuncionario;
        String telefoneFuncionario;
        String emailFuncionario;
        String cpfFuncionario;
        String removerFuncionario;
        String consultarFuncionario;
        int cpfDiferente = 0;
        boolean funcionarioEncontrado = false;
        boolean funcionarioCadastrado = false;
        boolean finalizar = false;

        while (!finalizar) {

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

            switch (opcaoDesejada) {

                case 1:

                    if (funcionarios.size() == 0){
                        System.out.println("Não foi encontrado nenhum úsuario cadastrado!");
                    }
                    else {
                        System.out.println("--------------------------------------------------");
                        System.out.println("|             LISTA DE FUNCIONÁRIOS              |");
                        System.out.println("--------------------------------------------------");
                        for (String funcionario : funcionarios.keySet()) {
                            System.out.println("|  " + funcionarios.get(funcionario) + "; CPF: " + funcionario);
                        }
                        System.out.println("--------------------------------------------------");
                        System.out.println("Fim de exibição");
                    }
                    break;

                case 2:

                    System.out.println("--------------------------------------------------");
                    System.out.println("|               FICHA DE CADASTRO                |");
                    System.out.println("--------------------------------------------------");
                    System.out.print("|  Digite o nome completo do funcionario: ");
                    nomeFuncionario = input.nextLine();
                    System.out.print("|  Digite o telefone do funcionario: ");
                    telefoneFuncionario = input.nextLine();
                    System.out.print("|  Digite o email do funcionario: ");
                    emailFuncionario = input.nextLine();
                    System.out.print("|  Digite o CPF do funcionario: ");
                    cpfFuncionario = input.nextLine();
                    System.out.println("--------------------------------------------------");

                    for (String funcionario : funcionarios.keySet()) {

                        if (cpfFuncionario.equals(funcionario)) {
                            System.out.println("CPF já cadastrado no sistema!");
                        }
                        else {
                            funcionarioCadastrado = true;
                        }
                    }

                    if (funcionarioCadastrado | funcionarios.size() == 0) {

                        funcionarios.put(cpfFuncionario, "Nome: " + nomeFuncionario + "; Telefone: " + telefoneFuncionario + "; Email: " + emailFuncionario);
                        System.out.println("Cadastro do funcionario efetuado com sucesso!");
                    }
                    break;

                case 3:

                    System.out.println("--------------------------------------------------");
                    System.out.print("|  Digite o CPF do usuário que deseja consultar: ");
                    consultarFuncionario = input.nextLine();

                    for (String funcionario : funcionarios.keySet()) {
                        if (consultarFuncionario.equals(funcionario)) {
                            System.out.println("|  " + funcionarios.get(funcionario) + "; CPF: " + funcionario);
                            funcionarioEncontrado = true;
                            System.out.println("--------------------------------------------------");
                            System.out.println("Pesquisa finalizada!");
                            break;
                        }
                        else {
                            cpfDiferente++;
                        }
                    }
                    if (!funcionarioEncontrado | funcionarios.size() == 0 | cpfDiferente == funcionarios.size()) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("CPF não encontrado!");
                    }
                    break;

                case 4:

                    System.out.println("--------------------------------------------------");
                    System.out.print("|  Digite o CPF do funcionário que deseja remover: ");
                    removerFuncionario = input.nextLine();
                    System.out.println("--------------------------------------------------");

                    if (funcionarios.size() == 0) {
                        System.out.println("CPF não encontrado!");
                    }
                    else {
                        for (String funcionario : funcionarios.keySet()) {

                            if (removerFuncionario.equals(funcionario)) {
                                funcionarios.remove(funcionario);
                                System.out.println("Funcionario removido com sucesso!");
                                break;
                            }
                            else {
                                System.out.println("CPF não encontrado!");
                            }
                        }
                    }
                    break;

                case 5:

                    System.out.println("PROGRAMA FINALIZADO!");
                    finalizar = true;
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA! Por favor, digite um número de acordo com o menu de opções!");
            }
        }
    }
}
