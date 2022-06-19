package Day0530;

import java.util.Scanner;

class Circle2{

    private double x,y;

    private int r;

    Circle2(double x, double y, int r){

           this.x=x;  this.y=y; this.r=r; }

    void show(){

      System.out.println(x + " " +y + " " +r);}}
public class Day053011 {

	public static void main(String[] args) {
		Circle2[]c=new Circle2[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < c.length; i++) {
			c[i]=new Circle2(sc.nextDouble(),sc.nextDouble(),sc.nextInt());
			c[i].show();
		}
	}

}