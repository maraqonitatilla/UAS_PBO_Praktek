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
public class Faculty extends Employee{
    private Level level;
    private Education education_object;
    
    Faculty(){
        
    }
    
    public Faculty(String first_name,String last_name, String ID_number, char sex, Date birth_date, Level level, Education education_object){
        super(last_name,first_name,ID_number,sex,birth_date);
        this.level = level;
        this.education_object = education_object;
    }
    
    enum Level{
    AS,AO,FU
    }
    
    @Override
    public double monthlyEarning(){
        if(level == Level.AS){
            return EmployeeInfo.FACULTY_MONTHLY_SALARY;
        }else if(level == Level.AO){
            return 1.2 * EmployeeInfo.FACULTY_MONTHLY_SALARY;
        }else if(level == Level.FU){
            return 1.4 * EmployeeInfo.FACULTY_MONTHLY_SALARY;
        }
        return 0;
    }
    
    public void setLevel(Level level){
        this.level = level;
    }
    
    public Level getLevel(){
        return level;
    }
    
    public void setEducation(Education education_object){
        this.education_object = education_object;
    }
    
    public Education getEducation(){
        return education_object;
    }
    
    public String toString(){
        String role = "";
        
        if(level == Level.AS){
            role = "Assistant Proffessor";
        }else if(level == Level.AO){
            role = "Associate Proffessor";
        }else if(level == Level.FU){
            role = "Full Proffessor";
        }
        String employee = super.toString()+"\n"+role+"\nMonthly Salary: "+monthlyEarning();
        return employee;
    }
}