package Java_Priority_Queue;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

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

    @Override
    public int compareTo(Student o) {

        if (this.cgpa == o.cgpa)
        {
            if (this.name.compareTo(o.name) == 0)
            {
                if (id == o.id)
                    return 0;
                else if (id > o.id)
                    return 1;
                else
                    return -1;
            } else return this.name.compareTo(o.name);
        } else if (this.cgpa > o.cgpa)
            return -1;
        else return 1;
    }
}

class Priorities {

    public List<Student> getStudents(List events) {
        PriorityQueue<Student> res = new PriorityQueue<>();
        for (Object i : events) {
            String[] stSplit = ((String) i).split(" ");
            if (stSplit[0].equals("ENTER"))
                res.add(new Student(Integer.parseInt(stSplit[3]), stSplit[1], Double.parseDouble(stSplit[2])));
            if (stSplit[0].equals("SERVED") && res != null) res.poll();

        }
        while(res.size()>1)
        {
            System.out.println(res.poll().name);
        }
        return new ArrayList<Student>(res);

    }
}

public class Solution {
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
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }


    }
}
