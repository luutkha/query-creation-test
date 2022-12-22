package luutkha.fs.query.creation.utils;

import org.springframework.http.ResponseEntity;

import luutkha.fs.query.creation.dto.common.BaseResponse;

public class ResponseFactory {
	private ResponseFactory() {
	}

	public static <T> ResponseEntity<BaseResponse<T>> success(T data) {
		BaseResponse<T> response = new BaseResponse<>();
		response.setSuccess(true);
		response.setCode("200000");
		response.setData(data);
		response.setMessage("Thao tac thanh cong");
		return ResponseEntity.ok(response);
	}

	public static <T> ResponseEntity<BaseResponse<T>> error(T data) {
		BaseResponse<T> response = new BaseResponse<>();
		response.setSuccess(false);
		response.setCode("400000");
		response.setData(data);
		response.setMessage("Thao tac khong thanh cong");
		return ResponseEntity.ok(response);
	}
}