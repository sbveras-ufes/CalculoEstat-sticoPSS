/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pss.calculoestatistico.model;

import java.util.ArrayList;

/**
 *
 * @author UFES
 */
public interface DadoInterface {
    public void addResultado(Resultado resultado);
    public ArrayList<Resultado> getResultado();
    public ArrayList getDados();
    public void setDados(ArrayList dados);
    
}
