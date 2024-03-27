/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Fita {
    private String título;
    private PreçoStrategy preçoStrategy;

    public Fita(String título, PreçoStrategy preçoStrategy) {
        this.título = título;
        this.preçoStrategy = preçoStrategy;
    }

    public String getTítulo() {
        return título;
    }

    public double calcularPreço(int diasAlugada) {
        return preçoStrategy.calcularPreço(diasAlugada);
    }
}

