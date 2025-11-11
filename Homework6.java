package smu.Homework;

class Course {
    protected String code;
    protected String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }

    public String getName() { return name; }
}

class OnlineCourse extends Course {
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    public String toString() {
        String msg = "Code: " + code + ", Name: " + name + ", Type: Online";
        return msg;
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    public String toString() {
        String msg = "Code: " + code + ", Name: " + name + ", Type: Offline";
        return msg;
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Objected Oriented Programing");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programing 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
