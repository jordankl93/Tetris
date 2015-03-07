/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tretris;

import java.awt.Color;
/**
 *
 * @author Briane
 */
public class TileFactory {
    public Tile CreateTile(BoardPanel board, int tipo) throws Exception{
        switch(tipo){
            case 0 : return new TypeI(new Color(board.COLOR_MIN, board.COLOR_MAX, board.COLOR_MAX)); 
            case 1 : return new TypeJ(new Color(board.COLOR_MIN, board.COLOR_MIN, board.COLOR_MAX)); 
            case 2 : return new TypeL(new Color(board.COLOR_MAX, 127, board.COLOR_MIN));
            case 3 : return new TypeO(new Color(board.COLOR_MAX, board.COLOR_MAX, board.COLOR_MIN)); 
            case 4 : return new TypeS(new Color(board.COLOR_MIN, board.COLOR_MAX, board.COLOR_MIN)); 
            case 5 : return new TypeT(new Color(128, board.COLOR_MIN, 128)); 
            case 6 : return new TypeZ(new Color(board.COLOR_MAX, board.COLOR_MIN, board.COLOR_MIN));   
            default: throw new Exception();    
        }
    }
}
