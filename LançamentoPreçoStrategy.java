/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class LançamentoPreçoStrategy implements PreçoStrategy {
    @Override
    public double calcularPreço(int diasAlugada) {
        return diasAlugada * 3;
    }
}

