package org.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.book.domain.CommentDTO;

public interface CommentMapper {
	// 책별 리뷰
	public List<CommentDTO> getList(String isbn);
	// 전체 리뷰 수
	public int getTotalCount(String isbn);
	// 리뷰 추가
	public int insert(CommentDTO comment);
	// 리뷰 수정
	public int update(CommentDTO comment);
	// 리뷰 삭제
	public int delete(@Param("name") String name, @Param("isbn") String isbn);
}