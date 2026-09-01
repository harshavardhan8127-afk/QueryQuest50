class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxCount = 0;
        for(String s : sentences){
            int count = 0;
            for(char ch : s.toCharArray()){
                if(ch == ' ') count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount+1;
    }
}