/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cliente {
    private String nome;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + fimDeLinha);
        
        while(alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel aluguel = alugueis.next();
            valorCorrente = aluguel.calcularPreço();
            pontosDeAlugadorFrequente += aluguel.getFita().getCódigoDePreço() == Fita.LANÇAMENTO && aluguel.getDiasAlugada() > 1 ? 2 : 1;
            resultado.append("\t").append(aluguel.getFita().getTítulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }
        
        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        resultado.append("Você acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");

        return resultado.toString();
    }
}

