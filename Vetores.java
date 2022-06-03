package projeto9;

import javax.swing.JOptionPane;

public class Projeto9 {

    public static void main(String[] args) {
     
         double [] nota = new double[5];
         double v[] = new double [5];
         double soma = 0, maior = 0;
         int i;
                
         
         for(int i=0; i<5; i++){
         nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
         soma = soma + nota[i];
         
         v[0] = maior;
        
         maior = -1;
         for(i=0; i<5; i++){
             if(nota[i]>maior){
                 maior=nota[i];
             }
         }
         v[1]=maior;
         
         }
          
         maior = -1;
         for(i=0; i<5; i++){
             if(nota[i]>maior) && (nota[i]<v[0])){
             maior = nota[i];
            }
         }
             
             v[j+1]=maior;
             
             for(int j=0; j<5; j++){
             maior = -1;
             for(i=0; i<5; i++){
                 if((nota[i]>maior)&&(nota[i]<v[1])){
                     
                 }
                     
                     v[1]=maior;
                 }
             
             for(i=0; i<5; i++){
                 System.out.println(v[i]);
                 System.out.println("Media = " + (soma/5));
                 
                 }
             }
             
         
                 
             
         
         
        
      
         
         
    
    
    
         
         
         
         
         
        
        
        
    
         
         
         
         
         
         
         
         
    
    

