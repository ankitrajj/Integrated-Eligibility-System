package in.ankit.datacollection.services;

import java.util.Map;

import in.ankit.datacollection.bindings.DcSummary;
import in.ankit.datacollection.bindings.EducationForm;
import in.ankit.datacollection.bindings.IncomeForm;
import in.ankit.datacollection.bindings.Kids;
import in.ankit.datacollection.bindings.PlanSelForm;

public interface DcService {

	public Map<Integer, String> getPlans();

	public boolean savePlanSelection(PlanSelForm planSel);

	public boolean saveIncome(IncomeForm income);

	public boolean saveEducation(EducationForm education);

	public boolean saveKids(Kids kids);

	public DcSummary fetchSummaryInfo(Long caseNum);

}
