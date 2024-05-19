package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	int sum=0;
    	int x=0;
    	int y=0;
    	
    	for(int i=0;i<skus.length();i++)
    	{
    		if(skus.charAt(i)=='A')
    			x++;
    		if(skus.charAt(i)=='B')
    			y++;
    	}
    	
    	
    	if(x==3)
    		sum=sum+130;
    	if(y==2)
    		sum=sum+45;
    			
    	
        for( int i=0; i<skus.length();i++) {
        	switch(skus.charAt(i)) {
        	case 'A':
        		if(x>=3)
        			continue;
        		sum=sum+50;
        		break;
        	case 'B':
        		if(y>=2)
        			continue;
        		sum=sum+30;
        		break;
        	case 'C':
        		sum=sum+20;
        		break;
        	case 'D':
        		sum=sum+15;
        		break;
        	}
        }
        return sum;
    }
        
}


