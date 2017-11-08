package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author yasiro01
 */
public class Student {
    private String name;
    private String major;
    private double gpa;
    
    public Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMajor(){
        return major;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public String setMajor(String newMajor){
        major = newMajor;
        return major;
    }
    
    public double setGpa(double newGpa){
        gpa = newGpa;
        return gpa;
    }
    
    @Override
    public String toString(){
        return String.format("%s is majoring in %s with a GPA of %.1f", name, major, gpa);
    }
}
