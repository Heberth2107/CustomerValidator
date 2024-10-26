/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author heber
 */
public class Customer {
    
    private String firstName;
    private String secondName;
    private double totalPurchase;
    private int classe;
    private int lastPurchase;
    private double discountAmount;
    
    public String GetFirstName(){
        return firstName;
    }
    
    public void SetFirstName(String value){
        this.firstName = value;
    }
    
    public String GetSecondName(){
        return secondName;
    }
    
    public void SetSecondName(String value){
        this.secondName = value;
    }
    
     public double GetPurchase(){
        return totalPurchase;
    }
    
    public void SetPurchase(double value){
        this.totalPurchase = value;
    }
    
     public int GetLastPurchase(){
        return lastPurchase;
    }
    
    public void SetLastPurchase(int value){
        this.lastPurchase = value;
    }
    
     public int GetClasse(){
        return classe;
    }
    
    public void SetClass(int value){
        this.classe = value;
    }
    
    public boolean ValidarClasse(){
        
        boolean valid = true;
        
        if(this.classe <= 0 || this.classe >= 4){
            valid = false;
        }
        
        return valid;
        
    }
    
    public double CalcularDesconto(){
        
        if(this.classe == 1  && this.lastPurchase == 2024){
            this.discountAmount = this.totalPurchase * 0.70;
        }
        else if(this.classe == 1  && this.lastPurchase == 2024){
            this.discountAmount = this.totalPurchase * 0.70;
        }
        
        return this.discountAmount;
    }
}
