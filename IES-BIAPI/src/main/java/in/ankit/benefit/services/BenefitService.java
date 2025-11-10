package in.ankit.benefit.services;

import java.util.List;

import in.ankit.benefit.entities.BenefitIssuance;

public interface BenefitService {
	public String issueBenefit(BenefitIssuance benefit);

    public List<BenefitIssuance> getAllBenefits();

    public List<BenefitIssuance> getBenefitsByUser(Long userId);
}
