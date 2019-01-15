package com.company;

public class SkyView {
    public SkyView(int numRows, int numCols, double[] scanned) {
        double[][] view = new double[numRows][numCols];
        int i = 0;
        for(int r = 0; r < numRows; r++) {
            if(r%2 == 1) {
                for(int c1 = numCols - 1; c1 >= 0; c1--) {
                    view[r][c1] = scanned[i];
                    i++;
                }
            } else {
                for (int c2 = 0; c2 < numCols; c2++) {
                    view[r][c2] = scanned[i];
                    i++;
                }
            }
        }
    }
}
