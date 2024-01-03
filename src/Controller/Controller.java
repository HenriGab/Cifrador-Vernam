/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cifrador;
import View.TelaInicial;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.InputMap;

/**
 *
 * @author cleitin
 */
public class Controller {
    private TelaInicial view;
    public Cifrador modelo;
    public String  keybii;
    public String abacaxi;

    public Controller(TelaInicial view) {
        this.view = view;
        
    }

   
 

   
   
   
      public void asciitochar(String a){
      String[] output = a.split(",");
      String j = "";
      
       for (int i = 0; i < output.length; i++) {
           int value = Integer.parseInt(output[i],10);
           char c = (char) value;           
           j += c;
       }
       view.getjLabelResult().setText(j);
   }
   
      
   public String bintoAscii(String a){
     
       String[] output = a.split(",");
       String b = "";                         
       for (int i = 0; i < output.length; i++) {
           int decimal = Integer.parseInt(output[i],2);           
           b+= decimal+",";                     
       }
       view.getjLabelResult().setText(b);   
       return b;
   }
    
   public String toAscii(String a){
       
       String[] output = a.split(" ");       
       int b = output.length;  
       int decimal;
       String bc = "";
       String finaly ="";                
       for(int i = 0 ; i < b;i++){          
            int asciifinal[];          
           decimal = Integer.parseInt(output[i],2);
            if(i % 7==0 && i !=0){
            finaly+=",";          
        }         
           finaly+= decimal;                                                       
        }             
       return finaly;       
   }
   
   public String XOROp(String a, String b){
    String [] sb  = a.split(",");
    String [] sc  = b.split(",");   
    String sd = String.join("", sb);
    String se = String.join("", sc);           
    String sa = "";
    int x = sd.length();
    char t ;
    char k;
    String result = " ";
               
    for(int i=0;i<x;i++){                    
        t = se.charAt(i);
        k = sd.charAt(i);       
        int p = (char) (k ^ t);              
       sa+=(int) p+" ";              
         }      
     abacaxi = sa;        
    return sa;
    }
       
 
  
   public String AsciitoBin (int[] s){
          int result[] = new int[s.length];
          String value = "";          
          for (int i = 0; i < s.length; i++) {
           result[i] = Integer.parseInt(Integer.toBinaryString(s[i]));           
           value+=result[i]+","; //nao tirar virgula
       }              
        return value;             
   }
   
   public int[]  StringtoAscii(String string){
       int vetorSta[];
       String k = "";
       vetorSta = new int[string.length()];
       for(int i = 0; i < string.length();++i){
       char c = string.charAt(i);
       int j = (int)c;
       
       vetorSta[i] = j;
       k += Integer.toString(j);
       
       
   }
       
        return vetorSta;
   }
   
   
}