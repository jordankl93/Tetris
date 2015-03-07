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
public class TypeL extends AbstractTile{

    public TypeL(Color color) {
        super(color);
        this.dimension = 3;
        this.tiles = new boolean[][] {
		{
			false,	false,	true,
			true,	true,	true,
			false,	false,	false,
		},
		{
			false,	true,	false,
			false,	true,	false,
			false,	true,	true,
		},
		{
			false,	false,	false,
			true,	true,	true,
			true,	false,	false,
		},
		{
			true,	true,	false,
			false,	true,	false,
			false,	true,	false,
		}};
        this.cols = 3;
        this.rows = 2;

        this.spawnCol = 5 - (this.dimension >> 1);
        this.spawnRow = getTopInset(0);
    }
    @Override
    public String toString(){
        return "TypeL";
    }
    
}
