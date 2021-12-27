
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Deviay
  */
public abstract class Employee {
    
   private String last_name,first_name,ID_number;
   private char sex;
   private Date birth_date; 
   
   Employee(){
       
   }
   
   Employee(String first_name,String last_name, String ID_number, char sex, Date birth_date){
       this.last_name = last_name;
       this.first_name = first_name;
       this.ID_number = ID_number;
       this.sex = sex;
       this.birth_date = birth_date;
   }
   
   public void setLastname(String last_name){
       this.last_name = last_name;
   }
   
   public String getLastname(){
       return last_name;
   }
   
   public void setFirstname(String first_name){
       this.first_name = first_name;
   }
   
   public String getFirstname(){
       return first_name;
   }
   
   public void setIDnumber(String ID_number){
       this.ID_number = ID_number;
   }
   
   public String getIDnumber(){
       return ID_number;
   }
   
   public void setSex(char sex){
       this.sex = sex;
   }
   
   public char getSex(){
       return sex;
   }
   
   public void setBirthdate(Date birth_date){
       this.birth_date = birth_date;
   }
   
   public Date getBirthdate(){
       return birth_date;
   }
   
   public String toString(){
       SimpleDateFormat format_date = new SimpleDateFormat("mm/dd/yy");
       
       String employee = "ID Employee number: "+ID_number+"\nEmployee name: "+first_name+" "+last_name+"\nSex: "+sex+"\nBirth date: "+format_date.format(birth_date);
       
       return employee;
   }
   
   public abstract double monthlyEarning();
   
}


