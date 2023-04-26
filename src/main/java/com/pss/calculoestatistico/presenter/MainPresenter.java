/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.presenter;

import com.pss.calculoestatistico.model.DadoInterface;
import com.pss.calculoestatistico.model.DadosPeso;
import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.service.LeitorService.LeitorAbstract;
import com.pss.calculoestatistico.service.LeitorService.LeitorCSV;
import com.pss.calculoestatistico.service.CalculoEstatísticoService.CalculoEstatisticoService;
import com.pss.calculoestatistico.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author UFES
 */
public class MainPresenter {
    private MainView view;
    private ResultadoPresenter resultadoPresenter;
    private String caminho;
    private DadoInterface dados = new DadosPeso();
    

    public String getCaminho() {
        return caminho;
    }

    public MainPresenter() {
        view = new MainView();
        
        view.getjMenuImportar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeitorCSV csv= new LeitorCSV();
                csv= new LeitorCSV(importar(view, csv.getFormato()));
                dados.setDados(csv.ler());
                if (dados.getDados().isEmpty() == false){
                System.out.println(dados.getDados());
                view.popularTabela(dados.getDados());
                view.repaint();}
                
            }
            
        });
     view.getjMenuCalcular().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try{
            if (dados.getDados().isEmpty()==false){
                try {
            new CalculoEstatisticoService(dados);
//                    System.out.println(dados.getResultado());
            if(resultadoPresenter==null){
            resultadoPresenter=new ResultadoPresenter(view, dados);}
            else {
                resultadoPresenter.AtualizarTabela(dados);
            }
                } catch (Exception ex) {
                 JOptionPane.showMessageDialog(view, "Ocorreu um erro durante o calculo dos dados","Erro",JOptionPane.ERROR_MESSAGE);
                 ex.getStackTrace();
                }
            

            }
            else throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                 JOptionPane.showMessageDialog(view, "Não existem dados importados","Atenção",JOptionPane.QUESTION_MESSAGE);   
                }
            }
     });
        
    view.getjMenuResultados().addActionListener(new ActionListener() {
            @Override
                
            public void actionPerformed(ActionEvent e) {
                if (resultadoPresenter !=null)resultadoPresenter.MostraResultados();
                else JOptionPane.showMessageDialog(null, "Não existem estatísticas calculadas. Importe um arquivo.","Atenção",JOptionPane.QUESTION_MESSAGE);
            }
    });
    
        
        
        
        
  }
  public File importar(JFrame view, FileNameExtensionFilter formato){
    JFileChooser importar = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    importar.setFileFilter(formato);
    
        int file = importar.showOpenDialog(view);
        if (file == JFileChooser.APPROVE_OPTION) return importar.getSelectedFile();
        return null;
    }

  
}

    
    
    

