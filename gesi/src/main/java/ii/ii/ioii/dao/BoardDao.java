package ii.ii.ioii.dao;

import java.util.List;

import ii.ii.ioii.domain.BoardVO;

public interface BoardDao {
	
	public List<BoardVO> list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
	// 게시물 조회
	public BoardVO view(int bno) throws Exception;

	// 게시물 수정
	public void modify(BoardVO vo) throws Exception;
}
