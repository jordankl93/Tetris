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
public class TypeO extends AbstractTile{

    public TypeO(Color color) {
        super(color);
        this.dimension = 2;
        this.tiles = new boolean[][] {
		{
			true,	true,
			true,	true,
		},
		{
			true,	true,
			true,	true,
		},
		{	
			true,	true,
			true,	true,
		},
		{
			true,	true,
			true,	true,
		}};
        this.cols = 2;
        this.rows = 2;

        this.spawnCol = 5 - (this.dimension >> 1);
        this.spawnRow = getTopInset(0);
    }
    @Override
    public String toString(){
        return "TypeO";
    }
    
}
