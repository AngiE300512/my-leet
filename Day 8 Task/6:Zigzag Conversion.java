class Solution {
    public String convert(String s, int numRows) {
       
		if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * (numRows - 1);

        for (int row = 0; row < numRows; row++) {
            int i = row;
            boolean toggle = true;

            while (i < s.length()) {
                result.append(s.charAt(i));

                // First and last row → fixed jump
                if (row == 0 || row == numRows - 1) {
                    i += cycle;
                } else {
                    int step1 = cycle - 2 * row; // going down
                    int step2 = 2 * row;         // going up

                    i += toggle ? step1 : step2;
                    toggle = !toggle;
                }
            }
        }

        return result.toString();
    }
}
