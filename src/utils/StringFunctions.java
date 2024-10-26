/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author heber
 */
public class StringFunctions {
    
    public boolean containOnlyLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }
    public boolean containNumbersOrLetters(String name) {
        return name.matches("[a-zA-Z0-9]+");
        
    }
}


