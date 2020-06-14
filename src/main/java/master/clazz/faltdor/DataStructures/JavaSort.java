package main.java.master.clazz.faltdor.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort((Student s1, Student s2) -> {
            if (Math.abs(s1.getCgpa() - s2.getCgpa()) <= 0){
                if (s1.getFname().equalsIgnoreCase(s2.getFname())){
                    return  s1.getId() - s2.getId();
                }
                return s1.getFname().compareTo(s2.getFname());
            }
            return  s1.getCgpa() < s2.getCgpa()  ? 1 : -1;
        });
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
   static class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    }
}


