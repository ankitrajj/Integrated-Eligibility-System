package in.ankit.correspondence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankit.correspondence.entity.CoNoticeEntity;

@Repository
public interface CoNoticeRepo extends JpaRepository<CoNoticeEntity, Long>{

	public List<CoNoticeEntity> findByNoticeStatus(String status);
	
	public CoNoticeEntity findByCaseNum(Long caseNum);
}
