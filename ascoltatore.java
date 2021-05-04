import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ascoltatore implements ActionListener
{
    private JLabel etichettarisultato;
    int primo,secondo,risultato;
    boolean primonumero,secondonumero,s;
    String segno;
    public ascoltatore(JLabel etichettarisultato,boolean primonumero, boolean s, boolean secondonumero)
    {
        this.etichettarisultato=etichettarisultato;
        this.primonumero=primonumero;
        this.s=s;
        this.secondonumero=secondonumero; 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(primonumero==false && s==false && secondonumero==false)
              inserisciprimonumero(e);
        
            
             
             else if(primonumero==true && s==false && secondonumero==false)
                inseriscisegno(e);
             
             
             
             else if(primonumero==true && s==true && secondonumero==false)
                    inseriscisecondonumero(e);
             
             else if(primonumero==true && s==true && secondonumero==true)
                    funzionerisultato(e);
                 
       }
              
             
     public void inserisciprimonumero(ActionEvent e)
    {
        if(e.getActionCommand().equals("1"))
                  primo=1;
                else if(e.getActionCommand().equals("2"))
                    primo=2;
                  else if(e.getActionCommand().equals("3"))
                      primo=3;
                    else if(e.getActionCommand().equals("4"))    
                         primo=4;
                       else if(e.getActionCommand().equals("5"))
                           primo=5;
                         else if(e.getActionCommand().equals("6"))
                              primo=6;
                            else if(e.getActionCommand().equals("7"))
                                 primo=7;
                              else if(e.getActionCommand().equals("8"))
                                    primo=8;
                                 else if(e.getActionCommand().equals("9"))
                                        primo=9;
                                     else if(e.getActionCommand().equals("0"))
                                          primo=0;
              primonumero=true;
            etichettarisultato.setText(String.valueOf(primo));
        
        
    }
    
    public void inseriscisegno(ActionEvent e)
    {
        if(e.getActionCommand().equals("+"))
                  segno="+";
               else if(e.getActionCommand().equals("-"))
                   segno="-";
                 else if(e.getActionCommand().equals("*"))
                     segno="*";
                   else if(e.getActionCommand().equals("/"))
                     segno="/"; 
        s=true;
        
        etichettarisultato.setText(String.valueOf(primo+segno));
    }

    public void inseriscisecondonumero(ActionEvent e)
    {
        if(e.getActionCommand().equals("1"))
                  secondo=1;
                else if(e.getActionCommand().equals("2"))
                    secondo=2;
                  else if(e.getActionCommand().equals("3"))
                      secondo=3;
                    else if(e.getActionCommand().equals("4"))    
                         secondo=4;
                       else if(e.getActionCommand().equals("5"))
                           secondo=5;
                         else if(e.getActionCommand().equals("6"))
                              secondo=6;
                            else if(e.getActionCommand().equals("7"))
                                 secondo=7;
                              else if(e.getActionCommand().equals("8"))
                                    secondo=8;
                                 else if(e.getActionCommand().equals("9"))
                                        secondo=9;
                                     else if(e.getActionCommand().equals("0"))
                                          secondo=0;
        secondonumero=true;
        
        etichettarisultato.setText(String.valueOf(primo+segno+secondo));
    }
    
    public void funzionerisultato(ActionEvent e)
    {
      if(e.getActionCommand().equals("="))
        if(segno=="+")
                  risultato=primo+secondo;
                else if(segno=="-")
                    risultato=primo-secondo;
                   else if(segno=="*")
                      risultato=primo*secondo;
                     else if(segno=="/")
                        risultato=primo/secondo;
                      
               etichettarisultato.setText(String.valueOf(risultato));
        
        
    }
   
}
