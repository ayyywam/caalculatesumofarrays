package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Matrix[][] = {{0,1,1}, {9,2,4}, {9,0,4}, {1,2,5}};
           int sum1 = 0;
           int sum2 = 0;
           int sum3 = 0;
           int sum4 = 0;
           sum1 = Matrix[0][0] + Matrix[0][1] + Matrix[0][2];
           sum2 = Matrix[1][0] + Matrix[1][1] + Matrix[1][2];
           sum3 = Matrix[2][0] + Matrix[2][1] + Matrix[2][2];
           sum4 = Matrix[3][0] + Matrix[3][1] + Matrix[3][2];
            System.out.println("The sum of the first row is: " + sum1);
            System.out.println("The sum of the second row is: " + sum2);
            System.out.println("The sum of the fourth row is: " + sum3);
            System.out.println("The sum of the fifth row is: " + sum4);
           //for (int j = 0; j < 3; j++){
                //System.out.print(Matrix[i][j] + "\t ");

            //}System.out.print("\n");
        }
    }

