package com.javaintro;

public class Return_datatype {
	  int getInt(){
		  return 10;
	  }
	  float getfloat() {
		  return 2.5f;
	  }
	  double getdouble() {
		  return 66.77;
	  }
	  char getchar() {
		  return 'A';
	  }
	  boolean getboolean() {
		  return true;
	  }
	  void show() {
		  System.out.println(getInt()+ getfloat());
		  System.out.println(getchar() + getInt());
		  System.out.println(getInt()==getfloat());
		  System.out.println(getdouble()==getchar());
	  }

	public static void main(String[] args) {
		Return_datatype s=new Return_datatype();
		s.show();
		
	}

}
