/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emolument;

/**
 *
 * @author PRINCE
 */
public class MyEmolument {
    private double basicSalary;
    private double taxRelief;
    
    //Default constructor
    public MyEmolument(){
        this.basicSalary = 0;
        this.taxRelief = 0;
    }
    
    //Constructor with parameters
    public MyEmolument(double basicSalary, double taxRelief){
        this.basicSalary = basicSalary;
        this.taxRelief = taxRelief;
    }
    
    //Method to compute Income tax
    public double IncomeTax(){ 
        double taxableIncome = basicSalary - taxRelief;
        double incomeTax = 0; 
        
        if(taxableIncome <= 500){
            incomeTax = taxableIncome * 0.05;
        } else if(taxableIncome <= 1000){
            incomeTax = 500 * 0.05 + (taxableIncome - 500) * 0.125;
        } else {
            incomeTax = 500 * 0.05 + 500 * 0.125 + (taxableIncome - 1000) * 0.175;
        }
    
       return incomeTax;
    }
       
}
