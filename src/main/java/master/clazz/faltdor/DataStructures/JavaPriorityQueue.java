package main.java.master.clazz.faltdor.DataStructures;

import java.util.*;

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
class Student{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    private PriorityQueue<Student> studentsQueue =  new PriorityQueue<>((Student s1, Student s2)->{
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) <= 0){
            if (s1.getName().equals(s2.getName())){
                return  s1.getId() - s2.getId();
            }
            return s1.getName().compareTo(s2.getName());
        }
        return  s1.getCgpa() < s2.getCgpa()  ? 1 : -1;
    });

    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();
        for (String event: events) {
            String[] elements = event.split(" ");
            String operation = elements[0];
            switch (operation){
                case "ENTER":
                    studentsQueue.add(new Student(Integer.parseInt(elements[3]), elements[1], Double.valueOf(elements[2])));
                    break;
                case "SERVED":
                    studentsQueue.poll();
                    break;
                default:
                    break;
            }
        }
        int size = studentsQueue.size();
        for (int i = 0; i < size; i++) {
            students.add(studentsQueue.poll());
        }
        return students;
    }
}