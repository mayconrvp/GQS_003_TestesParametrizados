package com.ufes.gqs.tests;

import com.ufes.gqs.model.Soma;
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
public class SomaTest extends TestCase {

    @ParameterizedTest
    @MethodSource
    void somarTest(double x1, double x2, double esperado) {
        //arrange
        Soma sum = new Soma();
        //act 
        double result = sum.calcular(x1, x2);
        //assert
        assertEquals(esperado, result);
    }
    
    private static Stream<Arguments> somarTest(){
        return Stream.of(
                Arguments.of(3, 3, 6),
                Arguments.of(6, 2, 8),
                Arguments.of(10, 2, 12)
        );
    }
    
}
