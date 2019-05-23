

import java.util.Scanner;

public class IntToEng {

    // メインメソッド

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	String s = null;
    	String e = " ";
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
    	String t10 = "ten";
    	String t11 = "eleven";
    	String t12 = "twelve";
    	String t13 = "thirteen";
    	String t15 = "fifteen";
    	String t18 = "eighteen";
    	String t20 = "twenty";
    	String t30 = "thirty";
    	String t40 = "forty";
    	String t50 = "fifty";
    	String ty = "ty";
    	String t60 = si + ty;
    	String t70 = se + ty;
    	String t80 = "eighty";
    	String t90 = ni + ty;
    	String t100 = on + e + "hundred";
    	String t200 = tw + e + "hundred";
    
    	if(n == 0){   //0~9
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
		}if(n == 10){   //10~19
			s = t10;
		}if(n == 11){
    		s = t11;
		}if(n == 12){
			s = t12;
		}if(n == 13){
			s = t13;
		}if(n == 14){
		    s = fo + t1;
		}if(n == 15){
			s = t15;
		}if(n == 16){
		    s = si + t1;
		}if(n == 17){
			s = se + t1;
		}if(n == 18){
		    s = t18;
		}if(n == 19){
			s = ni + t1;
		}if(n == 20){   //20~29
		    s = t20;
		}if(n == 21){
			s = t20 + e + on;
		}if(n == 22){
    		s = t20 + e + tw;
		}if(n == 23){
			s = t20 + e + th;
		}if(n == 24){
			s = t20 + e + fo;
		}if(n == 25){
		    s = t20 + e + fi;
		}if(n == 26){
			s = t20 + e + si;
		}if(n == 27){
		    s = t20 + e + se;
		}if(n == 28){
			s = t20 + e + ei;
		}if(n == 29){
		    s = t20 + e + ni;
		}if(n == 30){   //30~39
			s = t30;
		}if(n == 31){
			s = t30 + e + on;
		}if(n == 32){
    		s = t30 + e + tw;
		}if(n == 33){
			s = t30 + e + th;
		}if(n == 34){
			s = t30 + e + fo;
		}if(n == 35){
		    s = t30 + e + fi;
		}if(n == 36){
			s = t30 + e + si;
		}if(n == 37){
		    s = t30 + e + se;
		}if(n == 38){
			s = t30 + e + ei;
		}if(n == 39){
		    s = t30 + e + ni;
		}if(n == 40){   //40~49
			s = t40;
		}if(n == 41){
			s = t40 + e + on;
		}if(n == 42){
    		s = t40 + e + tw;
		}if(n == 43){
			s = t40 + e + th;
		}if(n == 44){
			s = t40 + e + fo;
		}if(n == 45){
		    s = t40 + e + fi;
		}if(n == 46){
			s = t40 + e + si;
		}if(n == 47){
		    s = t40 + e + se;
		}if(n == 48){
			s = t40 + e + ei;
		}if(n == 49){
		    s = t40 + e + ni;
		}if(n == 50){   //50~59
			s = t50;
		}if(n == 51){
			s = t50 + e + on;
		}if(n == 52){
    		s = t50 + e + tw;
		}if(n == 53){
			s = t50 + e + th;
		}if(n == 54){
			s = t50 + e + fo;
		}if(n == 55){
		    s = t50 + e + fi;
		}if(n == 56){
			s = t50 + e + si;
		}if(n == 57){
		    s = t50 + e + se;
		}if(n == 58){
			s = t50 + e + ei;
		}if(n == 59){
		    s = t50 + e + ni;
		}if(n == 60){   //60~69
			s = t60;
		}if(n == 61){
			s = t60 + e + on;
		}if(n == 62){
    		s = t60 + e + tw;
		}if(n == 63){
			s = t60 + e + th;
		}if(n == 64){
			s = t60 + e + fo;
		}if(n == 65){
		    s = t60 + e + fi;
		}if(n == 66){
			s = t60 + e + si;
		}if(n == 67){
		    s = t60 + e + se;
		}if(n == 68){
			s = t60 + e + ei;
		}if(n == 69){
		    s = t60 + e + ni;
		}if(n == 70){   //70~79
			s = t70;
		}if(n == 71){
			s = t70 + e + on;
		}if(n == 72){
    		s = t70 + e + tw;
		}if(n == 73){
			s = t70 + e + th;
		}if(n == 74){
			s = t70 + e + fo;
		}if(n == 75){
		    s = t70 + e + fi;
		}if(n == 76){
			s = t70 + e + si;
		}if(n == 77){
		    s = t70 + e + se;
		}if(n == 78){
			s = t70 + e + ei;
		}if(n == 79){
		    s = t70 + e + ni;
		}if(n == 80){   //80~89
			s = t80;
		}if(n == 81){
			s = t80 + e + on;
		}if(n == 82){
    		s = t80 + e + tw;
		}if(n == 83){
			s = t80 + e + th;
		}if(n == 84){
			s = t80 + e + fo;
		}if(n == 85){
		    s = t80 + e + fi;
		}if(n == 86){
			s = t80 + e + si;
		}if(n == 87){
		    s = t80 + e + se;
		}if(n == 88){
			s = t80 + e + ei;
		}if(n == 89){
		    s = t80 + e + ni;
		}if(n == 90){   //90~99
			s = t90;
		}if(n == 91){
			s = t90 + e + on;
		}if(n == 92){
    		s = t90 + e + tw;
		}if(n == 93){
			s = t90 + e + th;
		}if(n == 94){
			s = t90 + e + fo;
		}if(n == 95){
		    s = t90 + e + fi;
		}if(n == 96){
			s = t90 + e + si;
		}if(n == 97){
		    s = t90 + e + se;
		}if(n == 98){
			s = t90 + e + ei;
		}if(n == 99){
		    s = t90 + e + ni;
		}if(n == 100){     //100~109
			s = t100;
		}if(n == 101){
			s = t100 + e + on;
		}if(n == 102){
    		s = t100 + e + tw;
		}if(n == 103){
			s = t100 + e + th;
		}if(n == 104){
			s = t100 + e + fo;
		}if(n == 105){
		    s = t100 + e + fi;
		}if(n == 106){
			s = t100 + e + si;
		}if(n == 107){
		    s = t100 + e + se;
		}if(n == 108){
			s = t100 + e + ei;
		}if(n == 109){
		    s = t100 + e + ni;
		}if(n == 110){
			s = t100 + t10;   //110~119
		}if(n == 111){
			s = t100 + t11;
		}if(n == 112){
			s = t100 + t12;
		}if(n == 113){
    		s = t100 + t13;
		}if(n == 114){
			s = t100 + fo + t1;
		}if(n == 115){
			s = t100 + t15;
		}if(n == 116){
		    s = t100 + si + t1;
		}if(n == 117){
			s = t100 + se + t1;
		}if(n == 118){
		    s = t100 + t18;
		}if(n == 119){
			s = t100 + ni + t1;
		}if(n == 120){   //120~129
		    s = t100 + t20;
		}if(n == 121){
			s = t100 + t20 + e + on;
		}if(n == 122){
			s = t100 + t20 + e + tw;
		}if(n == 123){
    		s = t100 + t20 + e + th;
		}if(n == 124){
			s = t100 + t20 + e + fo;
		}if(n == 125){
			s = t100 + t20 + e + fi;
		}if(n == 126){
		    s = t100 + t20 + e + si;
		}if(n == 127){
			s = t100 + t20 + e + se;
		}if(n == 128){
		    s = t100 + t20 + e + ei;
		}if(n == 129){
			s = t100 + t20 + e + ni;
		}if(n == 130){   //130~139
		    s = t100 + t30;
		}if(n == 131){
			s = t100 + t30 + e + on;
		}if(n == 132){
			s = t100 + t30 + e + tw;
		}if(n == 133){
    		s = t100 + t30 + e + th;
		}if(n == 134){
			s = t100 + t30 + e + fo;
		}if(n == 135){
			s = t100 + t30 + e + fi;
		}if(n == 136){
		    s = t100 + t30 + e + si;
		}if(n == 137){
			s = t100 + t30 + e + se;
		}if(n == 138){
		    s = t100 + t30 + e + ei;
		}if(n == 139){
			s = t100 + t30 + e + ni;
		}if(n == 140){   //140~149
		    s = t100 + t40;
		}if(n == 141){
			s = t100 + t40 + e + on;
		}if(n == 142){
			s = t100 + t40 + e + tw;
		}if(n == 143){
    		s = t100 + t40 + e + th;
		}if(n == 144){
			s = t100 + t40 + e + fo;
		}if(n == 145){
			s = t100 + t40 + e + fi;
		}if(n == 146){
		    s = t100 + t40 + e + si;
		}if(n == 147){
			s = t100 + t40 + e + se;
		}if(n == 148){
		    s = t100 + t40 + e + ei;
		}if(n == 149){
			s = t100 + t40 + e + ni;
		}if(n == 150){   //150~159
		    s = t100 + t50;
		}if(n == 151){
			s = t100 + t50 + e + on;
		}if(n == 152){
			s = t100 + t50 + e + tw;
		}if(n == 153){
    		s = t100 + t50 + e + th;
		}if(n == 154){
			s = t100 + t50 + e + fo;
		}if(n == 155){
			s = t100 + t50 + e + fi;
		}if(n == 156){
		    s = t100 + t50 + e + si;
		}if(n == 157){
			s = t100 + t50 + e + se;
		}if(n == 158){
		    s = t100 + t50 + e + ei;
		}if(n == 159){
			s = t100 + t50 + e + ni;
		}if(n == 160){   //160~169
		    s = t100 + t60;
		}if(n == 161){
			s = t100 + t60 + e + on;
		}if(n == 162){
			s = t100 + t60 + e + tw;
		}if(n == 163){
    		s = t100 + t60 + e + th;
		}if(n == 164){
			s = t100 + t60 + e + fo;
		}if(n == 165){
			s = t100 + t60 + e + fi;
		}if(n == 166){
		    s = t100 + t60 + e + si;
		}if(n == 167){
			s = t100 + t60 + e + se;
		}if(n == 168){
		    s = t100 + t60 + e + ei;
		}if(n == 169){
			s = t100 + t60 + e + ni;
		}if(n == 170){   //170~179
		    s = t100 + t70;
		}if(n == 171){
			s = t100 + t70 + e + on;
		}if(n == 172){
			s = t100 + t70 + e + tw;
		}if(n == 173){
    		s = t100 + t70 + e + th;
		}if(n == 174){
			s = t100 + t70 + e + fo;
		}if(n == 175){
			s = t100 + t70 + e + fi;
		}if(n == 176){
		    s = t100 + t70 + e + si;
		}if(n == 177){
			s = t100 + t70 + e + se;
		}if(n == 178){
		    s = t100 + t70 + e + ei;
		}if(n == 179){
			s = t100 + t70 + e + ni;
		}if(n == 180){   //180~189
		    s = t100 + t80;
		}if(n == 181){
			s = t100 + t80 + e + on;
		}if(n == 182){
			s = t100 + t80 + e + tw;
		}if(n == 183){
    		s = t100 + t80 + e + th;
		}if(n == 184){
			s = t100 + t80 + e + fo;
		}if(n == 185){
			s = t100 + t80 + e + fi;
		}if(n == 186){
		    s = t100 + t80 + e + si;
		}if(n == 187){
			s = t100 + t80 + e + se;
		}if(n == 188){
		    s = t100 + t80 + e + ei;
		}if(n == 189){
			s = t100 + t80 + e + ni;
		}if(n == 190){   //190~200
		    s = t100 + t90;
		}if(n == 191){
			s = t100 + t90 + e + on;
		}if(n == 192){
			s = t100 + t90 + e + tw;
		}if(n == 193){
    		s = t100 + t90 + e + th;
		}if(n == 194){
			s = t100 + t90 + e + fo;
		}if(n == 195){
			s = t100 + t90 + e + fi;
		}if(n == 196){
		    s = t100 + t90 + e + si;
		}if(n == 197){
			s = t100 + t90 + e + se;
		}if(n == 198){
		    s = t100 + t90 + e + ei;
		}if(n == 199){
		    s = t100 + t90 + e + ni;
		}if(n == 200){
			s = t200;
		}
			
        return s;

    }

}

