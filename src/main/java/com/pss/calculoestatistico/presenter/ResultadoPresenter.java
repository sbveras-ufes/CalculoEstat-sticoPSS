/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.calculoestatistico.presenter;

import com.pss.calculoestatistico.model.DadoInterface;
import com.pss.calculoestatistico.model.Resultado;
import com.pss.calculoestatistico.view.ResultadoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author UFES
 */
public class ResultadoPresenter {
    private ResultadoView view ;
    private List<LocalDateTime> datas= new ArrayList<>();
    private DadoInterface dados;

    public ResultadoPresenter(JFrame parent, DadoInterface entrada) {
        this.dados=entrada;
        AtualizarTabela(dados);
        view.getDataBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             System.out.println(dados.getResultado());
             view.popularTabela(dados.getResultado());
             view.repaint();  
              
            }
        });
    
    }
    public void MostraResultados(){
        if(!datas.isEmpty()){
            view.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Não existem estatísticas calculadas");
        }
    }
    public void AtualizarTabela(DadoInterface dados){
        this.dados=dados;
        view=new ResultadoView(null, false);
        
    for(Resultado x : dados.getResultado()){
       if(!datas.contains((x.getData())))
        datas.add((x.getData()));
    }
    view.popularDataBox(datas);
    view.popularTabela(dados.getResultado());
    view.repaint();    
    }
    
}
