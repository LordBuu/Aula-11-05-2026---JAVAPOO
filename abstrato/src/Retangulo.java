class Retangulo extends Forma2D {


    public Retangulo() {
        super();
    }

    public Retangulo(double x) {
        super(x, "Retangulo quadrado");
    }

    public Retangulo(double a, double l) {
        super(a,l, "Retangulo");
    }

    public double area() {
        return getAltura() + getLargura();
    }
}