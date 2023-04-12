package org.example;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void pandemicFirstAgent() {
        final int SIZE = 5;
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{0, 4}, {4, 3}, {3, 2}};
        for (int[] i : agents) {
            int x = i[0];
            int y = i[1];
            if (field[x][y] == 0) {
                field[x][y]++;
            } else if (field[x][y] == 1) {
                field[x][y] = field[x][y] * 2;
            } else {
                field[x][y] = field[x][y] * 2;
            }
        }
        int[][] expected = field;
        int[][] result = {{0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}};
        Assertions.assertArrayEquals(expected, result);

    }

    @Test
    void pandemicSecondAgent() {
        final int SIZE = 5;
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 0}, {2, 3}, {4, 2}, {1, 0}};
        for (int[] i : agents) {
            int x = i[0];
            int y = i[1];
            if (field[x][y] == 0) {
                field[x][y]++;
            } else if (field[x][y] == 1) {
                field[x][y] = field[x][y] * 2;
            } else {
                field[x][y] = field[x][y] * 2;
            }
        }
        int[][] expected = field;
        int[][] result = {{0, 0, 0, 0, 0}, {2, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}};
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    void pandemicThirdAgent() {
        final int SIZE = 5;
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 4}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        for (int[] i : agents) {
            int x = i[0];
            int y = i[1];
            if (field[x][y] == 0) {
                field[x][y]++;
            } else if (field[x][y] == 1) {
                field[x][y] = field[x][y] * 2;
            } else {
                field[x][y] = field[x][y] * 2;
            }
        }
        int[][] expected = field;
        int[][] result = {{0, 1, 1, 0, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 4, 0}};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testIndexOutOfBoundsException() {
        final ExpectedException exception = ExpectedException.none();
        final int SIZE = 5;
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{5, 1}};
        for (int[] i : agents) {
            int x = i[0];
            int y = i[1];
            try {
                if (field[x][y] == 0) {
                    field[x][y]++;
                } else if (field[x][y] == 1) {
                    field[x][y] = field[x][y] * 2;
                } else {
                    field[x][y] = field[x][y] * 2;
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Убедитесь что агент соответсвует полю 5 на 5");
            }
        }
    }
}