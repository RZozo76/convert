package hu.helixlab;


public class Main {

    public static void main(String[] args) {
	int unit = 12;
	int mlUnit = unit*100;
	int clUnit = unit*10;
	double lUnit = unit/10;
	double hlUnit = unit/1000;
	System.out.println(unit + " dl" + " = " + mlUnit + " ml");
	System.out.println(unit + " dl" + " = " + clUnit + " cl");
	System.out.println(unit + " dl" + " = " + lUnit + " l");
	System.out.println(unit + " dl" + " = " + hlUnit + " hl");


    }
}
