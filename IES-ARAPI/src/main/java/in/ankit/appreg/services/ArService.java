package in.ankit.appreg.services;

import java.util.List;

import in.ankit.appreg.bindings.AppForm;

public interface ArService {

	public String createApplication(AppForm app);
	public List<AppForm> fetchApps(Integer userId);
}
