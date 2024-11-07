package exercicio6;

import exercicio5.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao; // Porcentagem da comissão sobre o valor de produção

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBaseComDesconto = super.calcularSalario();
        double valorComissao = valorProducao * (comissao / 100);
        return salarioBaseComDesconto + valorComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor de Produção: R$ " + valorProducao + ", Comissão: " + comissao + "%, Salário Total: R$ " + calcularSalario();
    }
}
