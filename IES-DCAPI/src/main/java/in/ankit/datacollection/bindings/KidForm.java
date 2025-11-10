package in.ankit.datacollection.bindings;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KidForm {
	private String kidName;
	private LocalDate kidDob;
	private Long kidSsn;
}
