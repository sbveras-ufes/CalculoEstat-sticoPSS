package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;
import java.util.Collections;

public class Maior implements CalculoEstatistico{

    public Maior(DadoInterface entrada) {
        calcula(entrada);
    }
    @Override
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")
        ArrayList<Double> numeros = entrada.getDados();
        entrada.addResultado(new Resultado("Maior", Collections.max(numeros))) ;
    }
}
