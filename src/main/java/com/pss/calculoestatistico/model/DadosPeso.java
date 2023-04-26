/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.model;

import java.util.ArrayList;

/**
 *
 * @author UFES
 */
public class DadosPeso implements DadoInterface {
    private ArrayList <Double> peso =new ArrayList<Double>() ;
    private ArrayList <Resultado> resultados = new ArrayList<Resultado>();

    @Override
    public ArrayList getDados() {
        return peso;
    }

    
    @Override
    public void setDados(ArrayList dados) {
        this.peso = dados;
    }

    public DadosPeso(ArrayList<Double> peso) {
        this.peso = peso;
    }

    public DadosPeso() {
    }
    
    public void addPeso(Double peso){
        this.peso.add(peso);
    }
    
    @Override
    public void addResultado(Resultado resultado){
        this.resultados.add(resultado);
    }

    @Override
    public ArrayList<Resultado> getResultado() {
        return resultados;
    }
    @Override
    public String toString(){
       return getResultado().toString();
    }
}
