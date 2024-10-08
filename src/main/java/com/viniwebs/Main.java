package com.viniwebs;

import com.viniwebs.domain.Connection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Conversor de Moeda");

        while (true) {
            menu();
            String option = sc.next();
            if (option.equals("7")) break;

            System.out.print("Digite o valor que deseja converter: ");
            double value = sc.nextDouble();

            switch (option) {
                case "1":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("BRL/USD/" + value).conversion_result());
                    break;
                case "2":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("BRL/EUR/" + value).conversion_result());
                    break;
                case "3":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("BRL/ARS/" + value).conversion_result());
                    break;
                case "4":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("USD/EUR/" + value).conversion_result());
                    break;
                case "5":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("USD/BRL/" + value).conversion_result());
                    break;
                case "6":
                    System.out.println("Resultado da conversão: " + Connection.getConnection("EUR/BRL/" + value).conversion_result());
                    break;
                default:
                    System.out.println("Insira um valor válido");
                    break;
            }
        }

    }

    public static void menu(){
        System.out.println("***************************************************");
        System.out.println("1) Real Brasileiro ==> Dólar Americano");
        System.out.println("2) Real Brasileiro ==> Euro");
        System.out.println("3) Real Brasileiro ==> Peso Argentino");
        System.out.println("4) Dólar Americano ==> Euro");
        System.out.println("5) Dólar Americano ==> Real Brasileiro");
        System.out.println("6) Euro ==> Real Brasileiro");
        System.out.println("7) Sair");
        System.out.println("***************************************************");
        System.out.print("Selecione a opção desejada: ");
    }
}