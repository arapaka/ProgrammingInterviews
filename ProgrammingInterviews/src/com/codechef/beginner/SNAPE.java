package com.codechef.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by archithrapaka on 10/31/16.
 */
public class SNAPE {


    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

        while (T > 0) {
            int B = sc.nextInt();
            int LS = sc.nextInt();

            int max = Math.max(B,LS);
            int min = Math.min(B,LS);

            double maxThirdside = Math.sqrt(B*B + LS*LS);
            double minThirdside = Math.sqrt(max*max - min*min);

            DecimalFormat df = new DecimalFormat("#.#####");

            System.out.print(df.format(minThirdside) + " " + df.format(maxThirdside));
            System.out.println();
            T--;
        }
    }
}
