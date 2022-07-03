package ninja.pattern;

/**
 * Created by Rajendra Verma on 03/07/22.
 */
public class ReverseTriangle {

    public void solution() {

        int i, j;
        int n = 5;
        // outer loop to handle number of rows
        //  n in this case
        for (i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j = 2 * (n - i); j > 0; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print(" *");
            }

            // ending line after each row
            System.out.println();
        }
    }
}

//          *
//          * *
//          * * *
//          * * * *
//          * * * * *