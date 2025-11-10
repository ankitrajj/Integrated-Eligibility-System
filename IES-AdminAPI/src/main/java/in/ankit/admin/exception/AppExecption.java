package in.ankit.admin.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppExecption {
	private String excCode;
	private String excDesc;
	private LocalDateTime excDate;
}
