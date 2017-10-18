/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public abstract class Employee {
//Variables**************************************
    protected String type;
    protected String name;
    protected int empID;
    
//Accessors**************************************
    public String getType() { return this.type;}
    public String getName() { return this.name;}
    public int getEmpID() { return this.empID;}
    
//Mutators***************************************
    public void setType(String inType) { this.type = inType;}
    public void setName(String inName) { this.name = inName;}
    public void setIdentification(int inEmpID) { this.empID = inEmpID;}
    
//Abstract Methods*******************************
    public abstract double findPay(); //Each child class has a different way of calculating findPay()
    
//Methods****************************************    
    @Override
    public String toString()
    {
        String str = "Type:  " + this.type + "\n" + "Name:  " + this.name + "\n"+ "Employee ID:  " + this.empID;
        return str;
    }
    
    public boolean equals(Employee other) //Checks if two objects are the same
    {
        return this.getName().equals(other.getName()) && this.getEmpID() == other.getEmpID();
    }
    
//Constructors***********************************
    public Employee(String inName, int inEmpID)
    {
        this.name = inName;
        this.empID = inEmpID;
    }
}