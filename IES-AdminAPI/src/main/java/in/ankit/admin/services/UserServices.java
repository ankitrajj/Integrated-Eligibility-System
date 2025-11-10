package in.ankit.admin.services;

import java.util.List;

import in.ankit.admin.binding.UnlockForm;
import in.ankit.admin.binding.UserForm;

public interface UserServices {

	public boolean createUser(UserForm form);

	public List<UserForm> fetchUser();

	public UserForm getUserAccById(Integer userId);

	public String changeAccStatus(Integer userId, String status);

	public String unlockUser(UnlockForm form);
}
