package excercises;

import java.time.*;

public class CompareLoopsTimes3 
{
	public static void main(String[] args) 
	{
	int startTime, endTime;
	final int REPEAT = 100_000;
	final int FACTOR = 1_000_000;
	LocalDateTime.now();
	now = LocalDateTime.now();
	startTime = now.getNano();
	for(int x = 0; x <= REPEAT; ++x)
		for(int y = 0; y <= REPEAT; ++x);
	now = LocalDateTime.now();
	endTime = now.getNano();
	System.out.println("Time for loops starting from 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");
		now = LocalDateTime.now();
		startTime = now.getNano();
		
	}

}
