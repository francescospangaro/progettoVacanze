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
public class Pallina {
    private int posX;
    private int posY;
    private static final int raggio1 = 19;
    private static final int raggio2 = 19;
    private DatiCondivisi ptrDati;

    public Pallina(int posX, int posY, DatiCondivisi ptrDati) {
        this.posX = posX;
        this.posY = posY;
        this.ptrDati = ptrDati;
    }

    public Pallina() {
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

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
}