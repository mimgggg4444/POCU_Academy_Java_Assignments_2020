package academy.pocu.comp2500.lab1.app;

public class Lab1 {
    public static int operations(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        int a = operations(2,3);
        System.out.println(a);

        int b = operations(-2, -3);
        System.out.println(b);

        int c = operations(-2, 3);
        System.out.println(c);
    }

}