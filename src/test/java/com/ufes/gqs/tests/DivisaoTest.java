package com.ufes.gqs.tests;

import com.ufes.gqs.model.Divisao;
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
public class DivisaoTest extends TestCase {
    
    @ParameterizedTest
    @MethodSource
    void dividirTest(double x1, double x2, double esperado) {
        //arrange
        Divisao divi = new Divisao();
        //act 
        double result = divi.calcular(x1, x2);
        //assert
        assertEquals(esperado, result);
    }
    
    private static Stream<Arguments> dividirTest(){
        return Stream.of(
                Arguments.of(3, 3, 1),
                Arguments.of(6, 2, 3),
                Arguments.of(10, 2, 5)
        );
    }
    
}
