package exercicio7;

import exercicio5.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao; // Porcentagem de comissão sobre o valor das vendas

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double valorComissao = valorVendas * (comissao / 100);
        return salarioBaseComDesconto + valorComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor de Vendas: R$ " + valorVendas + ", Comissão: " + comissao + "%, Salário Total: R$ " + calcularSalario();
    }
}
