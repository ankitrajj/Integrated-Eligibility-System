package in.ankit.eligdet.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CoNoticeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noticeId;
	private Long caseNum;
	private String noticeStatus;
	private String noticeUrl;
	private Integer edgTraceId;
	private LocalDate noticePrintDate;
	
}
