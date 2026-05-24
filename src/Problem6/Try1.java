package Problem6;

import java.util.ArrayList;
import java.util.List;

public class Try1 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuilder> initZ = new ArrayList<>(numRows);
        int row = 0;
        int switchOrder = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i < numRows) {
                initZ.add(new StringBuilder());

            }
            if (i % (numRows - 1) == 0) {
                switchOrder = switchOrder * (-1);

            }

            initZ.get(row).append(s.charAt(i));
            row += switchOrder;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder st : initZ) {
            result.append(st);
        }
        return result.toString();
    }
}