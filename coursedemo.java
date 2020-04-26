package no4;

public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Elric", "Edward", "4");
       
       TextBook myTextBook = new TextBook("Art of Doing Nothing", "Véronique Vienne", "Random House USA Inc");
       
       Course myCourse = new Course("Motivation", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}

