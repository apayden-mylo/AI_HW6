/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apayden_hw6;

import java.io.Serializable;

/**
 *
 * @author AP047572
 */
public class Square implements Serializable {
    private final int colNum;
    private int numAdj;
    private boolean shaded;
    private int adjShaded;
    
    public Square(int colNum) {
        this.colNum = colNum;
        this.numAdj = -1;
        this.shaded = false;
        this.adjShaded = 0;
    }
    
    public void setNumAdj(int adj) {
        this.numAdj = adj;
        this.shaded = false;
    }
    
    public int getColNum() {
        return this.colNum;
    }
    
    public int getNumAdj() {
        return this.numAdj;
    }
    
    public void setShaded() {
        this.shaded = true;
    }
    
    public boolean getShaded() {
        return this.shaded;
    }
   
    public void increaseAdjShaded() {
        if(this.numAdj != -1) {
            ++this.adjShaded;
        }
    }
}
