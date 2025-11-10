package in.ankit.admin.exception;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class AppExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public ResponseEntity<AppExecption> handleException(String excMsg){	
		logger.error("Exception Occured :" + excMsg );
		
		AppExecption exc = new AppExecption();
		exc.setExcCode("EX003");
		exc.setExcDesc(excMsg);
		exc.setExcDate(LocalDateTime.now());
	    return new ResponseEntity<>(exc, HttpStatus.INTERNAL_SERVER_ERROR);
   }
}