package 입력.자가진단.자가진단5;

public class Main {
    public static void main(String[] args) {
        double ydtocm = 91.44;
        double intocm = 2.54;

        System.out.printf(" 2.1yd = %5.1fcm", ydtocm*2.1);
        System.out.printf("\n10.5in = %5.1fcm", intocm*10.5);
        // format ; %5.1f --> 소숫점 포함 5자리 확보
    }
}

