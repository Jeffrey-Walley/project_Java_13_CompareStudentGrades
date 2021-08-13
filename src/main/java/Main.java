// project 13 Compare Student Grades      -- Begin Coding Fast   site: https://www.youtube.com/watch?v=sL6LGxxLmAI&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=13
/*
    1- check which student has highest total marks
    2- use 'compareTo()' from Comparable interface
    3- Instantiate Student objects
    4- get subjects and marks for each object
    5- compare the total marks for students
 */

public class Main {
    public static void main(String[] args) {
        Student trelvyn = new Student("Trelvyn");
        trelvyn.addMarks("English", 63);
        trelvyn.addMarks("Math", 78);
        trelvyn.addMarks("History", 89);
        trelvyn.addMarks("Physical Ed", 100);
        trelvyn.addMarks("Lunch", 100);
        trelvyn.addMarks("Fluffin' and Shrimpin'", 98);

        Student jimmel = new Student("Jimmel");
        jimmel.addMarks("English", 88);
        jimmel.addMarks("Math", 89);
        jimmel.addMarks("History", 78);
        jimmel.addMarks("Physical Ed", 90);
        jimmel.addMarks("Lunch", 100);
        jimmel.addMarks("Fluffin' and Shrimpin'", 84);

        if (trelvyn.compareTo(jimmel) > 0) {
            System.out.println(trelvyn.getName() + " got the higher total grade");
        } else if (trelvyn.compareTo(jimmel) < 0) {
            System.out.println(jimmel.getName() + " got the higher grade");
        } else {
            System.out.println("Both Students got the same total grade");
            }

        }
    }

