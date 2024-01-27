/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piskvorky;

/**
 *
 * @author namer
 */
public class PiskvorkyWinner {
    public int xStart;
    public int yStart;
    public int xEnd;
    public int yEnd;
    /**
     * 0 - nevyhral nik, 1 - vyhral X, 2 - vyhral O, 3 - remiza
     */
    public int winner; 
    
    public PiskvorkyWinner(int xStart, int yStart, int xEnd, int yEnd, int winner) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
        this.winner = winner;
    }
}
