class Solution {
    public boolean areNumbersAscending(String s) {

        String[] words = s.split(" ");

        int least = 0;
        for(String word : words){
            if(Character.isDigit(word.charAt(0))){
                int num = Integer.parseInt(word);
                if(num <= least){
                    return false;
                }
                least = num;
            }
        }
        return true;
    }
}