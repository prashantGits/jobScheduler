package com.e3learning.jobScheduler;

import com.carfey.ops.job.Context;
import com.carfey.ops.job.SchedulableJob;

public class MyTestJob implements SchedulableJob  {
	public void execute(Context context) throws Exception {
		System.out.println("Scheduled!");
	}
}
