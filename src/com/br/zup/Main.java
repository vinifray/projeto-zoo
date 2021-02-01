package com.br.zup;

import java.util.*;

public class Main {

    public static Scanner criarScanner(){
        return new Scanner(System.in);
    }

    public static List<String> criarListaDeAnimais(){
        List<String> animais = new ArrayList<>();
        String retorno = "";
        do{
            System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
            retorno = criarScanner().nextLine();
            if(!retorno.equalsIgnoreCase("sair")){
                animais.add(retorno);
            }
        }while (!retorno.equalsIgnoreCase("sair"));
        return animais;
    }

    public static void main(String[] args) {
        // Programa que cadastra cada animal de cada zoologico de cada cidade.

        Map<String, List<String>> dicionarioAnimais = new HashMap<>();

        boolean continuar = true;
        while (continuar){
            System.out.println("Digite: \n1 para cadastrar");
            int resposta = criarScanner().nextInt();

            if(resposta == 1){
                System.out.println("Qual zoologico vc vai cadastrar? ");
                String zoologico = criarScanner().nextLine();
                List<String> animais = criarListaDeAnimais();
                dicionarioAnimais.put(zoologico, animais);
            }

        }

    }
}
