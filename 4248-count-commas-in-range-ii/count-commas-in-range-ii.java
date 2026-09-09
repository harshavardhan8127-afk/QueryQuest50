class Solution {
    public long countCommas(long n) {
        if(n<1000L) return 0;
        if(n<1000000L) return n-999L;
        if(n<1000000000L) return (n-999999L)*2+999000L;
        if(n<1000000000000L) return (n-999999999L)*3+(999000000)*2+999000L;
        if(n<1000000000000000L) return (n-999999999999L)*4+(999000000000L)*3+(999000000L)*2+(999000L);
        return 3998998998999005L;
    }
}