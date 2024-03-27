/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class NormalPreçoStrategy implements PreçoStrategy {
    @Override
    public double calcularPreço(int diasAlugada) {
        double valorCorrente = 2;
        if (diasAlugada > 2) {
            valorCorrente += (diasAlugada - 2) * 1.5;
        }
        return valorCorrente;
    }
}

