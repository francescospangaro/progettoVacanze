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
        static SwingUser swingUser;
        static ThSnake thSnake;
        static ThMela thMela;
        static ThCasella[][] thCasella;
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
        
        wScreen = 600;
        hScreen = 600;
        
        thMela = new ThMela(ptrDati);
        thSnake = new ThSnake(ptrDati);
        
        thMela.setxMela(ptrDati.getCaselle().getMela()[0]);
        thMela.setyMela(ptrDati.getCaselle().getMela()[1]);
        
        thSnake.setPosXS(ptrDati.getCaselle().getTestaSnake()[0]);
        thSnake.setPosYS(ptrDati.getCaselle().getTestaSnake()[1]);
        
        thCasella = new ThCasella[40][40];
        for(int i = 0; i < 40; i++){
           for(int j = 0; j < 40; j++){
               thCasella[i][j] = new ThCasella(ptrDati, ptrDati.getArray()[i][j]);
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
        
        for (int r = 0; r < ptrDati.getNumRighe()-1; r++) {
            for (int c = 0; c < ptrDati.getNumColonne()-1; c++) {
                
                rect(r*15, c*15, r*15, c*15);
                fill(color(255, 255, 255));
                
                if (ptrDati.getArray()[r][c].getMela()==true) {
                    drawMela(r, c);
                }
                
                if (ptrDati.getArray()[r][c].getSnake()==true){
                    drawSnake(r, c);
                }
                
                if((ptrDati.getArray()[r][c].getMela()==true)&&(ptrDati.getArray()[r][c].getSnake()==true)){
                    drawIncremento(r, c);
                }
                
                if(ptrDati.getSnake().isDirSu()){
                    drawSnake(r-1, c);
                }
                
                if(ptrDati.getSnake().isDirGiu()){
                    drawSnake(r+1, c);
                }
                
                if(ptrDati.getSnake().isDirD()){
                    drawSnake(r, c-1);
                }
                
                if(ptrDati.getSnake().isDirS()){
                    drawSnake(r, c+1);
                }
                
            }  
            
        } 
        
    }
    
    
    
    public void settings() {
        size(wScreen, hScreen);

        for (int r = 0; r < ptrDati.getNumRighe(); r++) {
            for (int c = 0; c < ptrDati.getNumColonne(); c++) {
                thCasella[r][c].start();
            }
        }
        thMela.start();
        thSnake.start();
    }

    
    public void drawIncremento(int numX, int numY){
        stroke(0, 0, 0);
        fill(color(0,0,255));
        float rad = 13f;
        int x = ptrDati.getXCentro(numX, numY);
        int y = ptrDati.getYCentro(numX, numY);
        ellipse((x-10), y, rad, rad);
        noFill();
        /* */
        this.ptrDati.getCaselle().setMela();
    }
    
    public void drawSnake(int numX, int numY){
        stroke(0, 0, 0);
        fill(color(0,0,255));
        float rad = 13f;
        int x = ptrDati.getXCentro(numX, numY);
        int y = ptrDati.getYCentro(numX, numY);
        ellipse(x, y, rad, rad);
        noFill();
    }
    
    public void drawMela(int numX, int numY){
        stroke(0, 0, 0);
        fill(color(255,0,0));
        float rad = 13f;
        int x = ptrDati.getXCentro(numX, numY);
        int y = ptrDati.getYCentro(numX, numY);
        ellipse(x, y, rad, rad);
        noFill();
    }
    
}
