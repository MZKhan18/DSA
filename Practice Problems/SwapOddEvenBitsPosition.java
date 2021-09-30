package testClass;

public class SwapOddEvenBitsPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n=23;
	    for(int i=0;i<32; i++) {
	    	if(i%2==0) {
	    		int oV=0,eV=0;
	    		if((n&(1<<i))!=0){
	    			eV=1;
	    		}else {
	    			eV=0;
	    		}

	    		if((n&(1<<i+1))!=0){
	    			oV=1;
	    		}else {
	    			oV=0;
	    		}
	    		if(oV==eV) {
	    			continue;	
	    		}else {
	    			if(eV==1 & oV==0) {
	    				n=n|(1<<(i+1));
	    				n=n&(~(1<<i));
	    				
	    			}else if(eV==0 & oV==1) {
	    				n=n|(1<<(i));
	    				n=n&(~(1<<(i+1)));
	    				
	    			}
	    		}
	    		
	    	}
	    }
	    System.out.println(n);
	}

}
