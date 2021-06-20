package com.assesmentportal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "question")
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	@Id
	private String id;
	private String question;
	private String firstOption;
	private String secondOption;
	private String thirdOption;
	private String fourthOption;
	private String answer;
	private String topic;
}
