package com.company;

public class Course {

    int courseId;
    String courseName;
    int courseFee;

    public Course(int courseId, String courseName, int courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public void displayCourseDetails(){
        System.out.println("Course Id: "+courseId);
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Fee: "+courseFee);
    }
    public static void authentication(String user,String pass){
        if(user.equals("Admin") && pass.equals("1234")){
            Course obj = new Course(0001,"Java",300000);
            obj.displayCourseDetails();
        }
        else
            System.out.println("Invalid Username or Password");

    }

    public static void main(String[] args) {
	// write your code here
        authentication("Admin","1234");
        System.out.println();
        authentication("Sanyam","1052003");

    }
}
