package com.company.model;


public class Vendedor extends Funcionarios {

    private Double comissao;
    private static final Double PLUS = 5000d;

    public Vendedor(String nome, String antiguidade, Double salario, Integer tempoDeCasa, Double comissao) {
        super(nome, antiguidade, salario, tempoDeCasa, PLUS);
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calculePlus() {
        double valorTotal = 0d;
        if (tempoDeCasa > 5 && comissao > 5000) {
            valorTotal = salario + comissao + PLUS;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comissao=" + comissao +
                '}';
    }
}
