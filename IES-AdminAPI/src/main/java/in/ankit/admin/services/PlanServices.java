package in.ankit.admin.services;

import java.util.List;

import in.ankit.admin.binding.PlanForm;

public interface PlanServices {

	public boolean createPlan(PlanForm form);

	public List<PlanForm> fetchPlan();

	public PlanForm getPlanById(Integer planId);

	public String changePlanStatus(Integer planId, String status);

}
