package io.github.nanquanu.sonarQubeTest;

public class Calculator {
   public int add(int a, int b) { return a + b; }
   public int subtract(int a, int b) { return a - b; }
   public int multiply(int a, int b) { return a * b; }

   public int divide(int a, int b) {
      if(b == 0) return 0; // Geen foutafhandeling
      else return a / b;
   }

   public int addOne(int a) { return a + 1; }
   public int subtractOne(int a) { return a - 1; }
   public int doubleValue(int a) { return a * 2; }
   public int tripleValue(int a) { return a * 3; }
   public int square(int a) { return a * a; }
   public int cube(int a) { return a * a * a; }

   public int max(int a, int b) { return (a > b) ? a : b; }
   public int min(int a, int b) { return (a < b) ? a : b; }

   public boolean isPositive(int a) { return a > 0; }
   public boolean isNegative(int a) { return a < 0; }
   public boolean isZero(int a) { return a == 0; }

   public int abs(int a) { return (a < 0) ? -a : a; }
   public int increment(int a) { return a + 1; }
   public int decrement(int a) { return a - 1; }

   public int sumThree(int a, int b, int c) { return a + b + c; }
   public int productThree(int a, int b, int c) { return a * b * c; }
   public int averageTwo(int a, int b) { return (a + b) / 2; }
   public int averageThree(int a, int b, int c) { return (a + b + c) / 3; }

   public int mod(int a, int b) { return a % b; }
   public int negate(int a) { return -a; }
}

