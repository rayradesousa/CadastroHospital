/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastropacientes.controller;

import br.com.cadastropacientes.model.Paciente;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp user
 */
public class Salvar {
   private OutputStream os;
   private OutputStreamWriter osw;
   private BufferedWriter bw;
   
   public Salvar() {}
  
   public void salvar (Paciente paciente){
       try {
           
           //Instanciar
           os = new FileOutputStream ("dados_pacientes.txt", true);
           osw = new OutputStreamWriter (os);
           bw = new BufferedWriter(osw);
           
           //Escrita no arquivo
           bw.append(paciente.getNome()+ ", " + paciente.getAlergias()+ ", " + paciente.getAltura()+ ", " + paciente.getAtividadesFisicas()
           + ", " + paciente.getCidade()+ ", " + paciente.getCirurgias()+ ", " + paciente.getCpf()+ ", " + paciente.getDataNascimento()
           + ", " + paciente.getDeficiencia()+ ", " + paciente.getDoencas()+ ", " + paciente.getEndereço()+ ", " + paciente.getGlicose()
           + ", " + paciente.getNumCartaoSus()+ ", " + paciente.getPeso()+ ", " + paciente.getPlanoDeSaude()+ ", " + paciente.getRG()
           + ", " + paciente.getSexo()+ ", " + paciente.getTipoSanguinio()+ ", " + paciente.getTelefone()+ ".");
           bw.newLine();
           
           //Fechar o arquivo
           bw.close();
           osw.close();
           os.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   }
   

