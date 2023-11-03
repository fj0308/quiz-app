package com.example.quiz.entity;




import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** quizテーブル用　:Entity*/
@Table(name = "quiz")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
	/**識別ID */
	@Id
	private Integer id;
	/**　クイズの内容 */
	private String question;
	/** クイズの解答 */
	private Boolean answer;
	/** 作成者 */
	private String author;
}
