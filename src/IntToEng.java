
import java.util.Scanner;

public class IntToEng {

    // メインメソッド

    public static void main(String[] args) {
    	
    	//int[] n = new int[10]; 

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	String s = null;
    	String on = "one";
    	String tw = "two";
    	String th = "three";
    	String fo = "four";
    	String fi = "five";
    	String si = "six";
    	String se = "seven";
    	String ei = "eight";
    	String ni = "nine";
    	String t1 = "teen";
    	String t2 = "twenty";
    	String t3 = "thirty";
    	String t4 = "forty";
    	String t5 = "fifty";
    
    	if(n == 0){
    		s = "zero";
		}if(n == 1){
			s = on;
		}if(n == 2){
			s = tw;
		}if(n == 3){
		    s = th;
		}if(n == 4){
			s = fo;
		}if(n == 5){
		    s = fi;
		}if(n == 6){
			s = si;
		}if(n == 7){
		    s = se;
		}if(n == 8){
			s = ei;
		}if(n == 9){
		    s = ni;
		}if(n == 10){
			s = "ten";
		}if(n == 11){
    		s = "eleven";
		}if(n == 12){
			s = "twelve";
		}if(n == 13){
			s = "thirteen";
		}if(n == 14){
		    s = fo + t1;
		}if(n == 15){
			s = "fifteen";
		}if(n == 16){
		    s = si + t1;
		}if(n == 17){
			s = se + t1;
		}if(n == 18){
		    s = "eighteen";
		}if(n == 19){
			s = ni + t1;
		}if(n == 20){
		    s = t2;
		}if(n == 21){
			s = t2 + on;
		}if(n == 22){
    		s = t2 + tw;
		}if(n == 23){
			s = t2 + th;
		}if(n == 24){
			s = t2 + fo;
		}if(n == 25){
		    s = t2 + fi;
		}if(n == 26){
			s = t2 + si;
		}if(n == 27){
		    s = t2 + se;
		}if(n == 28){
			s = t2 + ei;
		}if(n == 29){
		    s = t2 + ni;
		}if(n == 30){
			s = t3;
		}
        return s;

    }

}

