package dio.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 1. "Telefonou para a vítima?"
 2. "Esteve no local do crime?"
 3. "Mora perto da vítima?"
 4. "Devia para a vítima?"
 5. "Já trabalhou com a vítima?"
 Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
 "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
 */

public class QuestionarioList {

        public static void main(String[] args) {

            //cria objeto respostas em List
            List<String> respostas = new ArrayList<>();

            //inicia o scanner
            Scanner scanner = new Scanner(System.in);

            System.out.println("Perguntas: ");

            //recebem as respostas e adicionam na lista. Tudo em minusculo
            System.out.print("\nTelefonou para vítima? ");
            String resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            //==
            System.out.print("Esteve no local do crime? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            //==
            System.out.print("Mora perto da vítima? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            //==
            System.out.print("Devia para vítima? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            //==
            System.out.print("Já trabalhou com a vítima? ");
            resposta = scanner.next();
            respostas.add(resposta.toLowerCase());

            //mostra a Lista
            System.out.println(respostas);

            //cria uma variavel contador
            int count = 0;

            //cria objeto contador do Iterator que vai receber a lista em sequencia
            Iterator<String> contador = respostas.iterator();

            //se houver proxima string o contador vai dar inicio
            //cada elemento da lista vai ser armazanado na variavel resp
            //se a resposta conter s, ou seja, for positiva, count vai receber +1
            while(contador.hasNext()){
                String resp = contador.next();
                if(resp.contains("s")) {
                    count ++;
                }
            }
            //count vai fornecer a esposta para o caso
            switch(count) {
                case 2:
                    System.out.println(">> SUSPEITA <<"); break;
                case 3:
                case 4:
                    System.out.println(">> CÚMPLICE <<"); break;
                case 5:
                    System.out.println(">> ASSASSINO <<"); break;
                default:
                    System.out.println(">> INOCENTE <<"); break;
            }
        }
}

