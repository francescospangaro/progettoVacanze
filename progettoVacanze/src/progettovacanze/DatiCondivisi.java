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
public class DatiCondivisi {
    private Pallina pallina;
    private ThPallina thPallina;
    private Snake snake;
    private ThSnake thSnake;
    private boolean gioco;
    
    public DatiCondivisi(Pallina pallina, ThPallina thPallina, Snake snake, ThSnake thSnake) {
        this.pallina = pallina;
        this.thPallina = thPallina;
        this.snake = snake;
        this.thSnake = thSnake;
        this.gioco = true;
    }

    public DatiCondivisi() {
        this.gioco = false;
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
    
}
