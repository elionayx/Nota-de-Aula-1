import java.util.Scanner;
public class Produto {

    private double ValorRecebido;

    public double getValorRecebido() {
        return ValorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        ValorRecebido = valorRecebido;
    }

    private int VerificarEstoque;

    public int getVerificarEstoque() {
        return VerificarEstoque;
    }

    public void setVerificarEstoque(int verificarEstoque) {
        VerificarEstoque = verificarEstoque;
    }

    private int pagamento;

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double codigo;

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    private double tamanhooupeso;

    public double getTamanhooupeso() {
        return tamanhooupeso;
    }

    public void setTamanhooupeso(double tamanhooupeso) {
        this.tamanhooupeso = tamanhooupeso;
    }

    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private int estoque;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void VerificarEstoque() {
        if (estoque > 0) {
            System.out.println("Produto disponível no estoque.");
        } else {
            System.out.println("Produto em falta.");
        }
    }

    public void venda() {
        estoque -= 1;
        System.out.println("Estoque do produto: " + estoque);
    }

    public void exibirProduto() {
        venda();

        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tamanho ou peso: " + tamanhooupeso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("Estoque: " + estoque);
    }

    public void Pagamento() {
        double troco = 0;
        Scanner sc = new Scanner(System.in);
        switch (pagamento) {
            case 1:
                System.out.println("Pagamento no Pix feito com sucesso!");
                System.out.println("Valor de desconto foi de " + valor * 0.05);
                break;
            case 2:
                System.out.println("Pagamento no Cartão de Débito feito com sucesso!");
                System.out.println("Valor de desconto foi de " + valor * 0.05);
                break;
            case 3:
                System.out.println("Pagamento em Transferência feito com sucesso!");
                System.out.println("Valor de desconto foi de " + valor * 0.05);
                break;
            case 4:
                System.out.println("Qual o valor em espécie? ");
                double recebido = sc.nextDouble();
                troco = recebido - valor;
                System.out.println("O troco foi de " + troco);
                System.out.println("Pagamento em Espécie feito com sucesso!");
                System.out.println("Valor de desconto foi de " + (valor * 0.05));
                break;
            case 5:
                System.out.println("Deseja parcelar em 3x? (s/n)");
                char parcelar = sc.next().charAt(0);
                if (parcelar == 's' || parcelar == 'S') {
                    double valorParcela = valor / 3;
                    System.out.printf("Valor de cada parcela: %.2f\n", valorParcela);
                    System.out.println("Total a pagar em 3x: " + valor);
                    System.out.println("Pagamento no Cartão de Crédito feito com sucesso!");
                    break;
                }
        }
    }
}