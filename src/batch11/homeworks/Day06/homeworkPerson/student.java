package com.talent.batch11.day6.homeworksDay6ByShin.homeworkPerson;

public class student extends Person{

    public int gradelevel;

    public student(String name, int age) {
        super(name, age);
    }

    public String getRole(){
        return "Student";
    }

    public void introduce(){
        System.out.println("Hi I am Student");
    }

    public static void main(String[] args) {
         student s1 = new student("Steven", 20);
         s1.gradelevel=1000;
        System.out.println(s1.name +"  "+ s1.age +"  " +s1.getRole()+"   "+ s1.gradelevel);
         s1.introduce();

    }

}
