package com.codeofcoin.appcore;

import com.codeofcoin.equations.Equation;
import com.codeofcoin.equations.SumEquation;

import java.util.Random;

public class Problem {
    private int value1;
    private int value2;

    private Equation equation;

    /**Values won't be higher than the <b>boundary</b>'s value.*/
    private int boundary;

    /**Initialization of both values. */
    public  Problem(){
        var randomizer = new Random();
        this.boundary = 10;

        //TODO: different types of equation
        this.equation = new SumEquation();

        this.value1 = randomizer.nextInt(this.boundary);
        this.value2 = randomizer.nextInt(this.boundary);
    }

    /**Returns the texted view of the equation*/
    public String getWritenEquation(){
        return this.equation.printEquation(this.value1, this.value2);
    }

    /**Returns the equation result of the equation*/
    public int getComputedAnswer(){
        return this.equation.computeEquation(this.value1, this.value2);
    }

}
