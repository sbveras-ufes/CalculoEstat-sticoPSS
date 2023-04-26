package com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos;

import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.model.DadoInterface;
import java.util.ArrayList;

public class Quantidade implements CalculoEstatistico{

    public Quantidade(DadoInterface entrada) {
        calcula(entrada);
    }
    
    @Override
    public void calcula(DadoInterface entrada){
        @SuppressWarnings("unchecked")
        ArrayList<Double> numeros = entrada.getDados();
        entrada.addResultado(new Resultado("Quantidade de números", (double) numeros.size()));
    }
}


