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
public class AbstractTile implements Tile{
    /**
     * The base color of tiles of this type.
     */
    Color baseColor;

    /**
     * The light shading color of tiles of this type.
     */
    Color lightColor;

    /**
     * The dark shading color of tiles of this type.
     */
    Color darkColor;

    /**
     * The column that this type spawns in.
     */
    int spawnCol;

    /**
     * The row that this type spawns in.
     */
    int spawnRow;

    /**
     * The dimensions of the array for this piece.
     */
    int dimension;

    /**
     * The number of rows in this piece. (Only valid when rotation is 0 or 2,
     * but it's fine since we're only using it for displaying the next piece
     * preview, which uses rotation 0).
     */
    int rows;

    /**
     * The number of columns in this piece. (Only valid when rotation is 0 or 2,
     * but it's fine since we're only using it for displaying the next piece
     * preview, which uses rotation 0).
     */
    int cols;

    /**
     * The tiles for this piece. Each piece has an array of tiles for each rotation.
     */
    boolean[][] tiles;

    /**
     * Creates a new TileType.
     * @param color The base color of the tile.
     * @param dimension The dimensions of the tiles array.
     * @param cols The number of columns.
     * @param rows The number of rows.
     * @param tiles The tiles.
     */
    public AbstractTile(Color color) {
            this.baseColor = color;
            this.lightColor = color.brighter();
            this.darkColor = color.darker();
            
            this.spawnCol = 5 - (dimension >> 1);
            this.spawnRow = getTopInset(0);
    }

    /**
     * Gets the base color of this type.
     * @return The base color.
     */
    public Color getBaseColor() {
            return baseColor;
    }

    /**
     * Gets the light shading color of this type.
     * @return The light color.
     */
    public Color getLightColor() {
            return lightColor;
    }

    /**
     * Gets the dark shading color of this type.
     * @return The dark color.
     */
    public Color getDarkColor() {
            return darkColor;
    }

    /**
     * Gets the dimension of this type.
     * @return The dimension.
     */
    public int getDimension() {
            return dimension;
    }

    /**
     * Gets the spawn column of this type.
     * @return The spawn column.
     */
    public int getSpawnColumn() {
            return spawnCol;
    }

    /**
     * Gets the spawn row of this type.
     * @return The spawn row.
     */
    public int getSpawnRow() {
            return spawnRow;
    }

    /**
     * Gets the number of rows in this piece. (Only valid when rotation is 0 or 2,
     * but it's fine since this is only used for the preview which uses rotation 0).
     * @return The number of rows.
     */
    public int getRows() {
            return rows;
    }

    /**
     * Gets the number of columns in this piece. (Only valid when rotation is 0 or 2,
     * but it's fine since this is only used for the preview which uses rotation 0).
     * @return The number of columns.
     */
    public int getCols() {
            return cols;
    }

    /**
     * Checks to see if the given coordinates and rotation contain a tile.
     * @param x The x coordinate of the tile.
     * @param y The y coordinate of the tile.
     * @param rotation The rotation to check in.
     * @return Whether or not a tile resides there.
     */
    public boolean isTile(int x, int y, int rotation) {
            return tiles[rotation][y * dimension + x];
    }

    /**
     * The left inset is represented by the number of empty columns on the left
     * side of the array for the given rotation.
     * @param rotation The rotation.
     * @return The left inset.
     */
    public int getLeftInset(int rotation) {
            /*
             * Loop through from left to right until we find a tile then return
             * the column.
             */
            for(int x = 0; x < dimension; x++) {
                    for(int y = 0; y < dimension; y++) {
                            if(isTile(x, y, rotation)) {
                                    return x;
                            }
                    }
            }
            return -1;
    }

    /**
     * The right inset is represented by the number of empty columns on the left
     * side of the array for the given rotation.
     * @param rotation The rotation.
     * @return The right inset.
     */
    public int getRightInset(int rotation) {
            /*
             * Loop through from right to left until we find a tile then return
             * the column.
             */
            for(int x = dimension - 1; x >= 0; x--) {
                    for(int y = 0; y < dimension; y++) {
                            if(isTile(x, y, rotation)) {
                                    return dimension - x;
                            }
                    }
            }
            return -1;
    }

    /**
     * The left inset is represented by the number of empty rows on the top
     * side of the array for the given rotation.
     * @param rotation The rotation.
     * @return The top inset.
     */
    public int getTopInset(int rotation) {
            /*
             * Loop through from top to bottom until we find a tile then return
             * the row.
             */
            for(int y = 0; y < dimension; y++) {
                    for(int x = 0; x < dimension; x++) {
                            if(isTile(x, y, rotation)) {
                                    return y;
                            }
                    }
            }
            return -1;
    }

    /**
     * The botom inset is represented by the number of empty rows on the bottom
     * side of the array for the given rotation.
     * @param rotation The rotation.
     * @return The bottom inset.
     */
    public int getBottomInset(int rotation) {
            /*
             * Loop through from bottom to top until we find a tile then return
             * the row.
             */
            for(int y = dimension - 1; y >= 0; y--) {
                    for(int x = 0; x < dimension; x++) {
                            if(isTile(x, y, rotation)) {
                                    return dimension - y;
                            }
                    }
            }
            return -1;
    }
	
}


