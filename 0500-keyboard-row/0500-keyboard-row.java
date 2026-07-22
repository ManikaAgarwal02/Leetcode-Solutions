class Solution {
    public String[] findWords(String[] words) {

        List<String> ans = new ArrayList<>();

        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        for (String word : words) {

            String row;

            if (row1.contains("" + word.charAt(0)))
                row = row1;
            else if (row2.contains("" + word.charAt(0)))
                row = row2;
            else
                row = row3;

            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!row.contains("" + ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}