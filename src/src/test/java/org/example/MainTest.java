package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void pandemic() {
        int[][] field = new int[5][5];
        int[][] agents = {{0, 4}, {4, 3}, {3, 2}};
        for (int[] i : agents) {
            int x = i[0] ;
            int y = i[1] ;
            if (field[x][y] == 0) {
                field[x][y]++;
            } else if (field[x][y] == 1) {
                field[x][y] = field[x][y] * 2;
            } else {
                field[x][y] = field[x][y] * 2;
            }
        }
        int[][] expend = field;
        int [][] result = {{0,0,0,0,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,1,0}};
        Assertions.assertArrayEquals(expend, result);
    }
}