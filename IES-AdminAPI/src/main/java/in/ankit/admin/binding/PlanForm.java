package in.ankit.admin.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PlanForm {

    private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String Plan_Category;

}
