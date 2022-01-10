package org.opentutorials.javatutorials.interfaces.example2;

class Calculator implements Calculatable {
    int first, second, third;
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
    	
    	//System.out.println("first :  " + this.first);
    	//System.out.println("second :  " + this.second);
    	//System.out.println("third :  " + this.third);
    	
        return (this.first + this.second + this.third) / 3;
    }
}