package com.example.oollan.temperatureconverter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ConverterUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        assertEquals("Conversion from celsius to fahrenheit failed", 212,
                ConverterUtil.convertCelsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals("Conversion from celsius to fahrenheit failed", 100,
                ConverterUtil.convertFahrenheitToCelsius(212), 0.001);
    }
}