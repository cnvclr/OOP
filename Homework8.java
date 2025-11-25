package smu.Homework;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class CheckerIdPw {
    private final Map<String, String> idpw;
    private final Scanner sc;

    public CheckerIdPw(Map<String, String> idpw, Scanner sc) {
        this.idpw = idpw;
        this.sc = sc;
    }

    public String checkID() {
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!idpw.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.print("\n");
            } else {
                return id;
            }
        }
    }

    public boolean checkPW(String id) {
        while (true) {
            System.out.print("password : ");
            String pw = sc.nextLine().trim();

            if (!(pw.equals(idpw.get(id)))) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.print("\n");
                return false;
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
        return true;
    }

    public void login() {
        while (true) {
            String id = checkID();
            if (checkPW(id)) { break; }
        }
    }
}

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> idpw = new HashMap<>();
        idpw.put("myId", "myPass");
        idpw.put("myId2", "myPass2");
        idpw.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);
        CheckerIdPw checker = new CheckerIdPw(idpw, sc);

        checker.login();

        sc.close();
    }
}