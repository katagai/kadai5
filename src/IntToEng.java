import java.util.Scanner;

public class IntToEng {
	// ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	String num[] = {"zero","one","two","three","four",
    			"five","six","seven","eight","nine","ten",
    			"eleven","twelve","thirteen","fourteen","fifteen",
    			"sixteen","seventeen","eighteen","ninetten"};
    	
        return num[n];
    }
}