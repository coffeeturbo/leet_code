package easy;

import java.util.Map;

public class RomanToInteger {


    public int romanToInt(String s) {

        var digitMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        var size = s.length() - 1;
        for (int i = size; i >= 0; i--) {

            var currentVal = digitMap.get(s.charAt(i));
            var preveusVal = i == size ? 0 : digitMap.get(s.charAt(i + 1));

            if (i == size || currentVal >= preveusVal) {
                result += currentVal;
            } else {
                result -= currentVal;
            }
        }

        return result;
    }

}
