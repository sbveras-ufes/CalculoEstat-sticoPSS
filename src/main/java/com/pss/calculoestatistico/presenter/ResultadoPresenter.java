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
    private ArrayList<Resultado> est=new ArrayList<>();
    

    public ResultadoPresenter(JFrame parent, DadoInterface dados) {
        
        AtualizarTabela(dados);
        view.getDataBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
             AtualizarTabela(dados);
             view.getjTable1().repaint();
              
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
        
        this.view=new ResultadoView(null, false);
        this.est= new ArrayList<Resultado>();
        int i=0;
        for(Resultado x : dados.getResultado()){
           if(!datas.contains((x.getData())))
            datas.add((x.getData()));
        }
        view.popularDataBox(datas);
        for (Resultado y : dados.getResultado()){
                if(y.getData().equals((view.getDataBox().getItemAt(i))))
                est.add(y);
                else break;
        }
        
        view.popularTabela(est);
        i++;
//        view.repaint();    
    }
    
}
