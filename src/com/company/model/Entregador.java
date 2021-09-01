package com.company.model;


public class Entregador extends Funcionarios {

    private Integer zona;

    // Aqui foi criado uma constante, não pode ser alterado.
    private static final Double PLUS = 5000d;

    public Entregador(String nome, String antiguidade, Double salario, Integer tempoDeCasa, Integer zona) {
        super(nome, antiguidade, salario, tempoDeCasa, PLUS); // PLUS um valor constante que não pode ser alterado.
        this.zona = zona;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }



    @Override
    public Double calculePlus() {
        double valorTotal = 0d;
        if (tempoDeCasa >= 3 && zona == 3) {
            valorTotal = salario + PLUS;
        } else {
            valorTotal = salario;
        }
        return valorTotal;
    }

}
