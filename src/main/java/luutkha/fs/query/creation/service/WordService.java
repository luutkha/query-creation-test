package luutkha.fs.query.creation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import luutkha.fs.query.creation.entity.Word;
import luutkha.fs.query.creation.exception.AppException;
import luutkha.fs.query.creation.repository.WordRepository;
import luutkha.fs.query.creation.service.interfaces.IWordService;

@Service
public class WordService implements IWordService {

	private final WordRepository wordRepository;

	public WordService(WordRepository wordRepository) {
		this.wordRepository = wordRepository;

	}

	@Override
	public List<Word> getListWords(int length) {

		return wordRepository.findAll();
	}

	@Override
	public List<Word> findByEnNotNull() {
		return wordRepository.findByEngNotNull();
	}

	@Override
	public List<Word> addNewListWords(List<Word> listWords) {
		return wordRepository.saveAll(listWords);
	}

	@Override
	public Word findWordById(Long id) {
		// TODO Auto-generated method stub
		Optional<Word> word = wordRepository.findById(id);
		if (word.isPresent())
			return word.get();
		throw new AppException(4041, "Word not found");

	}

}
