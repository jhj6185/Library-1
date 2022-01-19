package org.book.domain;

import java.util.Date;

import lombok.Data;

@Data
public class CommentDTO {
	private String name;
	private String isbn;
	private String content;
	private Date regdate;
}
