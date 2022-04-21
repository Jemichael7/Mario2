package com.company;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n < 1 || n > 8) System.out.println("try again");
        else{
            for (int i = 0; i<n; i++){

                for (int j = (n-i); j>1; j--)

                    System.out.println(" ");

                for(int k = 0; k<=i; k++)

                    System.out.println("# ");

                System.out.println(" ");

                for(int m = 0; m<=i; m++)

                    System.out.println("# ");

                if(i != n-1) {
                    System.out.println();
                }
            }
        }
    }
}
