package in.ankit.benefit.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.benefit.entities.BenefitIssuance;

import java.util.List;

public interface BenefitRepository extends JpaRepository<BenefitIssuance, Long> {
    List<BenefitIssuance> findByUserId(Long userId);
}
