package org.example;

public class Main {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        pandemic(field, agents);
        result(field);
    }
    public static int[][] pandemic(int[][] field, int[][] agents) {
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
        return field;
    }
    public static void result(int[][] pandemic) {
        for (int[] i : pandemic) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}