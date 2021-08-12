package com.ufes.gqs.tests;

import com.ufes.gqs.model.Multiplicacao;
import java.util.stream.Stream;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author mayco
 */
public class MultiplicacaoTest extends TestCase {
    
    @ParameterizedTest
    @MethodSource
    void multiplicarTest(double x1, double x2, double esperado) {
        //arrange
        Multiplicacao mult = new Multiplicacao();
        //act 
        double result = mult.calcular(x1, x2);
        //assert
        assertEquals(esperado, result);
    }
    
    private static Stream<Arguments> multiplicarTest(){
        return Stream.of(
                Arguments.of(3, 3, 9),
                Arguments.of(6, 2, 12),
                Arguments.of(10, 2, 20)
        );
    }
}
