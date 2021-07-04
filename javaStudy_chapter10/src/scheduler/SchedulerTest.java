package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		// R이 들어오면 Roundrobin 방식
		// L이 들어오면 Leastjob 방식
		// P가 들어오면 PriortyAllocation 방식
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new Leastjob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
