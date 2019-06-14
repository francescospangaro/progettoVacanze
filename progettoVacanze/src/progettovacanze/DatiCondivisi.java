/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco Spangaro
 */
public class DatiCondivisi {
    private Pallina pallina;
    private Snake snake;
    private boolean gioco;
    private Casella[][] array;
    private Caselle caselle;
    private final static int numX = 40;
    private final static int numY = 40;
    private Semaphore blocco;
    private boolean serpente;
    private int punteggio;
    
    public DatiCondivisi(Pallina pallina, Snake snake) {
        this.pallina = pallina;
        this.snake = snake;
        this.gioco = true;
        this.blocco = new Semaphore(0);
    }
    
    public DatiCondivisi() {
        this.gioco = true;
        this.pallina = new Pallina();
        this.array = new Casella[numX][numY];
        for(int i = 0; i < numX; i++){
           for(int j = 0; j < numY; j++){
               this.array[i][j] = new Casella();
           } 
        }
        this.caselle = new Caselle(this);
        this.snake = new Snake(this);
        this.blocco = new Semaphore(0);
        this.punteggio = 0;
    }

    public Semaphore getBlocco() {
        return blocco;
    }

    public void setBlocco(Semaphore blocco) {
        this.blocco = blocco;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    
    public void incPunteggio(){
        this.punteggio++;
    }
    
    public int getNumColonne(){
        return numX;
    }

    public Casella[][] getArray() {
        return array;
    }

    public boolean getMela(int numX, int numY){
        return array[numX][numY].getMela();
    }
    
    public boolean getSerpente(int numX, int numY){
        return array[numX][numY].getSnake();
    }
    
    public void setSerpente(boolean s){
        this.serpente = s;
    }
    
    public void setArray(Casella[][] array) {
        this.array = array;
    }

    public Caselle getCaselle() {
        return caselle;
    }

    public void setCaselle(Caselle caselle) {
        this.caselle = caselle;
    }
    
    public int getNumRighe(){
        return numY;
    }

    public Pallina getPallina() {
        return pallina;
    }

    public void setPallina(Pallina pallina) {
        this.pallina = pallina;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    
    public void waitBlocco(){
        try {
            this.blocco.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void signalBlocco(){
        this.blocco.release();
    }

    public boolean isGioco() {
        return gioco;
    }

    public void setGioco(boolean gioco) {
        this.gioco = gioco;
    }
    
    
}
