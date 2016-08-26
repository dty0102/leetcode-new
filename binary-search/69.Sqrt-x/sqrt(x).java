public class Solution {
1. use binary search to try mid as the sqrt, use long type because if the number can be really big
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        long start = 1;
        long end = x;
        while(start + 1< end){
            long mid = start + (end - start)/2;
            if(mid * mid == x){
                return (int)mid;
            }
            else if (mid * mid < x){
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if(end * end <= x){
            return (int)end;
        }
        return (int)start;
    }
}
