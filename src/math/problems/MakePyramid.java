package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */


                int size = 18; // size of the pyramid

                for(int i=1; i<=size; i++){

                    for(int j=1; j<=size-i; j++){
                        System.out.print('*');
                    }


                    for(int p=1; p<=2*i-1; p++){
                        System.out.print('*');
                    }


                    System.out.println();
                }
            }
        }



