import java.util.Arrays;
import java.util.Scanner;

public class scheduler {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int c;	//is the number of processes
		int h;	//length of array
        int burstTime;
        String name;
        int waitTime;
        int quantumTime;
        waitTime = quantumTime = 0;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose process(1:RR,2:FCFS,3:SJF,4:Exit):");
        c = in.nextInt();
        System.out.println("Please enter the number of process:");
        h = in.nextInt();
        process[] p = new process[h];
        RR[] r = new RR[h];
        for(int i = 0; i<h;i++)
        {
        	System.out.print("please input process name: ");
        	name = in.next();
    	    System.out.println("");
    	    System.out.print("Please input burst Time: ");
    	    burstTime = in.nextInt();    
    	    System.out.println("");
    	    p[i] = new process(name,burstTime,waitTime);
    	    r[i] = new RR(name,burstTime,waitTime,quantumTime);
        }
        if (c==1) 
        {
        	System.out.println("Please input a quantum: ");
			int quantum;   	//q is the quantum
			quantum = in.nextInt();
			int sum = 0;
			for (int i = 0; i<h;i++)
			{
				sum = sum + r[i].burstTime;
			}
			int s =0;
			while(sum != 0 ){
				for(int i = 0;i<h;i++)
				{
					if ((r[i].burstTime < quantum) &&(r[i].burstTime != 0))
					{
						r[i].waitTime = s;
						s += r[i].burstTime;
						r[i].quantumTime += 1;
						r[i].burstTime = 0;
						System.out.println(r[i].name+"is finished.");
					}
					else if((r[i].burstTime != 0))
					{
						r[i].burstTime = r[i].burstTime - quantum;
						r[i].waitTime = s;
						s += quantum ;
						r[i].quantumTime += 1;
					}
					r[i].display();
				}
				sum=0;
				for (int i = 0; i<h;i++)
				{
					sum = sum + r[i].burstTime;
				}
			}
			int wt = 0;
			while (sum == 0){
				for(int i = 0;i<h;i++)
				{
					r[i].waitTime = r[i].waitTime - (r[i].quantumTime - 1)*quantum;
					r[i].display();
					wt += r[i].waitTime;
				}
				break;
			}
			int awt;
			awt = wt/h;
			System.out.println("the average Time is : "+awt);
        }
        if (c==2)    //calculate FCFS
        {
        	for(int i=0;i<h;i++)
        	{
        		p[i].display();
        	}
        	System.out.println("After:");
			int u = 0;
			for(int i=0;i<h;i++)
			{
				if(i==0)
				{
					p[i].waitTime = u;
				}
				else
				{
					p[i].waitTime = p[i].waitTime+p[i].burstTime;
				}
				p[i].display();
			}
        }
        averagewaitTime(p, h);
			if(c==3)       //calculate SJF
			{
				for(int i=0;i<h;i++)
				{
					p[i].display();
				}
				System.out.println("After:");
				Arrays.sort(p);
				for(int i=0;i<h;i++)
				{
					p[i].display();
			    }
				System.out.println("");
				for(int i=0;i<h;i++)
				{
					if (i == 0)
					{
						p[i].waitTime = 0;
					}
					else
					{
						p[i].waitTime = p[i-1].burstTime + p[i-1].waitTime;
					}
					p[i].display(); 
				}
				averagewaitTime(p,h);
			}
	}
	
	public static void averagewaitTime( process[] p ,int size){
		int total = 0;
		for(int j=0;j<size;j++)
		{
			total += p[j].getawaitTime();
		}
		System.out.println("Average Wait Time is: "+total/size);
	}
}

 
