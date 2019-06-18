/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco Spangaro
 */
public class ThSnake extends Thread{
    private DatiCondivisi ptrDati;
    private int posXS;
    private int posYS;

    public ThSnake(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    public int getPosXS() {
        return posXS;
    }

    public void setPosXS(int posXS) {
        this.posXS = posXS;
    }

    public int getPosYS() {
        return posYS;
    }

    public void setPosYS(int posYS) {
        this.posYS = posYS;
    }

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    @Override
    public void run(){
        this.ptrDati.getSnake().setDirGiu(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThSnake.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Inizio");
        while(this.ptrDati.isGioco()){
            if(this.ptrDati.getSnake().isDirGiu()){
                this.ptrDati.getSnake().setDirGiu(true);
                this.ptrDati.getSnake().setDirSu(false);
                this.ptrDati.getSnake().setDirS(false);
                this.ptrDati.getSnake().setDirD(false);
            }
            if(this.ptrDati.getSnake().isDirSu()){
                this.ptrDati.getSnake().setDirSu(true);
                this.ptrDati.getSnake().setDirGiu(false);
                this.ptrDati.getSnake().setDirS(false);
                this.ptrDati.getSnake().setDirD(false);
            }
            if(this.ptrDati.getSnake().isDirD()){
                this.ptrDati.getSnake().setDirD(true);
                this.ptrDati.getSnake().setDirGiu(false);
                this.ptrDati.getSnake().setDirSu(false);
                this.ptrDati.getSnake().setDirS(false);
            }
            if(this.ptrDati.getSnake().isDirS()){
                this.ptrDati.getSnake().setDirS(true);
                this.ptrDati.getSnake().setDirSu(false);
                this.ptrDati.getSnake().setDirGiu(false);
                this.ptrDati.getSnake().setDirD(false);
            }
            
        }
    }
}
