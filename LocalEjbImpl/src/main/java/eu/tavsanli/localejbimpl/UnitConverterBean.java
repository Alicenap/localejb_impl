package eu.tavsanli.localejbimpl;

import eu.tavsanli.localejbapi.UnitConverter;

import javax.ejb.Stateless;

@Stateless
public class UnitConverterBean implements UnitConverter {

    private static final Double FIVE_OVER_NINE = 5.0 / 9;

    /*
     * Formula: (°F  -  32)  x  5/9 = °C
     */
    @Override
    public Double fahrenheitToCelsius(final Double fahrenheit) {
        return (fahrenheit - 32) * FIVE_OVER_NINE;
    }
}
