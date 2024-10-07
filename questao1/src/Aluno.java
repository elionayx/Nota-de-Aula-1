public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double Nota1, Nota2, Nota3, Media, Aprovado;

    public Double getNota1() {
        return Nota1;
    }

    public void setNota1(Double Nota1) {
        this.Nota1 = Nota1;
    }

    public Double getNota2() {
        return Nota2;
    }

    public void setNota2(Double Nota2) {
        this.Nota2 = Nota2;
    }

    public Double getNota3() {
        return Nota3;
    }

    public void setNota3(Double Nota3) {
        this.Nota3 = Nota3;
    }

    public Double getMedia() {
        return Media;
    }

    public void setMedia(Double Media) {
        this.Media = Media;
    }

    public void calcularMedia() {
        Media = ((Nota1 + Nota2 + Nota3) / 3);
        System.out.println("Sua média é:" + Media);
    }

    public Double getAprovado() {
        return Aprovado;
    }

    public void setAprovado(Double Aprovado) {
        this.Aprovado = Aprovado;
    }

    public void verificarAprovacao() {
        if (Media >= 7) {
            System.out.println("Aprovado!");
        } else if (Media >= 5.0 && Media <= 6.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }

    public void detalhesAluno() {
        System.out.println(nome);
        System.out.println(Nota1 + Nota2 + Nota3);
    }
}