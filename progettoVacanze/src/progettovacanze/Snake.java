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
    
    public void setDirSu(boolean dirSu){
        this.dirSu = dirSu;
    }
    
    public void setDirGiu(boolean dirGiu){
        this.dirGiu = dirGiu;
    }
    
    public void setDirS(boolean dirS){
        this.dirS = dirS;
    }
    
    public void setDirD(boolean dirD){
        this.dirD = dirD;
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

    public boolean isDirGiu() {
        return dirGiu;
    }

    public boolean isDirS() {
        return dirS;
    }

    public boolean isDirD() {
        return dirD;
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
