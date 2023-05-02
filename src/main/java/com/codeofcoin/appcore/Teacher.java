package com.codeofcoin.appcore;

public class Teacher {
    private Problem problem;

    public Teacher(){
        this.problem = new Problem();
    }

    public void giveProblem(){
        System.out.println("Solve this problem " + this.problem.getWritenEquation()+" = ?");
    }

    public boolean checkAnswer(int user_answer){
        return user_answer == this.problem.getComputedAnswer();
    }
}
