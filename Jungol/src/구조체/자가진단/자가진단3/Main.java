package 구조체.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Score one = new Score();
        one.Scoreprint();
        one.avg();
    }
}
class Score {
    Scanner sc = new Scanner(System.in);
    String name1 = sc.next();
    int Kor1 = sc.nextInt();
    int Eng1 = sc.nextInt();
    String name2 = sc.next();
    int Kor2 = sc.nextInt();
    int Eng2 = sc.nextInt();

    public void Scoreprint() {
        System.out.printf("%s %d %d\n", this.name1, this.Kor1, this.Eng1);
        System.out.printf("%s %d %d\n", this.name2, this.Kor2, this.Eng2);
    }

    public void avg() {
        System.out.printf("avg %d %d",(this.Kor1+ this.Kor2)/2, (this.Eng1+this.Eng2)/2);
    }
}