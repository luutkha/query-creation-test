package luutkha.fs.query.creation.controller.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import luutkha.fs.query.creation.dto.common.BaseResponse;
import luutkha.fs.query.creation.entity.Word;

@RequestMapping("/api/v1/word/")
public interface IWordController {

	@GetMapping(path = "/")
	ResponseEntity<BaseResponse<List<Word>>> getListWords();

	@PostMapping(path = "/")
	ResponseEntity<BaseResponse<List<Word>>> addNewListWords(@Validated @RequestBody List<Word> request);
}
