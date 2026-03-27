package com.mycompany.aaarascunho;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    
    public static void main(String[] args) {
        
        //Qualquer texto que termine com uma letra minúscula seguida de um número
        String regex = "^.*[a-z][0-9]$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("afsdfas4506546af04sd5.6504a1");
        
        if (matcher.matches()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        
    }
    
}
