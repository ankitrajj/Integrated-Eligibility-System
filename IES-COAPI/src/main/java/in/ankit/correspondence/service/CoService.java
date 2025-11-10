package in.ankit.correspondence.service;

import in.ankit.correspondence.bindings.CoResponse;

public interface CoService {

	public CoResponse processPendingTriggers() throws Exception;
}
