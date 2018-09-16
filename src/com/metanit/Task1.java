package com.metanit;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        short num = ((24 - 4) / 2) + 1;
        short[] p = new short[num];
        for (int i = 0; i < p.length; i++) {
            p[i] = (short) (4 + i * 2);
        }
        float[] x = new float[13];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random()*19 -8);
            x[i] = (Math.round(x[i]*10))/10.0f;
        }
        double[][] f = new double[11][13];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if (p[i] == 22) {
                    f[i][j] = Math.pow((Math.sin(Math.atan((x[j]+1.5)/19))-1/4)/Math.atan((x[j]+1.5)/19), 2);
                } else
                if ((p[i] <= 14) && (p[i] != 10)) {
                    f[i][j] = Math.pow(Math.E, (Math.pow((2*Math.atan((x[j]+1.5)/19)), (Math.asin((x[j]+1.5)/19)))));
                } else {
                    f[i][j] = Math.asin(1/Math.pow(Math.E, Math.pow((Math.cos(Math.pow((3*(Math.atan((x[j]+1.5)/19)-1)), (x[j]/(2+x[j])))),((0.25+Math.pow((Math.tan(x[j])/Math.PI), 3))/Math.pow(Math.E, (Math.asin((x[j]+1.5)/19)))), 2)));
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(f[i][j]);
            }
        }
    }
}
