package luutkha.fs.query.creation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import luutkha.fs.query.creation.entity.Word;

public interface WordRepository extends JpaRepository<Word, Long> {
	List<Word> findByEngNotNull();

	Word findByEng(String eng);
}
