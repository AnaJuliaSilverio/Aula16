import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DebugExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarDecoracoes();
        System.out.println("Exemplo do calculo do retangulo com funções");
        mostrarDecoracoes();

        calcularSomaAreas();

        mostrarDecoracoes();
        System.out.println("Exemplo de mostrar lista de números com funções");
        mostrarDecoracoes();

        List<Integer> listaNumerosArray = retornarListaNumeros(quantidadeElementosLista());
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        mostrarDecoracoes();
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        mostrarDecoracoes();

        int capacidade = quantidadeElementosLista();
        List<String> listaNomesComQuantidade = mostrarMensagemComQuantidade(retornarListaNumeros(capacidade),retornarListaNomes(capacidade));

        mostrarDecoracoes();
        System.out.println("Exemplo de array = "+listaNomesComQuantidade);


    }
    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura =scanner.nextDouble();

        return calcularAreaRetangulo(base,altura);
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;
        System.out.println("O valor da área do retangulo é "+areaRetangulo);
        return areaRetangulo;
    }

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: "+somaAreas);
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

    public static List<Integer> retornarListaNumeros(int capacidade) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaNumero = new ArrayList<>();
        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um numero: ");
            listaNumero.add(scanner.nextInt());
        }

        return listaNumero;
    }

    public static List<String> mostrarMensagemComQuantidade(List<Integer> quantidade,List<String> mensagem) {
        List<String> nomesExibir = new ArrayList<>();

        for (int i = 0; i < (quantidade.size()); i++) {
            nomesExibir.add(quantidade.get(i) +" "+mensagem.get(i));
            System.out.println(nomesExibir.get(i));
        }
        return nomesExibir;
    }

    public static List<String> retornarListaNomes(int capacidade) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < capacidade; i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.next());
        }

        return listaNomes;
    }
    public static int quantidadeElementosLista(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade da lista");
        int capacidade = scanner.nextInt();
        return  capacidade;
    }

    public static void mostrarDecoracoes(){
        System.out.println("=========================================================");
    }

}