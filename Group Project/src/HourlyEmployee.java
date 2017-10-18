/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class HourlyEmployee extends Employee{
//Variables**************************************
    private double hoursWorked;
    private double hourlyRate;
   
//Accessors**************************************
    public double getHoursWorked() { return this.hoursWorked;}
    public double getHourlyRate() { return this.hourlyRate;}
    
//Mutators***************************************    
    public void setHoursWorked(double inHoursWorked) { this.hoursWorked = inHoursWorked;}
    public void setHourlyRate(double inHourlyRate) { this.hourlyRate = inHourlyRate;}
    
//Methods****************************************
    @Override
    public double findPay()
    {
        if(hoursWorked <= 40)
            return this.hourlyRate * this.hoursWorked;
        else
            return this.hourlyRate * 40 + ((this.hourlyRate *1.5) * (this.hoursWorked -40));
    }
    
    @Override
    public String toString()
    {
        String str = super.toString() + "\n" + 
                "Hourly Rate:  " + this.getHourlyRate() + "\n" + "Hours Worked:  "+ this.hoursWorked + "\n" + "Total Pay:  "+ this.findPay() + "\n";
        return str;
    }
    
    @Override
    public boolean equals(Employee other)
    {
        if(other instanceof HourlyEmployee)
        {
            HourlyEmployee otherEmployee = (HourlyEmployee)other;
            return super.equals(otherEmployee) && this.hourlyRate == otherEmployee.getHourlyRate();
        }
        return false;
    }
    
//Constructors***********************************
    public HourlyEmployee(String inName, int inEmpID, double inHourlyRate, double inHoursWorked)
    {
        super(inName,inEmpID);
        this.type = "Hourly";
        this.hourlyRate = inHourlyRate;
        this.hoursWorked = inHoursWorked;
    }
}
