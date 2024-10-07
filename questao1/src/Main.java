import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        aluno.setNome(sc.next());
        System.out.println("Digite a primeira nota:");
        aluno.setNota1((double) sc.nextInt());
        System.out.println("Digite a segunda nota:");
        aluno.setNota2((double) sc.nextInt());
        System.out.println("Digite a terceira nota:");
        aluno.setNota3((double) sc.nextInt());

        aluno.calcularMedia();
        aluno.verificarAprovacao();
        aluno.detalhesAluno();
    }
}