package $069_Sqrt;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static double mySqrt(int x) {
    	double t0=x,t1=0.5*t0+0.5*x/t0;
    	while (Math.abs(t1*t1-x)>=1) {
    		t0=t1;
    		t1=0.5*t0+0.5*x/t0;
    		System.out.println(t1);
    	}
    	
    	return (t1);
        
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(mySqrt(3));
	}
}

