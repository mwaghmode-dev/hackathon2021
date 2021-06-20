package com.assesmentportal.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topics")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
	@Id
	private String id;
	private String teamName;
	private List<String> teamMember;
}
