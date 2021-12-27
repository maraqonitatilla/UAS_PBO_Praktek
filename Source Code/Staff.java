/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author Deviay
 */
public class Staff extends Employee{
    private double Hourly_rate;
    
    Staff(){
        
    }
    
    Staff(String first_name,String last_name, String ID_number, char sex, Date birth_date, double Hourly_rate){
       super(last_name,first_name,ID_number,sex,birth_date);
       this.Hourly_rate = Hourly_rate;
    }
    
    @Override
    public double monthlyEarning(){
        return Hourly_rate * EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED; 
    }
    
    public void SetHourly_rate(double Hourly_rate){
        this.Hourly_rate = Hourly_rate;
    }
    
    public double getHourly_rate(){
        return Hourly_rate;
    }
    
    public String toString(){
        String employee = super.toString()+"\nMonthly Salary: "+monthlyEarning();
        return employee;
    }
}
