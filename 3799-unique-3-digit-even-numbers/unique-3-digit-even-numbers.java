class Solution {
    public int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    
                    if(i!=j && j!=k && i!=k && digits[i]!=0 && digits[k]%2 == 0){

                        int num = digits[i]*100 + digits[j] * 10 + digits[k] * 1;
                        if(!set.contains(num)){
                            set.add(num);
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}