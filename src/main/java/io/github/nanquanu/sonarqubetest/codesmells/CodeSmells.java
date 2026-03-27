package io.github.nanquanu.sonarqubetest.codesmells;

import java.util.*;  

public class CodeSmells {
    
    private static int elementCount = 0;  
    
    public static void main(String[] args) {
        CodeSmells obj = new CodeSmells();
        obj.updateElementCount();  
        
        switch (args.length) {  
            case 0:
                System.out.println("Zero parameters");
                break;
            case 1:
                System.out.println("Single parameter");  
                break;
        }
        
        if (true)  
            System.out.println("I'm true!");
        
        for (int j = 0; j < 5; j = j + 1) {  
            if (j == 2)
            { System.out.println("j equals 2"); }
            else if (j == 3)  
            { System.out.println("j equals "); }
        }
        
        String text = "greeting\\u0000phrase";  
        System.out.println(text.replaceAll("e", "z"));  
    }
    
    public void updateElementCount() {
        elementCount++;  
    }
    
}
