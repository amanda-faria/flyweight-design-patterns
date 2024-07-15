package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    private List<Ator> atores = new ArrayList<>();

    public void elencar(String nomeAtor, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Ator ator = new Ator(nomeAtor, cidade);
        atores.add(ator);
    }

    public List<String> obterAtores() {
        List<String> saida = new ArrayList<String>();
        for (Ator ator : this.atores) {
            saida.add(ator.obterAluno());
        }
        return saida;
    }


}