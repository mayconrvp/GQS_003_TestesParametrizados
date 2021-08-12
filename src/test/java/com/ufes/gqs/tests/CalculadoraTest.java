/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.gqs.tests;

import com.ufes.gqs.model.Calculadora;
import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author mayco
 */
public class CalculadoraTest extends TestCase {
    
    @ParameterizedTest
    @ValueSource(doubles={1, 0, 2})
    void testGetValor1(double esperado){
        Calculadora calc = new Calculadora();
        calc.setValor1(esperado);
        assertEquals(esperado, calc.getValor1());
    }
    
    @ParameterizedTest
    @ValueSource(doubles={-1, 0, 1.1})
    void testGetValor2(double esperado){
        Calculadora calc = new Calculadora();
        calc.setValor2(esperado);
        assertEquals(esperado, calc.getValor2());
    }
    
    
    @ParameterizedTest
    @ValueSource(doubles={-1, 0, 1.1})
    void testGetResultado(double esperado){
        Calculadora calc = new Calculadora();
        calc.setResultado(esperado);
        assertEquals(esperado, calc.getResultado());
    }
    
    
    
    
}
