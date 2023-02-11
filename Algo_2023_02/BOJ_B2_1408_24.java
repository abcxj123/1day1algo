import java.util.Scanner;

public class BOJ_B2_1408_24 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String now = scann.next();
		String next = scann.next();
		
		String [] tmp1 = now.split(":");
		String [] tmp2 = next.split(":");
		
		int [] nowTime = new int[3];
		int [] nextTime = new int[3];
		
		for (int i = 0; i < 3; i++) {
			nowTime[i] = Integer.parseInt(tmp1[i]);
			nextTime[i] = Integer.parseInt(tmp2[i]);
		}
		
		int nowSec = nowTime[0]*3600+nowTime[1]*60+nowTime[2];
		int nextSec = nextTime[0]*3600+nextTime[1]*60+nextTime[2];
		
		int time = nextSec - nowSec;
		if(time < 0) time += 24*3600;
		
		int hour1 = time / 3600;
		time -= hour1*3600;
		
		int min1 = time / 60;
		int sec1 = time % 60;
		
		String hour2 = String.valueOf(hour1);
		if(hour2.length() == 1) hour2 = "0"+hour2;
		
		String min2 = String.valueOf(min1);
		if(min2.length() == 1) min2 = "0"+min2;
		
		String sec2 = String.valueOf(sec1);
		if(sec2.length() == 1) sec2 = "0"+sec2;
		
		System.out.println(hour2+":"+min2+":"+sec2);

	}

}
