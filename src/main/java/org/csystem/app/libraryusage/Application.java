package org.csystem.app.libraryusage;

import com.eminpolat.util.BallFall;


public class Application {
    public static void run(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        BallFall bf = new BallFall();

        for (;;) {
            System.out.print("Input width and height:");
            int width = kb.nextInt();
            int height = kb.nextInt();

            if (width == 0)
                break;

            bf.play(width, height);
            System.out.println(bf);
        }
    }
}
