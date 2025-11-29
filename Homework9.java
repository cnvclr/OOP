package smu.Homework;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class DBChecker {
    private final Map<String, String> db = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);

    public void dbReader() {
        try {
            FileReader fr = new FileReader("db.txt");
            BufferedReader f = new BufferedReader(fr);

            String line;
            while ((line = f.readLine()) != null) {
                line = line.trim();

                String[] idpw = line.split("\\s+");
                String id = idpw[0];
                String pw = idpw[1];
                db.put(id, pw);
            }
        }
        catch (Exception e) { e.printStackTrace(); }
    }

    public String checkerID() {
        while (true) {
            System.out.print("id와 password를 입력해주세요.\n");
            System.out.print("id: ");
            String id = sc.nextLine().trim();

            if (!(db.containsKey(id))) {
                System.out.print("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                System.out.print("\n");
            } else {
                return id;
            }
        }
    }
    public boolean checkerPW(String id) {
        while (true) {
            System.out.print("password: ");
            String pw = sc.nextLine().trim();

            if (!(pw.equals(db.get(id)))) {
                System.out.print("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                System.out.print("\n");
                return false;
            } else {
                System.out.print("id와 비밀번호가 일치합니다.\n");
                break;
            }
        }
        return true;
    }
    public void login() {
        while (true) {
            String id = checkerID();
            if (checkerPW(id)) { break; }
        }
    }
}

public class Homework9 {
    public static void main(String[] args) {
        DBChecker dc = new DBChecker();
        dc.dbReader();

        dc.login();
    }
}
