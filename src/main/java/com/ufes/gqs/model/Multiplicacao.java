/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.gqs.model;

/**
 *
 * @author mayco
 */
public class Multiplicacao extends Calculadora implements Operacao{

    @Override
    public double calcular(double x1, double x2) {
        resultado = x1*x2;
        return resultado;
    }
    
}
