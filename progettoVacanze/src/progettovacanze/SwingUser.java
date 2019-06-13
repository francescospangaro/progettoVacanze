/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Galimberti Francesco
 *
 * @version Prototipo1.0
 * @brief la classe collabora con la classe DatiCondivisi
 */
public class SwingUser {

    /**
     * @author Riccardi Francesco
     *
     * @brief crea i daticondivisi
     */
    private DatiCondivisi dati;

    /**
     * @author Riccardi Francesco
     *
     * @brief crea un frame che conterrà i componenti
     */
    private JFrame frame;

    private boolean controllo;

    private JButton su;
    private JButton giu;
    private JButton destra;
    private JButton sinistra;
    private JButton stop;
    private JButton go;

    /**
     * @author Riccardi Francesco
     * @brief crea un pannello che contiene: un pannello su cui aggiungere
     * bottoni uno slider che regola l'inclinazione delle scatole una label per
     * visualizzare il valore dell`inclinazione un bottone "STOP" che quando
     * viene premuto ferma e chiude il gioco un bottone "Aumenta" che quando
     * viene premuto incrementa di 1 il valore dell'inclinazione sull'asse delle
     * x e setta con il nuovo valore lo slider. un bottone "Decrementa" che
     * quando viene premuto decrementa di 1 il valore dell'inclinazione
     * sull'asse delle x e setta con il nuovo valore lo slider. un bottone
     * "Reset" che quando viene premuto riporta a 0 il valore dell'inclinazione
     * sull'asse delle x e setta con il nuovo valore lo slider.
     */
    public DatiCondivisi getDati() {
        return dati;
    }

    public SwingUser(DatiCondivisi ptrdati) {

        /**
         * controllo viene settato a false, variabile utilizzata in caso gli
         * slider vengano modificati prima della conferma del numero delle
         * scatole
         *
         */
        this.controllo = false;
        this.dati = ptrdati;
        frame = new JFrame("Controlli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controls = new JPanel();  //aggiunge un pannello su cui aggiungere bottoni
        controls.setLayout(new FlowLayout(FlowLayout.CENTER));
        

        /**
         *
         * Creazione del bottone "Aumenta" che quando viene premuto incrementa
         * di 1 il valore dell'inclinazione sull'asse delle x e setta con il
         * nuovo valore lo slider.
         *
         */
        
      
        /**
         *
         * Creazione del bottone "Decrementa" che quando viene premuto
         * decrementa di 1 il valore dell'inclinazione sull'asse delle x e setta
         * con il nuovo valore lo slider.
         *
         */
        

        /**
         *
         * Creazione del bottone "Reset" che quando viene premuto riporta a 0 il
         * valore dell'inclinazione sull'asse delle x e setta con il nuovo
         * valore lo slider.
         *
         */
        su = new JButton("SU");
        su.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        giu = new JButton("GIU'");
        giu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        go = new JButton("GIOCA");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dati.setGioco(true);
                dati.signalBlocco();
            }
        });
        
        stop = new JButton("STOP");
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        /**
         *
         * Creazione del bottone "STOP" che quando viene premuto ferma e chiude
         * il gioco
         *
         */
        destra = new JButton("DESTRA");
        destra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        
        sinistra = new JButton("SINISTRA");
        sinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        /**
         *
         * Inserisce il numero di scatole sull'asse delle x
         *
         */
        

        controls.add(go);
        controls.add(stop);
        controls.add(su);
        controls.add(giu);
        controls.add(destra);
        controls.add(sinistra);
        
        frame.add(controls);
        frame.setSize(200, 150);
    }

    /**
     * @author Riccardi Francesco
     *
     * @brief il metodo permette di rendere visibile lo SwingGui
     */
    public void show() {
        frame.setVisible(true);
    }

}