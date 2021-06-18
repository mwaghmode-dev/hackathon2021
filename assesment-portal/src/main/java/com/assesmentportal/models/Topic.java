package com.assesmentportal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topics")
@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
	@Id
	private int id;
	private String topicName;
}
