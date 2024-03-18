import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class Cat{
    // fields
    private String name;
    private int age;
    
    // constructors

    public Cat(){
        name = "unknown";
        age = 0;
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }// end full arg

    // getters and setters
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        //return this.getName() + ": " + this.getAge();
        return name + " " + age;
    }
}


    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
