public class process implements Comparable<process> {
    String name;
	int waitTime;
	int burstTime;
	
	public process(String name,int burstTime ,int waitTime){
		this.waitTime = waitTime;
		this.name = name;
		this.burstTime = burstTime;
	}
	
	public void display(){
		System.out.println(" "+name+" "+burstTime+" "+waitTime);
	}
	
	public int getawaitTime(){
		return waitTime;
	}
	
	public int getburstTime(){
		return burstTime;
	}
	
	@Override
	public int compareTo(process burstTime0) {
		// TODO Auto-generated method stub
		int waitTime_compare = burstTime0.burstTime;
		//ascending order
		return this.burstTime - waitTime_compare;
				//descending order
				//return result_compare - this.result;
	}
}
