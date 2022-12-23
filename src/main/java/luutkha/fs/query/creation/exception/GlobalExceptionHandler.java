package luutkha.fs.query.creation.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import luutkha.fs.query.creation.dto.common.BaseResponse;
import luutkha.fs.query.creation.utils.ResponseFactory;

@RestControllerAdvice
public class GlobalExceptionHandler {
	// Có thể handle nhiều Exception class
	// {} is required if add 2 or more class
	// catch first Exception class
	@ExceptionHandler({ SQLIntegrityConstraintViolationException.class, DataIntegrityViolationException.class })
	public ResponseEntity<BaseResponse<String>> handleExceptionA(Exception e) {
		return ResponseFactory.error(e.getMessage());
	}

	@ExceptionHandler({ AppException.class })
	public ResponseEntity<BaseResponse<String>> handleAppException(Exception e) {
		return ResponseFactory.error(e.getMessage());
	}

	// Có thêm các @ExceptionHandler khác...

	// Nên bắt cả Exception.class
	// Các lỗi chưa được handle cụ thể sẽ được handle ở đây.
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleUnwantedException(Exception e) {
		// Log lỗi ra và ẩn đi message thực sự (xem phần 3.2)
		e.printStackTrace(); // Thực tế người ta dùng logger
		return ResponseEntity.status(500).body("Unknow error");
	}
}
