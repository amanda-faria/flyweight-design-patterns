package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FilmeTest {

    @Test
    void deveRetornarAtores() {
        Filme filme = new Filme();
        filme.elencar("Wagner Moura", "Salvador", "BA");
        filme.elencar("Morena Silva de Vaz Setta Baccarin", "Rio de Janeiro", "RJ");
        filme.elencar("Rodrigo Santoro", "Petrópolis", "RJ");
        filme.elencar("Bruna Marquezine", "Duque de Caxias", "RJ");

        List<String> saida = Arrays.asList(
                "Aluno{nome='Wagner Moura', cidade='Salvador', uf='BA'}",
                "Aluno{nome='Morena Silva de Vaz Setta Baccarin', cidade='Rio de Janeiro', uf='RJ'}",
                "Aluno{nome='Rodrigo Santoro', cidade='Petrópolis', uf='RJ'}",
                "Aluno{nome='Bruna Marquezine', cidade='Duque de Caxias', uf='RJ'}");

        assertEquals(saida, filme.obterAtores());
    }

    @Test
    void deveRetornarTotalCidades() {
        Filme filme = new Filme();
        filme.elencar("Wagner Moura", "Salvador", "BA");
        filme.elencar("Morena Silva de Vaz Setta Baccarin", "Rio de Janeiro", "RJ");
        filme.elencar("Rodrigo Santoro", "Petrópolis", "RJ");
        filme.elencar("Bruna Marquezine", "Duque de Caxias", "RJ");

        assertEquals(4, CidadeFactory.getTotalCidades());
    }
}