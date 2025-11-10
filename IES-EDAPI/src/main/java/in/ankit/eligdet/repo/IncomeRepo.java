package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ankit.eligdet.entities.IncomeEntity;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer> {

	@Query ("form IncomeEntity where caseNum = :caseNum")
	public IncomeEntity findByCaseNum(Long caseNum);
}
