/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.service.LeitorService;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author UFES
 */
public class LeitorCSV extends LeitorAbstract{
    private FileNameExtensionFilter formato = new FileNameExtensionFilter("Arquivo CSV", "csv");
    private File caminho;
    ArrayList dados= new ArrayList<Double>();
    
    public ArrayList ler(){
        
        try {
        CSVReader leitor= new CSVReader(new FileReader(caminho));
        
        String[] linha;
        while((linha= leitor.readNext()) != null){
            for (String coluna : linha) {
                    dados.add(Double.parseDouble(coluna));
                }
        }
        leitor.close();
        }catch(IOException e){
               JOptionPane.showMessageDialog(null, "Erro de I/O");
        }
        catch (Exception f) {
            JOptionPane.showMessageDialog(null, "Por Favor, selecione um arquivo válido");
        }
        return dados;
    }
    
    
    @Override
     public FileNameExtensionFilter getFormato() {
        return formato;
    }

    public LeitorCSV(File caminho) {
        this.caminho=caminho;
     
//        System.out.println(dados);
        }
        
    public LeitorCSV(){

    }
     
}
