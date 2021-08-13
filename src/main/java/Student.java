import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private int totalGrade;
    private String name;
    private ArrayList<String> subjects;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
        subjects = new ArrayList<String>();
        grades = new ArrayList<Integer>();
    }

    public void addMarks(String subject, int grade) {
        subjects.add(subject);                          // 'subjects' reference variable is pointing to a String ArrayList
        grades.add(grade);                              //  autoboxing is done automatically
        totalGrade += grade;                            //  object initialized to 0 during instantiation
    }
        // setting up the 'compareTo()'
    public int compareTo(Student other) {               // 'other' is a formal parameter of student object reference
        if (this.totalGrade > other.totalGrade) return 1;
        else if (this.totalGrade == other.totalGrade) return 0;
        else return -1;


    }
}