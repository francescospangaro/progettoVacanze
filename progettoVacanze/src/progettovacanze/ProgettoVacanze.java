/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.util.logging.Level;
import java.util.logging.Logger;
import processing.core.PApplet;

/**
 *
 * @author Francesco Spangaro
 */
public class ProgettoVacanze extends PApplet{
        static DatiCondivisi ptrDati;
        static Caselle caselle;
        static SwingUser swingUser;
        static Snake snake;
        static ThSnake thSnake;
        static ThPallina thPallina;
        static ThScatola[][] thScatola;
        static int wScreen;
        static int hScreen;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ptrDati = new DatiCondivisi();
        swingUser = new SwingUser(ptrDati);
        
        swingUser.show();
        ptrDati.waitBlocco();
        System.out.println("ASD");
        
        wScreen = 40*10;
        hScreen = 40*10;
        
        for(int i = 0; i < 40; i++){
           for(int j = 0; j<40; j++){
               thScatola[i][j] = new ThScatola(ptrDati, i, j);
           } 
        }
        
        PApplet.main(new String[]{"progettovacanze.ProgettoVacanze"});
        
        
    }
    
    public void setup() {
        noStroke();
        frameRate(60);
    }
    
    public void draw() {
        if (!ptrDati.isGioco()) {
            exit();
        }

        background(100, 100, 100);

        for (int r = 0; r < ptrDati.getNumRighe(); r++) {
            for (int c = 0; c < ptrDati.getNumColonne(); c++) {
                if (thScatola[r][c].isMela()) {
                    drawIncremento(ptrDati.getNumColonne(), ptrDati.getNumRighe());
                }
            }
        }
    }
    
    public void drawIncremento(int numX, int numY){
        
    }
    
}
