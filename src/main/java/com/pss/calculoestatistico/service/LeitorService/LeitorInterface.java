/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pss.calculoestatistico.service.LeitorService;

import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author UFES
 */
public interface LeitorInterface {
    public FileNameExtensionFilter getFormato();
    
    public ArrayList ler();
}
