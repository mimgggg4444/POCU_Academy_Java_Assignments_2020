package academy.pocu.comp2500.lab2.app;

public class ComplexNumber {
    private double real;
    private double imaginary; //허수라는 뜻!

    public ComplexNumber(){
        this.real= 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double r){
        this.real = r;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double r, double i){
        this.real = r;
        this.imaginary = i;
    }

    public boolean isReal(){
        if (this.real  == 0.0){
            System.out.println("isReal: true");
            return true;
        }else{
            System.out.println("isReal: true");
            return false;
        }
    }

    public boolean isImaginary(){
        if(this.imaginary == 0.0){
            System.out.println("isImaginary: true");
            return true;
        }else{
            System.out.println("isImaginary: false");
            return false;
        }
    }

    public double getConjugate(){
        return this.real;
    }
    // 요거 문제

    public double add(ComplexNumber n1, ComplexNumber n2){
        ComplexNumber temp = new ComplexNumber(0,0);

        temp.real = n1.real + n2.real;
        temp.imaginary = n1.imaginary + n2.imaginary;
        return temp;
    }


}
