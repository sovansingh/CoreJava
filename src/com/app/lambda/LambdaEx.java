package com.app.lambda;
interface Drawable{
	public void draw();
}
public class LambdaEx {

	public static void main(String[] args) {
		Drawable drawable = ()->{System.out.println("draw");};
		
		drawable.draw();
	}
}
