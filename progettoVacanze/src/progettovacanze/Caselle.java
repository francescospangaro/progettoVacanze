/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.util.Random;

/**
 *
 * @author Francesco Spangaro
 */
public class Caselle {
    private static final int numY = 40;
    private static final int numX = 40;
    private DatiCondivisi ptrDati;
    private Casella[][] caselle;

    public Caselle(DatiCondivisi ptrDati, Casella Caselle[][]) {
        this.ptrDati = ptrDati;
        this.caselle = Caselle;
    }

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    public Casella[][] getCaselle() {
        return caselle;
    }

    public void setCaselle(Casella[][] caselle) {
        this.caselle = caselle;
    }
    
    public Casella getCasella(int posX, int posY){
        return caselle[posX][posY];
    }
    
    public void setMela(){
        Random rand = new Random();
        this.caselle[rand.nextInt(numX)][rand.nextInt(numY)].setMela(true);
    }
    
    
}
