/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastropacientes.controller;

import br.com.cadastropacientes.model.Paciente;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author hp user
 */
public class LerArquivos {
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    private ArrayList <String> linha;
    private String valor;

    public LerArquivos() {}
    
    public Paciente ler () {
    
     linha = new ArrayList<String>();
     
        try {
            is = new FileInputStream ("dados_pacientes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
           
        valor = br.readLine();
        while (valor != null) {
         linha.add(valor);  
          valor = br.readLine();  
        }
        
        br.close();
        isr.close();
        is.close();
        
        char c;
        int contador = 0;
        String valores = "";
        Paciente p = new Paciente(); 
        
            for (int i = 0; i < linha.get(contador).length(); i++) {
               c = linha.get(0).charAt(i);
                
                if (c == ',' && contador == 0) {
                    p.setNome(valores);
                    valores = "";
                    contador++;
                
                } else if(c == ',' && contador == 1) {
                    p.setNumCartaoSus(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 2) {
                     p.setEndereço(valores);
                     valores = "";
                     contador++;
                
                }else if(c == ',' && contador == 3) {
                     p.setCidade(valores);
                     valores = "";
                     contador++;
                    
                }else if(c == ',' && contador == 4) {
                    p.setCpf(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 5) {
                    p.setRG(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 6) {
                    p.setTelefone(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 7) {
                    p.setSexo(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 8) {
                    p.setTipoSanguinio(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 9) {
                    p.setPeso(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 10) {
                    p.setAltura(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 11) {
                    p.setDataNascimento(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 12) {
                    p.setAlergias(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 13) {
                    p.setPlanoDeSaude(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 14) {
                    p.setDoencas(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 15) {
                    p.setAtividadesFisicas(valores);
                    valores = "";
                    contador++;
                
                }else if(c == ',' && contador == 16) {
                    p.setCirurgias(valores);
                    valores = "";
                    contador = 0;
                
                }else {
                   valor += c;
                }
            }
                     return p;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerArquivos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } catch (IOException ex) {
            Logger.getLogger(LerArquivos.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
    
    }}


  
    
    

