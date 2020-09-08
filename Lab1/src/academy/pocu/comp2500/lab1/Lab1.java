package academy.pocu.comp2500.lab1.app;

public class Lab1 {
    public static void main(String[] args){
        int addTwoPositives = add(2,3);
        int addTwoNegatives = add(-2,-3);
        int addPositiveAndNegative = add(2,-3);
        System.out.println(String.format("AddTwoPositives(2 + 3 = %s)", addTwoPositives));
        System.out.println(String.format("AddTwoPositives((-2) + (-3) = %s)", addTwoNegatives));
        System.out.println(String.format("AddTwoPositives(2 + (-3) = %s)", addPositiveAndNegative));
    }
    public static int add(int a, int b){
        return a + b;
    }
}