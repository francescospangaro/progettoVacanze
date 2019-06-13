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
        
        wScreen = 40*10;
        hScreen = 40*10;
        
        thScatola = new ThScatola[40][40];
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
                
                rect(r+5, c+5, r+12, c+12);
                
                if (thScatola[r][c].isMela()) {
                    drawMela(r, c);
                }
            }
        }
        
    }
    
    /**public void settings() {
        size(wScreen, hScreen);

        for (int r = 0; r < ptrDati.getNumRighe(); r++) {
            for (int c = 0; c < ptrDati.getNumColonne(); c++) {
                thScatola[r][c].start();
            }
        }
        thPallina.start();
    }*/

    
    public void drawIncremento(int numX, int numY){
        
    }
    
    public void drawMela(int numX, int numY){
        float rad = (9/2);
        ellipse(numX, numY, rad, rad);
    }
    
}
