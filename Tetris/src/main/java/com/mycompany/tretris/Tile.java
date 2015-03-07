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
public interface Tile {
    public Color getBaseColor();
    public Color getLightColor();
    public Color getDarkColor();
    public int getDimension();
    public int getSpawnColumn();
    public int getSpawnRow();
    public int getRows();
    public int getCols();
    public boolean isTile(int x, int y, int rotation);
    public int getLeftInset(int rotation);
    public int getRightInset(int rotation);
    public int getTopInset(int rotation);
    public int getBottomInset(int rotation);
}
