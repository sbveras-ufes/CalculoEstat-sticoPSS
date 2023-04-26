package com.pss.calculoestatistico.model;

import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculoEstatisticoService;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
       DadosPeso dados= new DadosPeso((new ArrayList<Double>(Arrays.asList(10.0, 5.0, 6.0, 7.0, 8.0, 2.0))));

        CalculoEstatisticoService calculadora = new CalculoEstatisticoService();
        calculadora.calcular(dados);
        System.out.println(dados);
    }
}

