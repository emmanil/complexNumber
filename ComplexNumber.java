package ComplexOperations_codingExercise34;

public class ComplexNumber {

        private double real;
        private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
    public void add(double real, double imaginary){
    this.real = real +this.real;
    this.imaginary =  imaginary + this.imaginary;
    }

    //Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
    public void add(ComplexNumber number){
        add(number.real, number.imaginary);
    }

    //Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    //Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.
    public void subtract(ComplexNumber number){
        subtract(number.real, number.imaginary);
    }

}
