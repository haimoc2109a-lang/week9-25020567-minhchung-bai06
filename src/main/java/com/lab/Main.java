package com.lab;

/** Demo entry point. */
public final class Main {
  private Main() {
  }

  /** Executes a sample shipping calculation. */
  public static void main(String[] args) {
    new ShippingCalculator().calculate(5, "EXPRESS");
  }
}
