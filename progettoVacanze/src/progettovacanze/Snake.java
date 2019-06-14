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
    private boolean dirSu;
    private boolean dirGiu;
    private boolean dirS;
    private boolean dirD;
    private int lunghezza;

    public Snake(DatiCondivisi ptrDati, int posX, int posY, boolean dirX, boolean dirY, boolean dirS, boolean dirg) {
        this.ptrDati = ptrDati;
        this.posX = posX;
        this.posY = posY;
        this.dirSu = dirX;
        this.dirGiu = dirY;
        this.dirS = dirS;
        this.dirD = dirg;
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

    public boolean isDirSu() {
        return dirSu;
    }

    public void setDirSu(boolean dirX) {
        this.dirSu = dirX;
    }

    public boolean isDirGiu() {
        return dirGiu;
    }

    public void setDirGiu(boolean dirY) {
        this.dirGiu = dirY;
    }

    public boolean isDirS() {
        return dirS;
    }

    public void setDirS(boolean dirS) {
        this.dirS = dirS;
    }

    public boolean isDirD() {
        return dirD;
    }

    public void setDirD(boolean dirg) {
        this.dirD = dirg;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }
    
    public void incLunghezza(){
        this.lunghezza++;
    }
    
    
    
    
    
}
