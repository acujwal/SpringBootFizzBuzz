package com.example.fizzbuzz;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

public class fizzBuzz {

    @NotNull  /*---primary key ----*/
    @Min(1)   /*--- minimum value-------*/
    private int start; /*---starting input number----------*/

    @NotNull
    @Min(1)
    private int end; /*----- ending input number----------*/
    /*--------------------------Geter & setter -----------------------*/

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    /*--------------FizzBuzz calculation-------------------------*/

    public ArrayList<String> buzz(int start, int end) { /* --creating the method buzz in arraylist ---*/

        ArrayList<String> output = new ArrayList<>(); /*-- declaring the variable -- */

        for (int i = start; i <= end; i++) { /*---*/
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    output.add("Fizzbuzz");
                }
                else {
                    output.add("Fizz");
                }
            }
            else if (i % 5 == 0) {
                if (i % 3 == 0) {
                    output.add("Fizzbuzz");
                }
                else { output.add("Buzz");
                }
            }
            else {
                output.add(String.valueOf(i));
            }
        }

        return output;
    }
}