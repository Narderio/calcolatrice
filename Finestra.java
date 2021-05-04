import java.awt.*;
import javax.swing.*;
public class Finestra extends JFrame
{
    private Container container;
    private JPanel panel;
    private JLabel etichettarisultato;
    private JButton c,ce,zero,uno,due,tre,quattro,cinque,sei,sette,otto,nove,piu,meno,per,diviso,uguale;
    boolean primonumero=false,s=false,secondonumero=false;
    public Finestra()
    {
        super("Calcolatrice");
        setSize(260,340);
        setLocation(500,500);
        setResizable(true);
        container=getContentPane();
        panel=new JPanel();
        
        panel.setLayout(null);
        etichettarisultato=new JLabel("0");
        
        uno=new JButton("1");
        due=new JButton("2");
        tre=new JButton("3");
        quattro=new JButton("4");
        cinque=new JButton("5");
        sei=new JButton("6");
        sette=new JButton("7");
        otto=new JButton("8");
        nove=new JButton("9");
        zero=new JButton("0");
        piu=new JButton("+");
        meno=new JButton("-");
        per=new JButton("*");
        diviso=new JButton("/");
        uguale=new JButton("=");
        c=new JButton("C");
        ce=new JButton("CE");
        
        uno.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        due.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        tre.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        quattro.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        cinque.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        sei.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        sette.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        otto.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        nove.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        zero.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        piu.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        per.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        meno.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        diviso.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        c.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        ce.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        uguale.addActionListener(new ascoltatore(etichettarisultato,primonumero,s,secondonumero));
        
        
        panel.add(etichettarisultato);
        panel.add(uno);
        panel.add(due);
        panel.add(tre);
        panel.add(quattro);
        panel.add(cinque);
        panel.add(sei);
        panel.add(sette);
        panel.add(otto);
        panel.add(nove);
        panel.add(zero);
        panel.add(piu);
        panel.add(meno);
        panel.add(per);
        panel.add(diviso);
        panel.add(uguale);
        panel.add(c);
        panel.add(ce);
        
        etichettarisultato.setBounds(10,10,280,50);
        uno.setBounds(10,70,50,50);
        quattro.setBounds(10,130,50,50);
        sette.setBounds(10,190,50,50);
        zero.setBounds(10,250,50,50);
        due.setBounds(70,70,50,50);
        cinque.setBounds(70,130,50,50);
        otto.setBounds(70,190,50,50);
        diviso.setBounds(70,250,50,50);
        tre.setBounds(130,70,50,50);
        sei.setBounds(130,130,50,50);
        nove.setBounds(130,190,50,50);
        uguale.setBounds(130,250,110,50);
        piu.setBounds(190,70,50,50);
        meno.setBounds(190,130,50,50);
        per.setBounds(190,190,50,50);
        
        
        container.add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

   
    
}
