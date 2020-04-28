package thinking_in_objects.exercises;

import thinking_in_objects.casestudiesandutilities.Course;

public class Exercise9 {
    public static void main(String[] args){
        Course course = new Course("Java");
        course.addStudent("Mandy");
        course.addStudent("Mahesh");
        course.addStudent("Suresh");
        course.addStudent("William");
        course.dropStudent("Mahesh");
        for(String str : course.getStudents()){
            if(str != null) System.out.println(str);
        }
    }
}
