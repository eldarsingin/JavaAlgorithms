package com.algorithms;

public class MatrixTraversalByChangingDirection {

    public enum Direction {
        RIGHT,
        DIAGONAL_DOWN,
        DOWN,
        DIAGONAL_UP
    }

    public String traverse(int R, int C, int[][] matrix) {
        String result = "";
        int x = 0;
        int y = 0;
        Direction[] directionsSequence = new Direction[]{Direction.RIGHT, Direction.DIAGONAL_DOWN, Direction.DOWN, Direction.DIAGONAL_UP};

        int directionIndex = 0;

        while (x < R && y < C) {
            result += matrix[x][y] + " ";

            if (directionsSequence[directionIndex] == Direction.RIGHT) {
                if (x < R - 1) {
                    x++;
                } else {
                    y++;
                }
                directionIndex = getNextDirection(directionIndex, x, y, R, C);

            } else if (directionsSequence[directionIndex] == Direction.DIAGONAL_DOWN) {
                x--;
                y++;
                if (x == 0 || y == C - 1) {
                    directionIndex = getNextDirection(directionIndex, x, y, R, C);
                }
            } else if (directionsSequence[directionIndex] == Direction.DOWN) {
                if (y < C - 1) {
                    y++;
                } else {
                    x++;
                }
                directionIndex = getNextDirection(directionIndex, x, y, R, C);
            } else if (directionsSequence[directionIndex] == Direction.DIAGONAL_UP) {
                x++;
                y--;
                if (y == 0 || x == R - 1) {
                    directionIndex = getNextDirection(directionIndex, x, y, R, C);
                }
            }

            if (directionIndex >= Direction.values().length) {
                directionIndex = 0;
            }
        }
        return result.trim();
    }

    private int getNextDirection(final int directionIndex, final int x, final int y, final int r, final int c) {
        Direction[] directionsSequence = new Direction[]{Direction.RIGHT, Direction.DIAGONAL_DOWN, Direction.DOWN, Direction.DIAGONAL_UP};

        if (finish(x, y, r, c)) {
            return 0;
        }

        int newIndex = directionIndex;
        do {
            newIndex++;
            if (newIndex >= Direction.values().length) {
                newIndex = 0;
            }
            System.out.println(x + " " + y + " " + newIndex);
        }
        while (!canGo(directionsSequence[newIndex], x, y, r, c));
        return newIndex;
    }

    private boolean finish(final int x, final int y, final int r, final int c) {
        return y >= c - 1 && x >= r - 1;
    }

    private boolean canGo(final Direction direction, final int x, final int y, final int r, final int c) {
        if (direction == Direction.RIGHT) {
            return x < r - 1;
        } else if (direction == Direction.DIAGONAL_DOWN) {
            return x > 0 && y < c - 1;
        } else if (direction == Direction.DOWN) {
            return y < c - 1;
        } else if (direction == Direction.DIAGONAL_UP) {
            return y > 0 && x < r - 1;
        }
        return false;
    }
}
