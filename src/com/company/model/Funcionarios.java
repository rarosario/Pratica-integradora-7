package com.company.model;

public abstract class Funcionarios {

    private String nome;
    private String antiguidade;
    protected Double salario;
    protected Integer tempoDeCasa;
    private Double plus;

    public Funcionarios(String nome, String antiguidade, Double salario, Integer tempoDeCasa, Double plus) {
        this.nome = nome;
        this.antiguidade = antiguidade;
        this.salario = salario;
        this.tempoDeCasa = tempoDeCasa;
        this.plus = plus;
    }

    public abstract Double calculePlus();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(String antiguidade) {
        this.antiguidade = antiguidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Double getPlus() {
        return plus;
    }

    public void setPlus(Double plus) {
        this.plus = plus;
    }

    @Override
    public String toString() {
        return "Funcionarios{}";
    }
}
