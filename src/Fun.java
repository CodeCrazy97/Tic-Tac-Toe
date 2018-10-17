public class Fun {

    int h;

    Fun(int height) {
        h = height;
    }

    void hollowTri() {

        //chars keeps up with how many characters to print on each line
        int chars = 1;
        
        //spaces variable controls the movement of the asterisk row out to the right
        int spaces = h - 1;
        
        //print_asterisk puts spacing between the asterisks in the bottom row
        boolean print_asterisk = true;
        System.out.println();

        //h determines the height
        while (h > 0) {

            //print out the spacing before printing out the asterisks
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            //takes care of the last row of *'s
            if (h == 1) {
                for (int j = 0; j < chars; j++) {
                    if (print_asterisk) {
                        System.out.print("*");
                        print_asterisk = false;
                    } else {
                        System.out.print(" ");
                        print_asterisk = true;
                    }
                }
            } else {
                //for loop to print out the characters on each line
                for (int i = 0; i < chars; i++) {
                    if (i == 0 || i == chars - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            chars += 2;
            spaces--;
            h--;
        }
    }
}
