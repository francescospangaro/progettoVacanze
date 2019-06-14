/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

/**
 *
 * @author Francesco Spangaro
 */
public class Casella {
    private int posX;
    private int posY;
    private DatiCondivisi ptrDati;
    private boolean mela;
    private int lunghezza;
    private int larghezza;
    private int altezza;
    private boolean snake;

    public Casella(int posX, int posY, DatiCondivisi ptrDati, int lunghezza, int larghezza, int altezza) {
        this.posX = posX;
        this.posY = posY;
        this.ptrDati = ptrDati;
        this.mela = false;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public boolean getSnake() {
        return snake;
    }

    public void setSnake(boolean snake) {
        this.snake = snake;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setMela(boolean mela){
        this.mela = mela;
    }
    
    public boolean getMela(){
        return this.mela;
    }
    
    public Casella() {
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void setPtrDati(DatiCondivisi ptrDati){
        this.ptrDati = ptrDati;
    }
    
    public DatiCondivisi getPtrDati(){
        return this.ptrDati;
    }
    
    public void aggiungiSnake(){
        
    }
    
}
