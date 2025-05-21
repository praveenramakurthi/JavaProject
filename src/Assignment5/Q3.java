package Assignment5;

import javax.script.ScriptEngine;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();
        employees.add("Praveen");
        employees.add("Teju");
        employees.add("Sweety");
        employees.add("Vijay");
        employees.add("Chandu");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String name=sc.nextLine();
        String filteredName=name.toLowerCase();

        try{
            checkEmployee(employees,filteredName);
            System.out.println("Employee "+name+" is present in the list");
        }
        catch(EmployeeNotFoundException e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            System.out.println("Search operation completed");
            sc.close();
        }
    }
    static void checkEmployee(ArrayList<String> list,String name) throws EmployeeNotFoundException{
        if(!list.contains(name)){
            throw new EmployeeNotFoundException("Employee "+name+" not found");
        }
    }
}
