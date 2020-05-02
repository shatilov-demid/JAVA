package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите промежуток от");
        int x = in.nextInt();
        System.out.println("до");
        int y= in.nextInt();
        for (int i=x; i <= y; i++)
        {
            if (i == 0)
            {
                i++;
            }
            int k=0;
           for (int ii=1; ii <= i; ii++)
           {
               if (i % ii == 0) k++;
           }
           if (k == 2)
           {
               System.out.println(i);
           }
        }

        in.close();
    }
}
