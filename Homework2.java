package smu.Homework;
import java.util.Scanner;

class Student {
    int id;
    String name;    // 이름
    String major;   // 전공
    long number;    // 전화번호; 앞의 0을 제거, int 대신 long 타입으로 저장

    /* setter */
    public void setID(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMajor(String major) { this.major = major; }
    public void setNumber(long number) { this.number = number; }

    /* getter */
    public int getID() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public long getNumber() { return number; }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 1; i <= 3; i++) {
            System.out.printf("%d번째 학생의 학번, 이름, 전공, 전화번호를 입력하세요.\n", i);
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long number = sc.nextLong();

            Student student = new Student();
            student.setID(id);
            student.setName(name);
            student.setMajor(major);
            student.setNumber(number);
            students[i - 1] = student;
        }

        System.out.printf("\n================= 학생 정보 ================\n");
        for (int i = 0; i < 3; i++) {
            Student student = students[i];
            String n = Long.toString(student.getNumber());
            String formatted = "010-" + n.substring(2, 6) + "-" + n.substring(6);
            System.out.printf("학번 : %d, 이름 : %s, 전공 : %s, 전화번호 : %s\n",
                    student.getID(), student.getName(), student.getMajor(), formatted);;

        }

        sc.close();
    }
}
