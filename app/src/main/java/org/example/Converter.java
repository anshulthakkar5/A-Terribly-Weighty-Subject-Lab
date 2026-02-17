package org.example;

public class Converter {

  // Temperature
  public double celsiusToFahrenheit(double c) {
    return (c * 9.0 / 5.0) + 32.0;
  }

  public double fahrenheitToCelsius(double f) {
    return (f - 32.0) * 5.0 / 9.0;
  }

  // Length
  public double inchesToCentimeters(double in) {
    return in * 2.54;
  }

  public double centimetersToInches(double cm) {
    return cm / 2.54;
  }

  public double milesToKilometers(double miles) {
    return miles * 1.609344;
  }

  public double kilometersToMiles(double km) {
    return km / 1.609344;
  }

  // Mass
  public double poundsToKilograms(double lb) {
    return lb * 0.45359237;
  }

  public double kilogramsToPounds(double kg) {
    return kg / 0.45359237;
  }

  // Optional helper if tests expect rounding
  public double roundTo(double value, int decimals) {
    if (decimals < 0) throw new IllegalArgument
