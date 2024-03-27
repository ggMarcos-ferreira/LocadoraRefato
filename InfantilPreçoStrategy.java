/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class InfantilPreçoStrategy implements PreçoStrategy {
    @Override
    public double calcularPreço(int diasAlugada) {
        double valorCorrente = 1.5;
        if (diasAlugada > 3) {
            valorCorrente += (diasAlugada - 3) * 1.5;
        }
        return valorCorrente;
    }
}

