package pattern;

public class Patternes {

    public static void recTangle (int row,  int col) {
        for  (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void halfPyramid (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void halfPyramidDiff (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public  static void halfPyramidSam (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public  static void halfPyramidIn (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print( j + 1);
            }
            System.out.println();
        }
    }

    public  static void halfPyramidRev (int row) {
        for (int i = 0; i < row; i++) {
           for (int j = row-1; j > i ; j--) {
               System.out.print(" ");
           }
           for (int k = 0; k <= i;k++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }

    public  static void fullPyramid (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int row) {

        // Upper Pyramid
        for (int i = 0; i < row; i++) {

            // spaces
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Pyramid
        for (int i = row - 1; i > 0; i--) {

            // spaces
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public  static void fhalfPyramidIn (int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = row - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void toggle01 (int row) {
        for (int i = 1; i <= row; i++) {
            int val = (i % 2 == 0) ? 0 : 1;
            for (int j = 0; j < i; j++) {
                System.out.print(val);
                val = 1-val;
            }
            System.out.println();
        }
    }

    public static void toggle02 (int row) {
        for (int i = row; i > 0 ; i--) {
            // number
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            // space
            for (int k = 0; k < 2*(row-i-1); k++) {
                System.out.print(" ");
            }

            // rev
            for (int j = i; j > 0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            // number
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            // space
            for (int k = 0; k < 2*(row-i-1); k++) {
                System.out.print(" ");
            }

            // rev
            for (int j = i; j >= 0; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void toggle03  (int row) {
        int r = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(r +" ");
                r++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//       halfPyramidDiff(4);
//       halfPyramidSam(4);
        toggle03(5);
    }
}
