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
public class Snake {
    private DatiCondivisi ptrDati;
    private static final int raggio1 = 10;
    private static final int raggio2 = 10;
    private int posX;
    private int posY;
    private boolean dirX;
    private boolean dirY;
    private boolean dirS;
    private boolean dirg;
    private int lunghezza;

    public Snake(DatiCondivisi ptrDati, int posX, int posY, boolean dirX, boolean dirY, boolean dirS, boolean dirg) {
        this.ptrDati = ptrDati;
        this.posX = posX;
        this.posY = posY;
        this.dirX = dirX;
        this.dirY = dirY;
        this.dirS = dirS;
        this.dirg = dirg;
        this.lunghezza = 1;
    }

    public Snake(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.lunghezza = 1;
    }

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
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

    public boolean isDirX() {
        return dirX;
    }

    public void setDirX(boolean dirX) {
        this.dirX = dirX;
    }

    public boolean isDirY() {
        return dirY;
    }

    public void setDirY(boolean dirY) {
        this.dirY = dirY;
    }

    public boolean isDirS() {
        return dirS;
    }

    public void setDirS(boolean dirS) {
        this.dirS = dirS;
    }

    public boolean isDirg() {
        return dirg;
    }

    public void setDirg(boolean dirg) {
        this.dirg = dirg;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }
    
    
    
    
    
}
