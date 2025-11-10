package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankit.eligdet.entities.CoNoticeEntity;

@Repository
public interface CoNoticeRepo extends JpaRepository<CoNoticeEntity, Integer> {

}
