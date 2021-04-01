//The task here is to add two complex numbers together, addition of complex numbers involves adding the real and imaginary
//parts separately.

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

  public ComplexNumber sum(ComplexNumber other ){
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new ComplexNumber(r, i);
  }

    public ComplexNumber difference (ComplexNumber other ) {
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new ComplexNumber(r, i);
    }

    @Override public String toString()
    { return real + " + " + imaginary + "i"; }


}
