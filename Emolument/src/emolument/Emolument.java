/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emolument;

/**
 *
 * @author PRINCE
 */
public class Emolument {
    // Encapsulated data fields
    private double basicSalary;
    private double taxRelief;
    
    //Constructor
    public Emolument(double basicSalary, double taxRelief){
        this.basicSalary = basicSalary;
        this.taxRelief = taxRelief;
    }
    
    //Getter for basicSalary
    public double getBasicSalary(){
        return basicSalary;
    }
    
    //Getter for taxRelief
    public double getTaxRelief(){
        return taxRelief;
    }
    
    //Method to compute SSNIT  contribution
    public double SSNIT(){
        return basicSalary * 0.035;
    }
    
    //Method to compute taxable income
    public double taxableIncome(){
        return basicSalary - (taxRelief + SSNIT());
    }
    

    //Main method to test the class
    public static void main(String[] args) {
        Emolument emp = new Emolument(5000.0, 300.0);
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Tax Relief: " + emp.getTaxRelief());
        System.out.println("SSNIT Contribution: " + emp.SSNIT());
        System.out.println("Taxable Income: "+ emp.taxableIncome());
        
    }
    
}
