package luutkha.fs.query.creation.service.interfaces;

import java.util.List;

import luutkha.fs.query.creation.entity.Word;

public interface IWordService {
	List<Word> getListWords(int length);

	List<Word> findByEnNotNull();

	List<Word> addNewListWords(List<Word> listWords);

	Word findWordById(Long id);
}
