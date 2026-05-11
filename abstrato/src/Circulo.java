public class Circulo extends Forma2D {

    // construtor padrão
    public Circulo() {
        super();
    }

    // construtor com raio
    public Circulo(double raio) {
        super(raio, "Circulo");
    }

    // implementando método abstrato
    @Override
    public double area() {
        double raio = getLargura();
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo (raio=" + getLargura() +
               ", nome=" + getNome() + ")";
    }
}