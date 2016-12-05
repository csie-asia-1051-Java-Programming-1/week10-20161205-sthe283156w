package ex;
import java.unil.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if(120>=a){
			System.out.println(a*2.10);
			System.out.println(a*2.10);
		}
		else if(121<=a||a<=330){
			System.out.println((a-120)*3.02+120*2.10);
			System.out.println((a-120)*2.68+120*2.10);
		}
		else if(331<=a||a<=500){
			System.out.println((a-330)*4.39+210*3.02+120*2.10);
			System.out.println((a-330)*3.61+210*2.68+120*2.10);	
		}
		else if(501<=a||a<=700){
			System.out.println((a-500)*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println((a-500)*4.01+170*3.61+210*2.68+120*2.10);
		}
		else if(701<=a){
			System.out.println((a-700)*5.63+200*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println((a-700)*4.50+200*4.01+170*3.61+210*2.68+120*2.10);
		}
	}
}


	}

}
