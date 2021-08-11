package ii.ii.ioii.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import ii.ii.ioii.domain.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "ii.ii.ioii.mappers.board";

	@Override
	public List<BoardVO> list() throws Exception {
		
		return sql.selectList(namespace+".list");
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);
		
	}

	@Override
	public BoardVO view(int bno) throws Exception {
		return sql.selectOne(namespace + ".view", bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

}
