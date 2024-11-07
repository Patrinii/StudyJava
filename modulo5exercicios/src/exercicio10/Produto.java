package exercicio10;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double despesas;

    public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.despesas = despesas;
    }

    public double calcularMargemLucro() {
        return ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
}
