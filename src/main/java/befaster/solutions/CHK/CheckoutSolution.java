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
    	int count_g=0, count_h=0, count_i=0, count_j=0, count_k=0, count_l=0, count_m=0, count_n=0, count_o=0, count_p=0, count_q=0, count_r=0, count_s=0, count_t=0, count_u=0, count_v=0, count_w=0, count_x=0, count_y=0, count_z=0;
        
        int count_ph1=0, count_ph2=0, count_pk=0, count_pp=0, count_pq=0, count_pv1=0, count_pv2=0;
        
        
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
        	case 'G':
        	    count_g++;
        	    break;
        	case 'H':
        	    count_h++;
        	    break;
        	case 'I':
        	    count_i++;
        	    break;
        	case 'J':
        	    count_j++;
        	    break;
        	case 'K':
        	    count_k++;
        	    break;
        	case 'L':
        	    count_l++;
        	    break;
        	case 'M':
        	    count_m++;
        	    break;
        	case 'N':
        	    count_n++;
        	    break;
        	case 'O':
        	    count_o++;
        	    break;
        	case 'P':
        	    count_p++;
        	    break;
        	case 'Q':
        	    count_q++;
        	    break;
        	case 'R':
        	    count_r++;
        	    break;
        	case 'S':
        	    count_s++;
        	    break;
        	case 'T':
        	    count_t++;
        	    break;
        	case 'U':
        	    count_u++;
        	    break;
        	case 'V':
        	    count_v++;
        	    break;
        	case 'W':
        	    count_w++;
        	    break;
        	case 'X':
        	    count_x++;
        	    break;
        	case 'Y':
        	    count_y++;
        	    break;
        	case 'Z':
        	    count_z++;
        	    break;
        	default:
        		System.out.println("no");
        	
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
        
        if(count_f>2)
        {
                count_f=count_f-(count_f/3);
                
        }
        
        if(count_h>=10)
        {
            count_ph2=count_ph2+count_h/10;
            count_h=count_h-count_ph2*10;
        }

        if(count_h>=5)
        {
            count_ph1=count_ph1+count_h/5;
            count_h=count_h-count_ph1*5;
        }
        if(count_k>=2)
        {
            count_pk=count_pk+count_k/2;
            count_k=count_k-count_pk*2;
        }
        
        if(count_n>=3)
            if(count_m-count_n/3 >= 0)
                count_m=count_m-count_n/3;
            else
                count_m=0;
        
        if(count_p>=5)
        {
            count_pp=count_pp+count_p/5;
            count_p=count_p-count_pp*5;
        }
        
        if(count_r>=3)
        {
            if(count_q-count_r/3 >= 0)
                count_q=count_q-count_r/3;
            else
                count_q=0;
        }
        
        if(count_q>=3)
        {
           count_pq=count_pq+count_q/3;
           count_q=count_q-count_pq*3;
        }
        
        if(count_v>=3)
        {
            count_pv2=count_pv2+count_v/3;
            count_v=count_v-count_pv2*3;
        }

        if(count_v>=2)
        {
            count_pv1=count_pv1+count_v/2;
            count_v=count_v-count_pv1*2;
        }
        
        if(count_u>3)
        {
                count_u=count_u-(count_u/4);
        }
        
            
        sum = sum+count_a*50+count_pa1*130+count_pa2*200+count_pb*45+count_b*30+count_c*20+count_d*15+count_e*40+count_f*10+count_g*20+count_h*10+count_ph1*45+count_ph2*80+count_i*35+count_j*60+count_k*80+count_pk*150+count_l*90+count_m*15+count_n*40+count_o*10+count_p*50+count_pp*200+count_q*30+count_pq*80+count_r*50+count_s*30+count_t*20+count_u*40+count_v*50+count_pv1*90+count_pv2*130+count_w*20+count_x*90+count_y*10+count_z*50;
        
        
        return sum;
    }
        
}

