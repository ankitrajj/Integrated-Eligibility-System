package in.ankit.admin.binding;

import lombok.Data;

@Data
public class DashboardCard {

	private Long plansCnt;
	private Long approvedCnt;
	private Long deniedCnt;
	private Double benefitAmt;
	private UserForm user;
	
}
