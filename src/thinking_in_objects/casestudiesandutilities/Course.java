package thinking_in_objects.casestudiesandutilities;
import java.util.Arrays;

public class Course {
    private static final int DEFAULT_CAPACITY_OF_ARR = 100;
    private String courseName;
    private String[] students = new String[DEFAULT_CAPACITY_OF_ARR];
    private int numberOfStudents;
//  Parametrized Constructor
    public Course(String courseName){
        this.courseName = courseName;
    }
//  Accessor Method
    public String getCourseName(){return courseName;}
    public String[] getStudents(){return students;}
    public int getNumberOfStudents(){return numberOfStudents;}

//  Implementing Methods
    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student){
        for(int i = 0; i < numberOfStudents; i++){
            if(students[i].equals(student)){
                students[i] = students[numberOfStudents--];
                break;
            }
        }
    }
    public void clear(){
        Arrays.fill(students, null);
    }
}
