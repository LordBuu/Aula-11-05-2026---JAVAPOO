public abstract class Forma2D {
    private double largura;
    private double altura;
    private String nome;
    
//construtor vazio.
    Forma2D() {
        this.largura = altura = 0.0;
        this.nome = "nada";
}
    
//contrutor parametrizado.
    public Forma2D(double w, double h, String n) {
        this.largura = w;
        this.altura = h;
        this.nome = n;
    }


    //todos lados iguais
    public Forma2D(double x, String nome) {
        this.altura = this.largura = x;
        this.nome = nome;
    }





    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    //metodo abstrato
    public abstract double area();

    





@Override
    public String toString() {
        return "Forma2D --(largura=" + largura + ", altura=" + altura + ", nome=" + nome + ")--";
    }

    

    
}

class Triangulo extends Forma2D{
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



class Circulo extends Forma2D {

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

