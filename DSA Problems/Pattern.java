package src;

public class Pattern {
    static void main() {

//        Pattern 1
//        int n=8;
//        for (int row=1;row<=n;row++){
//            //for each row -> n columns
//            for(int col=1;col<=n;col++){
//                //print star
//                System.out.print("* ");
//            }
//            //move to next line or row
//            System.out.println();
//        }

//        Pattern 2
//        int n=6;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=5;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern 3
//        int n=5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern 4
//        int n=5;
//        for(int row=1;row<=n;row++) {
//          //for each row-> spaces, stars
//
//          //spaces
//          for(int col=1;col<=n-row;col++) {
//            System.out.print(" ");
//          }
//          //stars
//          for(int col=1;col<=n;col++){
//            System.out.print("* ");
//          }
//          //move to next line
//          System.out.println();
//         }

//        Pattern 5

        int n=5;
        for(int row=1;row<=n;row++){
            //for each row->variable columns
            for(int col=1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }


    }
}
