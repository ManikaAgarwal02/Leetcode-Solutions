class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++){

            int lowerLast = -1;
            int upperFirst = -1;

            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) == ch){
                    lowerLast = i;
                }
            }

            for(int i = 0; i < word.length(); i++){

                if(word.charAt(i) == Character.toUpperCase(ch)){

                    upperFirst = i;
                    break;
                }
            }

            if(lowerLast != -1 &&
               upperFirst != -1 &&
               lowerLast < upperFirst){

                count++;
            }
        }

        return count;
    }
}