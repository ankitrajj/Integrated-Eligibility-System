package in.ankit.datacollection.bindings;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeForm {
	
	private Integer caseNum;
	private Integer userId;
	private Double salaryIncome;
	private Double rentIncome;
	private Double propertyIncome;
}
