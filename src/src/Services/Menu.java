package Services;

import Exceptions.ValorInvalidoException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private void exibirMenu() {
        System.out.println("\n--- MENU PETSHOP ---");
        System.out.println("1- Cadastrar novo pet");
        System.out.println("2- Alterar dados");
        System.out.println("3- Deletar pet");
        System.out.println("4- Listar todos");
        System.out.println("5- Filtrar pets");
        System.out.println("6- Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int resposta(){
        Scanner scanner = new Scanner(System.in);
        while (true){
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Só é permitido números!");
            scanner.next();
        }
    }
    }

    public void acesso(){
        int res;
        do {
            exibirMenu();
            res = resposta();
            switch (res){
                case 1:
                    System.out.println("1- Cadastrar um novo pet");
                    break;
                case 2:
                    System.out.println("2- Alterar os dados do pet cadastrado");
                    break;
                case 3:
                    System.out.println("3- Deletar um pet cadastrado");
                    break;
                case 4:
                    System.out.println("4- Listar todos os pets cadastrados");
                    break;
                case 5:
                    System.out.println("5- Listar pets por algum critério (idade, nome, raça)");
                    break;
                case 6:
                    System.out.println("6- Sair");
                    break;
                default:
                    exibirMenu();
                    break;
            }
        }while (res != 6);


    }

}
