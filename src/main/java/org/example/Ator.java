package org.example;

public class Ator {

    private String nome;
    private Cidade cidadeResidencia;

    public Ator(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterAluno() {
        return "Aluno{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeResidencia.getNome() + '\'' +
                ", uf='" + cidadeResidencia.getUf() + '\'' +
                '}';
    }
}