package org.opentutorials.javatutorials.overloading.example1;

class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
 
    // 매소드 오버로딩 : 매개변수 숫자와 타입이 다르면 메소드명을 동일하게 사용 가능하다
    public void setOprands(int left, int right, int third){
    	this.setOprands(left, right);
        System.out.println("setOprands(int left, int right, int third)");
//        this.left = left;
//        this.right = right;
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}