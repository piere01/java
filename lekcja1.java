package pl.edu.uwm.po.lab1;

public class Start {
    public static void main(String[] args){
        System.out.println("StartApp is running");
       System.out.println(zad1());
        System.out.println(zad2());
        System.out.println(zad3());
        zad4();
        zad5();
        zad7();

    }
    static int zad1 () {
        return 31 + 29 + 31;
    }
    static int zad2 () {
        int x=0;
        for (int i=1;i<=10;i++){
            x+=i;
        }
        return x;
    }
    static int zad3 () {
        int x = 1;
        for (int i = 1; i <= 10; i++) {
            x *= i;
        }
        return x;
    }
    static void zad4 () {
        float x = 1000;
        for (int i = 1; i <= 3; i++) {
            x *= 1.06;
            System.out.println(x);
        }
    }
    static void zad5 () {
        System.out.println("+----+");
        System.out.println("|JAVA|");
        System.out.println("+----+");
    }
    static void zad7 () {
        System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" *   *");
        System.out.println("*-----*");
        System.out.println("| .-. |");
        System.out.println("| . . |");
        System.out.println("+-+-+-+");
    }
}

