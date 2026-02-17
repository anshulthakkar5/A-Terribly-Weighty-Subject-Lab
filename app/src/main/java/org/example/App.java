package org.example;

public class App {
  public static void main(String[] args) {
    Converter c = new Converter();

    System.out.println("25C -> F = " + c.celsiusToFahrenheit(25));
    System.out.println("77F -> C = " + c.fahrenheitToCelsius(77));

    System.out.println("10 in -> cm = " + c.inchesToCentimeters(10));
    System.out.println("25.4 cm -> in = " + c.centimetersToInches(25.4));

    System.out.println("5 miles -> km = " + c.milesToKilometers(5));
    System.out.println("8.04672 km -> miles = " + c.kilometersToMiles(8.04672));

    System.out.println("150 lb -> kg = " + c.poundsToKilograms(150));
    System.out.println("68.0389 kg -> lb = " + c.kilogramsToPounds(68.0389));
  }
}
