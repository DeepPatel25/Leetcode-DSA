class Solution-69 {
    public int mySqrt(int x) {
        long i = 0;
        
        while(i*i<=x){
            i++;
        }
        
        return (int)i-1;
    }
}