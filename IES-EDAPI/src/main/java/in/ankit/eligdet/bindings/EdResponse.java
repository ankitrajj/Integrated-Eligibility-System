package in.ankit.eligdet.bindings;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EdResponse {

	private Long caseNum;
	private String planName;
	private String planStatus;
	private Double benefitAmt;
	
	private LocalDate eligStartDate;
	private LocalDate eligEndDate;
	private String denialRsn;
}
