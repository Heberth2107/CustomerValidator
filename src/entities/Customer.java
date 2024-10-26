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
    
    public double CalculateTotalValue(){
            
            //Classe 1
        if(this.classe == 1){
            //Last Purhase in 2024
            if (this.lastPurchase == 2024)
            {
                this.totalPurchase = this.totalPurchase * 0.70;
            }
            //No purchase in the last 5 years
            if (this.lastPurchase < 2019)
            {
                this.totalPurchase = this.totalPurchase * 0.90;
            }
            else if (this.lastPurchase < 2024)
            {
                //Last purchase less than 2024 and greater than 2019
                this.totalPurchase = this.totalPurchase * 0.80;
            }
            
        }
       
            //Classe 2
        if(this.classe == 1){
            //Last Purhase in 2024
            if (this.lastPurchase == 2024)
            {
                this.totalPurchase = this.totalPurchase * 0.85;
            }
            //No purchase in the last 5 years
            if (this.lastPurchase < 2019)
            {
                this.totalPurchase = this.totalPurchase * 0.95;
            }
            else if (this.lastPurchase < 2024)
            {
                //Last purchase less than 2024 and greater than 2019
                this.totalPurchase = this.totalPurchase * 0.87;
            }
            
        }
        
        //Classe 2
        if(this.classe == 2){
            //Last Purhase in 2024
            if (this.lastPurchase == 2024)
            {
                this.totalPurchase = this.totalPurchase * 0.85;
            }
            //No purchase in the last 5 years
            if (this.lastPurchase < 2019)
            {
                this.totalPurchase = this.totalPurchase * 0.95;
            }
            else if (this.lastPurchase < 2024)
            {
                //Last purchase less than 2024 and greater than 2019
                this.totalPurchase = this.totalPurchase * 0.87;
            }
            
        }
        
        //Classe 3
        if(this.classe == 3){
            //Last Purhase in 2024
            if (this.lastPurchase == 2024)
            {
                this.totalPurchase = this.totalPurchase * 0.97;
            }
            
            
        }
       
        
        return this.totalPurchase;
    }
}
