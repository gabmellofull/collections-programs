package dio.exercicios;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Cores{

    public static void main(String[] args) {

        //Cria um objeto arraylist da interface List
        List<String> arcoIris = new ArrayList<>();

        //adicina cores a lista
        arcoIris.add("violeta");
        arcoIris.add("anil");
        arcoIris.add("azul");
        arcoIris.add("verde");
        arcoIris.add("amarelo");
        arcoIris.add("laranja");
        arcoIris.add("vermelho");

        System.out.println("=====Cores=====");

        //mostra elementos um abaixo do outro
        for(String cor: arcoIris){
            System.out.println(cor);
        }

        System.out.println("============");

        //mostra tamanho da lista
        System.out.println("O arco iris tem " + arcoIris.size() + " cores!");

        //Cria um objeto TreeSet da interface Set com a collection que já existe
        //Organiza em ordem natural. Padrão de TreeSetsout
        System.out.println("===Ordem Natural====");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);

        //mostra arcoIris2 em ordem reversa
        System.out.println("===Ordem Reversa====");
        Collections.reverse(arcoIris);
        System.out.println(arcoIris);

        //Cria objeto iterator e atribui a list
        Iterator<String> arcoIris3 = arcoIris.iterator();

        //remoção de elementos que não começam com v
        System.out.println("===não começam com v====");
        while(arcoIris3.hasNext()){
            if (arcoIris3.next().startsWith("v") == false){
                arcoIris3.remove();
            }
        }
        System.out.println(arcoIris);

        //limpa a lista
        arcoIris.clear();
        System.out.println(arcoIris);

        //verifica se a lista está vazia e retorna um boolean
        System.out.println("O conjunto está vazio? " + arcoIris.isEmpty());



    }

}
