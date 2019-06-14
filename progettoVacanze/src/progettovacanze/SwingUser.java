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

    
    public DatiCondivisi getDati() {
        return dati;
    }

    public SwingUser(DatiCondivisi ptrdati) {

        this.controllo = false;
        this.dati = ptrdati;
        frame = new JFrame("Controlli");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controls = new JPanel();  //aggiunge un pannello su cui aggiungere bottoni
        controls.setLayout(new FlowLayout(FlowLayout.CENTER));
     
        /**
         * @brief creo un bottone per far andare il serpente verso l'alto
         */
        su = new JButton("SU");
        su.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dati.getSnake().setDirD(false);
                dati.getSnake().setDirS(false);
                dati.getSnake().setDirSu(true);
                dati.getSnake().setDirGiu(false);
            }
        });

        /**
         * @brief creo un bottone per far andare il serpente verso il basso
         */
        giu = new JButton("GIU'");
        giu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dati.getSnake().setDirD(false);
                dati.getSnake().setDirS(false);
                dati.getSnake().setDirSu(false);
                dati.getSnake().setDirGiu(true);
            }
        });

        /**
         * @brief creo un bottone per far partire il gioco
         */
        go = new JButton("GIOCA");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dati.setGioco(true);
                dati.signalBlocco();
            }
        });
        
        /**
         * @brief creo un bottone che ferma il gioco
         */
        stop = new JButton("STOP");
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dati.setGioco(false);
            }
        });
      
        /**
         * @brief creo un bottone per far andare il serpente verso destra
         */
        destra = new JButton("DESTRA");
        destra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dati.getSnake().setDirD(true);
                dati.getSnake().setDirS(false);
                dati.getSnake().setDirSu(false);
                dati.getSnake().setDirGiu(false);
            }
        });
        
        /**
         * @brief creo un bottone per far andare il serpente verso sinistra
         */
        sinistra = new JButton("SINISTRA");
        sinistra.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dati.getSnake().setDirD(false);
                dati.getSnake().setDirS(true);
                dati.getSnake().setDirSu(false);
                dati.getSnake().setDirGiu(false);
            }
        });
        
        /**
         * 
         * @brief aggiungo tutti i bottoni al pannello dei controlli 
         * @param controls
         * 
         */
        
        controls.add(go);
        controls.add(stop);
        controls.add(su);
        controls.add(giu);
        controls.add(destra);
        controls.add(sinistra);
        
        /**
         * @brief aggiungo il pannello dei controlli al frame creato in precedenza, 
         * poi ne setto le dimensioni
         */
        frame.add(controls);
        frame.setSize(200, 150);
    }

    /**
     * @brief setto il frame visibile così che l'utente possa interagirci
     */
    public void show() {
        frame.setVisible(true);
    }

}