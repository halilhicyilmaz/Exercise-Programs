package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber xy){
        this.imaginary += xy.imaginary;
        this.real += xy.real;
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber xy){
        this.imaginary -= xy.imaginary;
        this.real -= xy.real;
    }
}
