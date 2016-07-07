
public class AddDigits {
	public static int addDigits(int num) {
        while(num / 10 > 0){
            int digit = (int) (Math.log10(num));
            int sum = 0;
            while(digit > 0){
                sum += num / 10 ^ digit;
                digit--;
            }
            num = sum;
        }
        return num;
    }
	
	public static void main(String[] args){
		
	}
}
