import java.util.Arrays;
import java.util.HashMap;

public class intToRome {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<values.length; i++) {
            System.out.println(num + " " + values[i]);
            if (num >= values[i]) {
                sb.append(strs[i]);
                num = num-values[i];
                i--;
            }
        }
        return(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(new intToRome().intToRoman(3));
    }
}
