package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;

public class Somatorio implements CalculoEstatistico{

    public Somatorio(DadoInterface entrada) {
        calcula(entrada);
    }
    
    @Override
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")
        ArrayList<Double> numeros = entrada.getDados();    
        double soma =0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        entrada.addResultado(new Resultado("Somatório",soma));
}
}
