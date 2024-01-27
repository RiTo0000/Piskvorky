/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Piskvorky;

/**
 *
 * @author namer
 */
public class Piskvorky {
    /**
     * Hracie pole
     * 0 - init stav
     * 1 - X (kriz)
     * 2 - O (kruh)
     */
    private int grid [][];
    /**
     * Nasledujuci hrac
     */
    private int nextPlayer;
    
    public Piskvorky(){
        this.grid = new int[3][3];
        this.nextPlayer = 1; //zacina stale X
    }
    
    /**
     * Metoda pre zapisanie tahu hraca
     * @param xIndex X Index pola do kt. bolo kliknute
     * @param yIndex Y Index pola do kt. bolo kliknute
     * @return vratim cislo hraca kt. tah to bol pre vypisanie spravneho znaku
     */
    public int positionClicked(int xIndex, int yIndex) {
        int player = this.nextPlayer;
        
        if (this.grid[yIndex][xIndex] == 0) { //kontrola pre validny tah
            this.grid[yIndex][xIndex] = this.nextPlayer;
            this.switchPlayer();
            return player;
        }
        else {
            return 0;
        }
    }
    
    private void switchPlayer() {
        if (this.nextPlayer == 1) {
            this.nextPlayer = 2;
        }
        else {
            this.nextPlayer = 1;
        }
    }
    
    /**
     * Metoda pre kontrolu vitaza
     * @return naplnenu strukturu PiskvorkyWinner
     */
    public PiskvorkyWinner checkWinner(){
        
        //kontrola riadkovych vitazov
        for (int i = 0; i < 3; i++) {
            if (this.grid[i][0] != 0 &&
                    this.grid[i][0] == this.grid[i][1] &&
                    this.grid[i][1] == this.grid[i][2]) {
                //Winner riadok
                return new PiskvorkyWinner(0, i, 2, i, this.grid[i][0]);
            }
        }
        
        //kontrola stlpcovych vitazov
        for (int j = 0; j < 3; j++) {
            if (this.grid[0][j] != 0 &&
                    this.grid[0][j] == this.grid[1][j] &&
                    this.grid[1][j] == this.grid[2][j]) {
                //Winner stlpec
                return new PiskvorkyWinner(j, 0, j, 2, this.grid[0][j]);
            }
        }
        
        //kontrola diagonalnych vitazov
        if (this.grid[0][0] != 0 && //LH -> PD
                this.grid[0][0] == this.grid[1][1] &&
                this.grid[1][1] == this.grid[2][2]) {
            //Winner diagonala
            return new PiskvorkyWinner(0, 0, 2, 2, this.grid[0][0]);
        }
        else if (this.grid[2][0] != 0 && //LD ->PH
                this.grid[2][0] == this.grid[1][1] &&
                this.grid[1][1] == this.grid[0][2]) {
            //Winner diagonala
            return new PiskvorkyWinner(0, 2, 2, 0, this.grid[2][0]);
        }

        //kontorla ci mame volne este nejake pole
        for (int i = 0; i < 3; i++) {//riadky
            for (int j = 0; j < 3; j++) {//stlpce
                if (this.grid[i][j] == 0) {
                    return new PiskvorkyWinner(0, 0, 0, 0, 0); //este je volne miesto v gride remiza to nie je
                }
            }
        }
        
        //ak som sa dostal az tu je remiza
        return new PiskvorkyWinner(0, 0, 0, 0, 3); //remiza treba to nejak poslat tam
    }
    
    public void reset() {
        this.grid = new int[3][3];
        this.nextPlayer = 1; //zacina stale X
    }
}
