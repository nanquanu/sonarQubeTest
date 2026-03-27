package io.github.nanquanu.sonarqubetest.codesmells;

import java.util.*;  

public class CodeSmells {
    
    private static int counter = 0;  
    
    public static void main(String[] args) {
        CodeSmells obj = new CodeSmells();
        obj.incrementCounter();  
        
        switch (args.length) {  
            case 0:
                System.out.println("No args");
                break;
            case 1:
                System.out.println("One arg");  
                break;
        }
        
        if (true)  
            System.out.println("No braces!");
        
        for (int i = 0; i < 5; i = i + 1) {  
            if (i == 2)
            { System.out.println("Bad if chain"); }
            else if (i == 3)  
            { System.out.println("Bad if chain"); }
        }
        
        String s = "hello\u0000world";  
        System.out.println(s.replaceAll("l", "x"));  
    }
    
    public void incrementCounter() {
        counter++;  
    }
    
}
