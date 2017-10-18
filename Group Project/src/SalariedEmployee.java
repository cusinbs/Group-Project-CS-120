/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SalariedEmployee extends Employee{
//Variables**************************************
    private double basePay;
   
//Accessors**************************************
    public double getBasePay() { return this.basePay;}
        
//Mutators***************************************    
    public void setBasePay(double inBasePay) { this.basePay = inBasePay;}
    
//Methods****************************************
    @Override
    public double findPay()
    {
        return getBasePay();
    }
    
    @Override
    public String toString()
    {
        String str = super.toString() + "\n" + "Base Pay:  " + this.basePay + "\n" + "Total Pay:  " + this.findPay() + "\n";
        return str;
    }
    
    @Override
    public boolean equals(Employee other)
    {
        if(other instanceof SalariedEmployee)
        {
            SalariedEmployee otherEmployee = (SalariedEmployee)other;
            return super.equals(otherEmployee) && this.basePay == otherEmployee.getBasePay();
        }
        return false;
    }
    
//Constructors***********************************
    public SalariedEmployee(String inName, int inEmpID, double inBasePay)
    {
        super(inName,inEmpID);
        this.type = "Salaried";
        this.basePay = inBasePay;
    }
}
