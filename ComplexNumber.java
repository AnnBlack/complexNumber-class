import java.util.Locale;

public final class ComplexNumber
{
    private static final ComplexNumber I = new ComplexNumber(0, 1);
    private static final ComplexNumber ZN = new ComplexNumber(0, -1);
    private final double real, imag;
    
    public ComplexNumber()
    {
	this(0, 0);
    }
    
    public ComplexNumber(double real)
    {
	this(real, 0.0);
    }
    
    public ComplexNumber(double real, double imag)
    {
        this.real = real;
	this.imag = imag;
    }

    private double getRealPart()
    {
        return real;
    }
    
    private double getImagPart()
    {
        return imag;
    }
    
    public ComplexNumber multiply(ComplexNumber z)
    {       
        if (this.imag == 0.0 || z.getImagPart() == 0.0){
            return new ComplexNumber(this.real * z.getRealPart(), this.imag * z.getRealPart());
        }
    
        return new ComplexNumber(
            (this.real * z.getRealPart()) - (this.imag * z.getImagPart()),
            (this.real * z.getImagPart()) + (this.imag * z.getRealPart()));
    }
    
    public ComplexNumber inverse()
    {
        return new ComplexNumber(getImagPart(), getRealPart());
    }
    
    public String toString()
    {
       return "("+ String.format(Locale.ENGLISH, "%.1f", real) + ", " + String.format(Locale.ENGLISH, "%.1f", imag) + "j)";
    }
}