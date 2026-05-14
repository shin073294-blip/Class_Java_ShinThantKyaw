package com.talent.batch11.day6.homeworksDay6ByShin.homeworkPerson;

public class teacher extends Person {

    public String subject;

    public teacher(String name, int age) {
        super(name, age);
    }

    public String getRole(){
        return "Teacher";
    }

    public void introduce(){
        System.out.println("Hi I am Teacher");
    }

    public static void main(String[] args) {
        teacher t1 = new teacher("Daw Thida", 45);
        System.out.println(t1.name+"   "+t1.age+"    "+t1.getRole() +"   "+t1.subject);
        t1.introduce();
    }
}
