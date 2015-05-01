/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo2.app;

import com.mycompany.tretris.Tetris;

/**
 *
 * @author Jordan
 */
public class App {   

	/**
	 * Entry-point of the game. Responsible for creating and starting a new
	 * game instance.
	 * @param args Unused.
	 */
	public static void main(String[] args) throws Exception{
            Tetris tetris = new Tetris();
            tetris.startGame();
         
           
	}
    
}
