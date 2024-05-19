package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	int sum=0;
    	int count_a=0;
    	int count_b=0;
    	int count_c=0;
    	int count_d=0;
    	
    	
        for( int i=0; i<skus.length();i++) {
        	switch(skus.charAt(i)) {
        	case 'A':
        		count_a++;
        		break;
        	case 'B':
        		count_b++;
        		break;
        	case 'C':
        		count_c++;
        		break;
        	case 'D':
        		count_d++;
        		break;
        	default:
        		return -1;
        	
        	}
        }
        
        if(count_a>=3)
        {
        	if(count_b>=2)
        		sum=sum+(count_a/3)*130+(count_b/2)*45+count_c*20+count_d*15;
        	else
        		sum=sum+(count_a/3)*130+count_b*30+count_c*20+count_d*15;
        }
        else
        	sum=sum+count_a*50+count_b*45+count_c*20+count_d*15;
        
        
        return sum;
    }
        
}

