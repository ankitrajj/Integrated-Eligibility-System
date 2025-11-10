package in.ankit.datacollection.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ankit.datacollection.bindings.DcSummary;
import in.ankit.datacollection.bindings.EducationForm;
import in.ankit.datacollection.bindings.IncomeForm;
import in.ankit.datacollection.bindings.Kids;
import in.ankit.datacollection.bindings.PlanSelForm;
import in.ankit.datacollection.services.DcService;

@RestController
public class DcController {

	@Autowired
	private DcService dcService;
	
	@GetMapping("/plan-names")
	public Map<Integer,String> getPlans(){
		return dcService.getPlans();
	}
	
	@PostMapping("/planselection")
	public ResponseEntity<String> savePlanSelection(@RequestBody PlanSelForm planSelection){
		boolean status = dcService.savePlanSelection(planSelection);
		if(status) {
			return new ResponseEntity<>("Plan Saved!!", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Not Saved!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/income")
	public ResponseEntity<String> saveIncome(@RequestBody IncomeForm income){
		boolean status = dcService.saveIncome(income);
		if(status) {
			return new ResponseEntity<>("Income Saved!!", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Not Saved!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/education")
	public ResponseEntity<String> saveEducation(@RequestBody EducationForm education){
		boolean status = dcService.saveEducation(education);
		if(status) {
			return new ResponseEntity<>("Education Info Saved!!", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Not Saved!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/kids")
	public ResponseEntity<String> saveKids(@RequestBody Kids kids){
		boolean status = dcService.saveKids(kids);
		if(status) {
			return new ResponseEntity<>("Kids Info Saved!!", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Not Saved!!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/dc-summary/{caseNum}")
	public ResponseEntity<DcSummary> getDcSummary(@PathVariable Long caseNum){
		DcSummary summaryInfo = dcService.fetchSummaryInfo(caseNum);
		return new ResponseEntity<>(summaryInfo, HttpStatus.OK);
	
	}
}
