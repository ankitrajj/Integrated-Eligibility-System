package in.ankit.appreg.bindings;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppForm {
	private Long caseNum;
	private String fullname;
	private String email;
	private String gender;
	private LocalDate dob;
	private String phno;
	private Long ssn;
	
	private Integer userId;

}
