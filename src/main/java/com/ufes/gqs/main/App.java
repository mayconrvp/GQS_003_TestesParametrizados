/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.gqs.main;

import com.ufes.gqs.model.Calculadora;
import com.ufes.gqs.model.Divisao;
import com.ufes.gqs.model.Multiplicacao;
import com.ufes.gqs.model.Soma;
import com.ufes.gqs.model.Subtracao;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class App {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao divi = new Divisao();
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        
        double n1=0;
        double n2=0;
        double result;
        
        try{

            System.out.println("Digite o 1º Número: ");
            n1 = input.nextDouble();
            System.out.println("Digite o 2º Número: ");
            n2 = input.nextDouble(); 

            result = soma.calcular(n1, n2);
            System.out.println("Soma: " +n1+" + "+n2 +" = "+ formatador.format(result));

            result = sub.calcular(n1, n2);
            System.out.println("Subtracao: " +n1+" - "+n2 +" = "+ formatador.format(result));

            result = mult.calcular(n1, n2);
            System.out.println("Multiplicação: " +n1+" * "+n2 +" = "+ formatador.format(result));

            result = divi.calcular(n1, n2);
            System.out.println("Divisão: " +n1+" / "+n2 +" = "+ formatador.format(result));


        }catch(Exception e){
            System.out.println("O valor digitado não é válido");

        }
        
    }
}
