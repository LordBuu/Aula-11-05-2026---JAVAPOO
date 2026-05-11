public class Triangulo extends Forma2D{
    private String style;


    //contrutor padrão
    Triangulo() {
        super();
        style = "nada";
    }

    //construtor para triangulo
    Triangulo(String s, double w, double h) {
        super (w, h, "Triangulo");
        style = s;
    }


    //contrutor de lados iguais
    public Triangulo (double x, String nome, String style) {
        super (x,nome);
        this.style = style;
    }


    //get e set
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    //Implementar metodos abstratos
    public double area() {
        return (getAltura() * getLargura()) / 2;
    }

   

    @Override
    public String toString() {
        return "Triangulo (getLargura()=" + getLargura() + ", getAltura()=" + getAltura() + ", getNome()=" + getNome()
                + ")";
    }
}