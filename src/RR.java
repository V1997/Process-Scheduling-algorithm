public class RR {
	String name;
	int burstTime;
	int quantumTime;
	int waitTime;

	public RR(String name,int burstTime,int quantumTime,int waitTime){
		this.name = name;
		this.burstTime = burstTime;
		this.quantumTime = quantumTime;
		this.waitTime = waitTime;
	}
	
	public void display(){
		System.out.println(" "+name+" "+burstTime+" "+waitTime+" "+quantumTime);
	}
	
	public String getname(){
		return this.name;
	}
	
	public int getBurstTime() {
		return burstTime;
	}
	
	public int getQuantumTime(){
		return quantumTime;
	}
	
	public int getWaitTime(){
		return waitTime;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBurstTime(int burstTime){
		this.burstTime = burstTime;
	}

	public void setQuantumTime(int quantumTime){
		this.quantumTime = quantumTime;
	}

	public void setWaitTime(int waitTime){
		this.waitTime = waitTime;
	}
}