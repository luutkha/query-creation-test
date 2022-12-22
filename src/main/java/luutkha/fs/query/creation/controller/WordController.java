package luutkha.fs.query.creation.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import luutkha.fs.query.creation.controller.interfaces.IWordController;
import luutkha.fs.query.creation.dto.common.BaseResponse;
import luutkha.fs.query.creation.entity.Word;
import luutkha.fs.query.creation.service.interfaces.IWordService;
import luutkha.fs.query.creation.utils.ResponseFactory;

@RestController
public class WordController implements IWordController {
	private final IWordService iWordService;

	public WordController(IWordService iWordService) {
		this.iWordService = iWordService;
		// TODO Auto-generated constructor stub
	}
	@Override
	public ResponseEntity<BaseResponse<List<Word>>> getListWords() {
		// TODO Auto-generated method stub
		return ResponseFactory.success(iWordService.getListWords(0));
	}


	@Override
	public ResponseEntity<BaseResponse<List<Word>>> addNewListWords(List<Word> request) {
		// TODO Auto-generated method stub
//		iWordService.addNewListWords(request);
		return ResponseFactory.success(iWordService.addNewListWords(request));
	}

}
