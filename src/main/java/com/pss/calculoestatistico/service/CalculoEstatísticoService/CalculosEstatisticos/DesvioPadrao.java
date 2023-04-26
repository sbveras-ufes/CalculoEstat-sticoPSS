package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;

public class DesvioPadrao implements CalculoEstatistico {

    public DesvioPadrao(DadoInterface entrada) {
        calcula(entrada);
    }
    
    
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")

        ArrayList<Double> numeros = entrada.getDados();
        
        double soma = 0;
        double p1 = 1 / Double.valueOf(numeros.size() - 1);
        double somaAoQuadrado = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaAoQuadrado += Math.pow(numeros.get(counter), 2);
        }
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeros.size()));
        entrada.addResultado(new Resultado("Desvio Padrão", Math.sqrt(p1 * p2))); 
    }
}
