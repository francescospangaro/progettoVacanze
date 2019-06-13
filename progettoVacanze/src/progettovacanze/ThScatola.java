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
public class ThScatola extends Thread{
    private Casella casella;
    private DatiCondivisi ptrDati;
    private boolean mela;

    public ThScatola(DatiCondivisi ptrDati, int numX, int numY) {
        this.ptrDati = ptrDati;
        if(this.ptrDati.getMela(numX, numY)==true){
            this.mela = true;
        }
    }
    
    public boolean isMela(){
        return this.mela;
    }
    
}
