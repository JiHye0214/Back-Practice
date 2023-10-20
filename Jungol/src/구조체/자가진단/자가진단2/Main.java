package 구조체.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School inform = new School();
        inform.schoolName2 = sc.next();
        inform.grade2 = sc.nextInt();

        System.out.printf("%d grade in %s school\n", inform.grade1, inform.schoolName1);
        System.out.printf("%d grade in %s school", inform.grade2, inform.schoolName2);

        sc.close();
    }
}

class School {
    String schoolName1 = "Jejuelementary";
    String schoolName2;
    int grade1 = 6;
    int grade2;
}