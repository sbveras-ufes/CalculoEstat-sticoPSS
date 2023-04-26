package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;

public class Media implements CalculoEstatistico{

    public Media(DadoInterface entrada) {
        calcula(entrada);
    }
    @Override
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")
        ArrayList<Double> numeros = (ArrayList<Double>) entrada.getDados();
        double total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total += numeros.get(i);
        }
        entrada.addResultado(new Resultado("Média", total / numeros.size()));
    }  
}
