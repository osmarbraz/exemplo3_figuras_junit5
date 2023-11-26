package figuras;

/**
 * Description of the Class
 *
 * @author Osmar de Oliveira Braz Junior
 * @created 14 de Abril de 2007
 */
public class Triangulo {

    private double altura;

    private double base;

    /**
     * Constructor for the Triangulo object
     */
    public Triangulo() {
        this(0, 0);
    }

    /**
     * Constructor for the Triangulo object
     *
     * @param base Description of the Parameter
     * @param altura Description of the Parameter
     */
    public Triangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    /**
     * Gets the altura attribute of the Triangulo object
     *
     * @return The altura value
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Gets the area attribute of the Triangulo object
     *
     * @return The area value
     */
    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }

    /**
     * Gets the base attribute of the Triangulo object
     *
     * @return The base value
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the altura attribute of the Triangulo object
     *
     * @param altura The new altura value
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Sets the base attribute of the Triangulo object
     *
     * @param base The new base value
     */
    public void setBase(double base) {
        this.base = base;
    }
}
