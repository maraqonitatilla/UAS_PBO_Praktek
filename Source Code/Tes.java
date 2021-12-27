/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Deviay
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("mm/dd/yy");
        
        Employee[] employee = new Employee[9];
        
        try{
            employee[0] = new Staff("Allen","Paita","123",'M',format.parse("2/23/59"),50.00);
            employee[1] = new Staff("Zapatan","Steven","456",'F',format.parse("7/12/64"),35.00);
            employee[2] = new Staff("Rios","Enrique","789",'M',format.parse("6/2/70"),40.00);
            employee[3] = new Faculty("Johnson","Anne","234",'F',format.parse("4/27/62"),Faculty.Level.FU,new Education("Ph.D","Engineering",3));
            employee[4] = new Faculty("Bouris","William","791",'F',format.parse("3/14/75"),Faculty.Level.AO,new Education("Ph.D","English",1));
            employee[5] = new Faculty("Andrade","Christopher","623",'F',format.parse("5/22/80"),Faculty.Level.AS,new Education("MS","Physical Education",0));
            employee[6] = new Partime("Guzman","Augusto","455",'F',format.parse("8/10/77"),35.00,30);
            employee[7] = new Partime("Depirro","Martin","678",'F',format.parse("9/15/87"),30.00,15);
            employee[8] = new Partime("Aldaco","Marque","945",'M',format.parse("11/24/88"),20.00,35);
            Collections.sort(Arrays.asList(employee),new Comparator<Employee>(){
                public int compare(Employee o1, Employee o2){
                    return o1.getIDnumber().compareToIgnoreCase(o2.getIDnumber());
                }
            });
            for (Employee emp : employee) {

                System.out.println(emp.toString());

                System.out.println("");

            }

            System.out.println("STAFF employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == Staff.class) { /* checking if its a Staff object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            System.out.println();

            System.out.println("FACULTY employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == Faculty.class) { /* checking if its a Faculty object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            System.out.println();

            System.out.println("PART TIME employees\n");

            for (Employee emp : employee) {

                if (emp.getClass() == Partime.class) { /* checking if its a Partime object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            float total_salary_all_employees = 0;

            float total_salary_partime_employees = 0;

            for (Employee emp : employee) {

                if (emp.getClass() == Partime.class) { /* checking if its a Partime object */

                    total_salary_partime_employees += emp.monthlyEarning();

                }

                total_salary_all_employees += emp.monthlyEarning();

            }

            System.out.println("\nTotal salary of all part time employees: " + total_salary_partime_employees);

            System.out.println("Total salary of all employees: " + total_salary_all_employees);

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }
     
}
