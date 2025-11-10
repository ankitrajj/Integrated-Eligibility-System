package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ankit.eligdet.entities.EducationEntity;

public interface EducationRepo extends JpaRepository<EducationEntity, Integer> {

	@Query ("form EducationEntity where caseNum = :caseNum")
	public EducationEntity findByCaseNum(Long caseNum);
}
