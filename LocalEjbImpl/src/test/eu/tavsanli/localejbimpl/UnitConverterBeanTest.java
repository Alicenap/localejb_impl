package eu.tavsanli.localejbimpl;

import eu.tavsanli.localejbapi.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConverterBeanTest {

    @Test
    public void fahrenheitToCelsius_32Fahrenheit_0Celsius() {
        // given
        final UnitConverter unitConverter = new UnitConverterBean();

        // when
        final Double result = unitConverter.fahrenheitToCelsius(32.0);

        // then
        assertEquals(0.0, result, 0);
    }

    @Test
    public void fahrenheitToCelsius_95Fahrenheit_35Celsius() {
        // given
        final UnitConverter unitConverter = new UnitConverterBean();

        // when
        final Double result = unitConverter.fahrenheitToCelsius(95.0);

        // then
        assertEquals(35.0, result, 0);
    }
}