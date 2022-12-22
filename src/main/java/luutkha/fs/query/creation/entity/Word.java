package luutkha.fs.query.creation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "words")
@Entity
public class Word {
//	TODO
//	https://stackoverflow.com/questions/49954812/how-can-you-make-a-created-at-column-generate-the-creation-date-time-automatical
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	@NonNull
	@Column(unique = true)
	private String eng;
	@NonNull
	private String vi;
	@NonNull
	private String phonetic;

}
