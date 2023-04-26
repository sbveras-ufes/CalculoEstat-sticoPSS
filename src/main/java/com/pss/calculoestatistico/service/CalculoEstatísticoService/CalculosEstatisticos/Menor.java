package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;
import java.util.Collections;

public class Menor implements CalculoEstatistico{

    public Menor(DadoInterface entrada) {
        calcula(entrada);
    }
    
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")
        ArrayList<Double> numeros = entrada.getDados();
        entrada.addResultado(new Resultado("Menor", Collections.min(numeros))) ;
    }
}

