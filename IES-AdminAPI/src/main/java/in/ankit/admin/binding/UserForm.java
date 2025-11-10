package in.ankit.admin.binding;

import lombok.Data;

@Data
public class UserForm {
	private String fullName;
	private String userEmail;
	private String userPwd;
	private Long userPhno;
	private String userGender;
	private String UserDob;
	private String userSSN;
}
