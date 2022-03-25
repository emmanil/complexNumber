package ComplexOperations_codingExercise34;

public class Main {
    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);

        System.out.println("one.getReal() (2.0)= " + one.getReal());
        System.out.println("one.getImaginary()(2.0)= " + one.getImaginary()+ " \n");
        one.subtract(number);
        System.out.println("one.getReal()(-0,5)= " + one.getReal());
        System.out.println("one.getImaginary()(3.5)= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.getReal()(3.0)= " + number.getReal());
        System.out.println("number.getImaginary()(-5.0)= " + number.getImaginary());


    }
}
