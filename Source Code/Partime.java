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
public class Partime extends Staff {
    int Hours_week;
    
    Partime(){
        
    }
    
    public Partime(String first_name,String last_name, String ID_number, char sex, Date birth_date, double Hourly_rate, int Hours_week){
        super(last_name,first_name,ID_number,sex,birth_date,Hourly_rate);
        this.Hours_week = Hours_week;
    }
    
    public void setHours_week(int Hours_week){
        this.Hours_week = Hours_week;
    }
    
    public int getHours_week(int Hours_week){
        return Hours_week;
    }
    
    @Override
    public double monthlyEarning(){
        return super.getHourly_rate() * Hours_week * 4;
    }
    
    public String toString(){
        return super.toString() + "\nHours works per month: "+Hours_week*4;
    }
}
