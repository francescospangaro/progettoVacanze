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
    private ThPallina thPallina;
    private Snake snake;
    private ThSnake thSnake;
    private boolean gioco;
    private Casella[][] array;
    private Caselle caselle;
    private final static int numX = 40;
    private final static int numY = 40;
    private Semaphore blocco;
    
    public DatiCondivisi(Pallina pallina, ThPallina thPallina, Snake snake, ThSnake thSnake) {
        this.pallina = pallina;
        this.thPallina = thPallina;
        this.snake = snake;
        this.thSnake = thSnake;
        this.gioco = true;
        this.blocco = new Semaphore(0);
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

    public DatiCondivisi() {
        this.gioco = true;
        this.pallina = new Pallina();
        this.array = new Casella[numX][numY];
        for(int i = 0; i<numX; i++){
           for(int j = 0; j<numY; j++){
               this.array[i][j] = new Casella();
           } 
        }
        this.caselle = new Caselle(this, this.array);
        this.snake = new Snake(this);
        this.thPallina = new ThPallina();
        this.thSnake = new ThSnake();
        this.blocco = new Semaphore(0);
    }

    public Pallina getPallina() {
        return pallina;
    }

    public void setPallina(Pallina pallina) {
        this.pallina = pallina;
    }

    public ThPallina getThPallina() {
        return thPallina;
    }

    public void setThPallina(ThPallina thPallina) {
        this.thPallina = thPallina;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public ThSnake getThSnake() {
        return thSnake;
    }

    public void setThSnake(ThSnake thSnake) {
        this.thSnake = thSnake;
    }
    
    public void IncSnake(){
        
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
