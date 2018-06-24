# Process-Scheduling-Algorithm
# *OS-2017-Lab-assignment-5%*
## Request
+ Write	a	program	(Java	or	C) for	the	implementation	of	the	following	Process	Scheduling	Algorithm.	
1. FCFS	
2. SJF	
3. Round	Robin	</br></br>
The	program	should	prompt	 the	user	 to	enter	 the	number	of	process	 to	be	scheduled	and	 then	should	
prompt	the	user	for	the	processing	times	of	each	individual	process.
Once	the	user	is	finished	entering	the	process	times they	are	prompted	to	choose	a	scheduling	algorithm	
and	in	the	case	of	Round	Robin	the	user	is	prompted	for	the	time	quantum.
## Example
The	program	should	clear	show: </br>
• When	a	process	starts	in	the	CPU </br>
• When	a	process	finishes	or	is	pre-empted	from	the	processor </br>
• The	average	wait	time	for	each	process </br>
• The	average	wait	time	for	the	system </br>
Enter	the	process	name	and	burst	time	for	the	process </br>
Enter	the	process	name	1 </br>
Enter	the	burst	time	for	the	process:	1 </br>
10 </br>
Enter	the	process	name	2 </br>
Enter	the	burst	time	for	the	process: 2 </br>
7 </br>
Enter	the	process	name	3 </br>
Enter	the	burst	time	for	the	proce ss:	3 </br>
10 </br>
Press	1	round	robin	 </br>
Press	2	FCFS	 </br>
Press	3 SJF </br>
Press	4 to	exit </br>
1 </br>
Process	name ++++++ Start	Time ++++++ Remaining	time ++++++ Wait	Time    </br>
1             			  0                  5					             0		    </br>																				
2											5                  5					             5				</br>															 
3 										10                 5	      	             10       </br> </br>

1											15                 0                       10       </br>
2											20				         0                       15       </br>		
3											22								 0                       17       </br>
				 
Average	Wait	Time	is:	19 </br>

## RR(png)
![RR](https://github.com/Tianle97/Process-Scheduling-Algorithm/blob/master/Process-Scheduling-Algorithm/result-picture/RR.png)
## SJF(png)
![SJF](https://github.com/Tianle97/Process-Scheduling-Algorithm/blob/master/Process-Scheduling-Algorithm/result-picture/SJF.png)
## FCFS(png)
![FCFS](https://github.com/Tianle97/Process-Scheduling-Algorithm/blob/master/Process-Scheduling-Algorithm/result-picture/FCFS.png)
## Exit(png)
![Exit](https://github.com/Tianle97/Process-Scheduling-Algorithm/blob/master/Process-Scheduling-Algorithm/result-picture/Exit.png)
