package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	int sum=0;
    	int count_a=0;
    	int count_pa1=0;
    	int count_pa2=0;

    	int count_b=0;
    	int count_pb=0;
    	
    	int count_c=0;
    	int count_d=0;
    	
    	int count_e=0;
    	int count_pe=0;
    	
    	int count_f=0;

    	
    	
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
        	case 'E':
        	    count_e++;
        	    break;
        	case 'F':
        	    count_f++;
        	    break;
        	default:
        		return -1; //oops
        	
        	}
        }
        
        
        if(count_a>=5)
        {
            count_pa2=count_pa2+count_a/5;
            count_a=count_a-count_pa2*5;
        }

        if(count_a>=3)
        {
            count_pa1=count_pa1+count_a/3;
            count_a=count_a-count_pa1*3;
        }
        
        
        if(count_e>=2)
            if(count_b-count_e/2 >= 0)
                count_b=count_b-count_e/2;
            else
                count_b=0;
    
        
        if(count_b>=2)
        {
            count_pb=count_pb+count_b/2;
            count_b=count_b-count_pb*2;
        }
        
        if(count_f>=2)
            count_f=count_f-count_f/2+1;// ???????//
        
    
                    
            
        sum = sum+count_a*50+count_pa1*130+count_pa2*200+count_pb*45+count_b*30+count_c*20+count_d*15+count_e*40+count_f*10;
        
        
        
        return sum;
    }
        
}





