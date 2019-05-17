
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
    
    	if(n == 0){
    		s = "zero";
		}if(n == 1){
			s = "one";
		}if(n == 2){
			s = "two";
		}if(n == 3){
		s = "three";
		}if(n == 4){
			s = "four";
		}if(n == 5){
		s = "five";
		}if(n == 6){
			s = "six";
		}if(n == 7){
		s = "seven";
		}if(n == 8){
			s = "eight";
		}if(n == 9){
		s = "nine";
		}if(n == 10){
			s = "ten";
		}
        return s;

    }

}

