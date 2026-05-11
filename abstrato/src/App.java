import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Forma2D NF = new Forma2D(6.5, 5.0, "retangulo");System.out.println();
        


        //aula é isso
        Triangulo TR = new Triangulo(5,"Triangulo","Retangulo");
        //USANDO A IMPLEMENTAÇÃO DO MÉTODO ABSTRATO AREA() DA SUPERCLASSE
        System.out.println("A area do Triangulo é: " + TR.area()+ "\n");

        Retangulo Retangulo = new Retangulo(5);
        System.out.println("A area do Retangulo é: "+ Retangulo.area()+ "\n");

        Circulo Circulo = new Circulo(5);
        System.out.println("A area do Circulo é: " + Circulo.area() + "\n");
        //------------AULA ACABOU AQUI--------------





        //atividade começa aqui agora--------------------------------------------------------------------------------------

        // array de objetos Forma2D
        Forma2D[] AF = new Forma2D[6];

        // adicionando objetos no array
        AF[0] = new Triangulo("Preenchido", 10, 8);
        AF[1] = new Retangulo(5, 4);
        AF[2] = new Retangulo(6);
        AF[3] = new Circulo(3);
        AF[4] = new Circulo(5);
        AF[5] = new Circulo(7);

        //repetição
        for (int i = 0; i < AF.length; i++) {
            System.out.println("Forma: " + AF[i].getNome());
            System.out.println("Área: " + AF[i].area());
            System.out.println("-------------------");
        }



        //MENU

        
        Scanner sc = new Scanner(System.in);

        Forma2D[] formas = new Forma2D[10];
        int contador = 0;
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar Triangulo");
            System.out.println("2 - Cadastrar Retangulo");
            System.out.println("3 - Cadastrar Circulo");
            System.out.println("4 - Mostrar Areas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    if (contador < formas.length) {
                        System.out.print("Base: ");
                        double base = sc.nextDouble();

                        System.out.print("Altura: ");
                        double altura = sc.nextDouble();

                        formas[contador] = new Triangulo("Normal", base, altura);
                        contador++;

                        System.out.println("Triangulo cadastrado!");
                    }
                    break;

                case 2:
                    if (contador < formas.length) {
                        System.out.print("Largura: ");
                        double largura = sc.nextDouble();

                        System.out.print("Altura: ");
                        double altura = sc.nextDouble();

                        formas[contador] = new Retangulo(largura, altura);
                        contador++;

                        System.out.println("Retangulo cadastrado!");
                    }
                    break;

                case 3:
                    if (contador < formas.length) {
                        System.out.print("Raio: ");
                        double raio = sc.nextDouble();

                        formas[contador] = new Circulo(raio);
                        contador++;

                        System.out.println("Circulo cadastrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== FORMAS CADASTRADAS ===");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(
                            formas[i].getNome() +
                            " -> Area: " +
                            formas[i].area()
                        );
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    

   }


}
