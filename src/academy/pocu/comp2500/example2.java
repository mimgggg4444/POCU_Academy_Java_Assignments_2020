package academy.pocu.comp2500;


public class example2 {
    public static int operations(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        int a = operations(2,3);
        System.out.println("2 + 3 = " + a);
        int b = operations(-2, -3);
        System.out.println("(-2) + (-3) = " + b);
        int c = operations(-2, 3);
        System.out.println("(-2) + 3 = " + c);
    }

}