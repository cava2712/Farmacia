package Esame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeCliente extends JFrame implements ActionListener {
    private final JButton BtnMed;
    private final JButton BtnGuariscimi;
    private final JButton BtnContatta;
    private final JButton BtnRicetta;
    private final JButton BtnFarmaci;
    private final JButton BtnProfilo;
    private final JButton BtnDisc;
    private final JLabel vuota,vuota2;
    private final JMenuBar MenuBar;
    private final JMenu Opzioni;
    private final JMenu Carrello;
    private final JMenuItem Disconnetti,Profilo;


    public HomeCliente(String nomeUtente,String passUtente) {
        super("HOME");
        BtnMed = new JButton("MIE MEDICINE");
        BtnGuariscimi= new JButton("GUARISCIMI");
        BtnContatta = new JButton("CONTATTA");
        BtnRicetta = new JButton("IMMETTI RICETTA");
        BtnFarmaci = new JButton("TUTTI I FARMACI");
        BtnProfilo = new JButton("PROFILO");
        BtnDisc = new JButton("Disconnettiti");
        vuota=new JLabel();
        vuota2=new JLabel();

        MenuBar= new JMenuBar();
        Opzioni = new  JMenu("opzioni");
        Carrello = new  JMenu("Carrello");
        Disconnetti= new JMenuItem("Disconnetiti");
        Profilo= new JMenuItem(("profilo"));
        MenuBar.add(Opzioni);
        MenuBar.add(Carrello);
        Opzioni.add(Disconnetti);
        Opzioni.add(Profilo);


        JPanel p1 = new JPanel(new GridLayout(2, 3));
        p1.add(BtnMed);
        p1.add(BtnGuariscimi);
        p1.add(BtnContatta);
        p1.add(BtnRicetta);
        p1.add(BtnFarmaci);
        p1.add(BtnProfilo);
        JPanel p3 = new JPanel(new GridLayout(1, 3));
        p3.add(vuota);
        p3.add(vuota2);
        p3.add(BtnDisc);

        JPanel p4 = new JPanel(new BorderLayout());
        p4.add(p1, BorderLayout.NORTH);
        p4.add(p3, BorderLayout.SOUTH);

        /* JFrame methods called */
        this.setJMenuBar(MenuBar);
        setContentPane(p4);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Esame.HomeCliente("davide","figo");
    }
}