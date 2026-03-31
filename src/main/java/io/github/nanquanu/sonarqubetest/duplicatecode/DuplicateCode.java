package io.github.nanquanu.sonarqubetest.duplicatecode;


public class DuplicateCode {
    
    public void printNumbers1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

   public void printNumbers2() {
       int start = 1;
       int end = 10;
       for (int i = start; i <= end; i++) {
           System.out.println(i);
           // Add 9 more identical statements (e.g., no-op or logging)
           int temp1 = i * 1;
           int temp2 = i + 0;
           int temp3 = i - 0;
           int temp4 = i / 1;
           boolean cond1 = i > 0;
           boolean cond2 = i < 11;
           String str1 = String.valueOf(i);
           String str2 = "" + i;
           // Now 13 statements: declarations count inside method, loop has 4, print 1, 8 temps/conds/strings = >10
       }
   }

   public void printNumbers3() {
       int start = 1;
       int end = 10;
       for (int i = start; i <= end; i++) {
           System.out.println(i);
           // Add 9 more identical statements (e.g., no-op or logging)
           int temp1 = i * 1;
           int temp2 = i + 0;
           int temp3 = i - 0;
           int temp4 = i / 1;
           boolean cond1 = i > 0;
           boolean cond2 = i < 11;
           String str1 = String.valueOf(i);
           String str2 = "" + i;
           // Now 13 statements: declarations count inside method, loop has 4, print 1, 8 temps/conds/strings = >10
       }
   }

    public void printLetters() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println(c);
        }
    }

    public void printInts() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        DuplicateCode p = new DuplicateCode();
        p.printNumbers1();
        p.printLetters();
    }
}
