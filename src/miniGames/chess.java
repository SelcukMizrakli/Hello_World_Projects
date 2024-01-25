package miniGames;

import java.util.Arrays;

public class chess {
    public static void main(String[] args) {
        /*
        8*8 matris

        taş özellikleri(at L çizer)
        gibi önlemler alınmalı...
         */

        String[][] a = new String[3][3];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                a[i][j] = "x";
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

    }
}
