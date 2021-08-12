/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufes.gqs.tests;

import com.ufes.gqs.model.Soma;
import com.ufes.gqs.model.Subtracao;
import java.util.stream.Stream;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author mayco
 */
public class SubtracaoTest extends TestCase {
    
    @ParameterizedTest
    @MethodSource
    void subtrairTest(double x1, double x2, double esperado) {
        //arrange
        Subtracao sub = new Subtracao();
        //act 
        double result = sub.calcular(x1, x2);
        //assert
        assertEquals(esperado, result);
    }
    
    private static Stream<Arguments> subtrairTest(){
        return Stream.of(
                Arguments.of(0, 0, 0),
                Arguments.of(0, 1, -1),
                Arguments.of(1, 0, 1),
                Arguments.of(6, 2, 4),
                Arguments.of(10, 2, 8)
        );
    }
}
