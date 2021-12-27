
import java.util.Date;

/**
 *
 * @author Deviay
  */
public class Education {
    private String Degree,Major;
    private int Research;
    
    Education(){
        
    }
    
    public Education(String Degree,String Major,int Research){
        this.Major = Major;
        this.Degree = Degree;
        this.Research = Research;
    } 
    
    public void setMajor(String Major){
        this.Major = Major;
    }
    
    public String Major(){
        return Major;
    }
    
        public void setDegree(String Degree){
        this.Degree = Degree;
    }
    
    public String getDegree(){
        return Degree;
    }
    public void setResearch(int Research){
        this.Research = Research;
    }
    
    public int getResearch(){
        return Research;
    }
}
