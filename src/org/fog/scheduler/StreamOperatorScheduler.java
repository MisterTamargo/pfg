package org.fog.scheduler;

import java.util.List;

import src.org.cloudbus.cloudsim.Pe;
import src.org.cloudbus.cloudsim.sdn.overbooking.VmSchedulerTimeSharedOverbookingEnergy;

public class StreamOperatorScheduler extends VmSchedulerTimeSharedOverbookingEnergy{

	public StreamOperatorScheduler(List<? extends Pe> pelist) {
		super(pelist);
	}
}
