package OOPS;

// Classes: Class is blueprint of an object
// Objects: Instances of Class with real values

// Array vs Class :
// Array store similar datatype whereas we use class to make the datatypes with multiple datatypes


public class StudentObject {

    public static void main(String[] args){
        // Initializing the object for class Student ready to store value aka allocating memory to store values
        StudentClass x = new StudentClass();
        // Allocating values to each attribute/property of object
        x.name = "Shreel";
        x.rollNumber = 27;
        x.percent = 94.68;
        System.out.println(x.percent);
    }

}
