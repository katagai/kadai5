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
    	String[] num = {"zero","one","two","three","four",
    			"five","six","seven","eight","nine","ten",
    			"eleven","twelve","thirteen","fourteen","fifteen",
    			"sixteen","seventeen","eighteen","ninetten"};
    	
    	if (n < 20) return num[n];

    	String[] num2 = {"twenty","thirty","fourty","fifty",
    			"sixty","seventy","eighty","ninety"};
    	
    	//String number[][] = 
    	
    return num[n];
    }
}