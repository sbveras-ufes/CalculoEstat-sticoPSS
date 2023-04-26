/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.model;

import java.time.LocalDateTime;

/**
 *
 * @author UFES
 */
public class Resultado {
    private String nome;
    private Double valor;
    private LocalDateTime data;

    public Resultado(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
        this.data = LocalDateTime.now().withNano(0);
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
    
    @Override
    public String toString(){
        return "Estatística: "+nome+ " Valor: " +Double.toString(valor) + '\n';
    }
}
