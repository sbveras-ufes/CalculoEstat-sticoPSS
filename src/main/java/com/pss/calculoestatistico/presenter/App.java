/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.presenter;

import com.pss.calculoestatistico.model.DadoInterface;
import com.pss.calculoestatistico.model.DadosPeso;
import com.pss.calculoestatistico.service.LeitorService.LeitorAbstract;
import com.pss.calculoestatistico.service.LeitorService.LeitorCSV;
import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author UFES
 */
public class App {
  
    
    public static void main(String[] args) {
//    DadoInterface dados ;
    
    new MainPresenter();
//    
//         view.getjMenuImportar().addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 dados=(new DadosPeso(new LeitorCSV(view).ler()));
//                
//             }
//             });
    }


}
