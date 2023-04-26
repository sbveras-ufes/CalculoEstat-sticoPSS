/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.service.CalculoEstatísticoService;


import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Somatorio;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Media;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Quantidade;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.DesvioPadrao;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Menor;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Maior;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculosEstatisticos.Variancia;
import com.pss.calculoestatistico.model.*;


/**
 *
 * @author UFES
 */
public class CalculoEstatisticoService {
    public void calcular(DadoInterface dados){
       new DesvioPadrao(dados);
       new Maior(dados);
       new Media(dados);
       new Menor(dados);
       new Quantidade(dados);
       new Somatorio(dados);
       new Variancia(dados);
    }

    public CalculoEstatisticoService(DadoInterface dados) {
        calcular(dados);
    }

    public CalculoEstatisticoService() {
    }
    
    
}
