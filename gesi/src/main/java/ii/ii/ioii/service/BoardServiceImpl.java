package ii.ii.ioii.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ii.ii.ioii.dao.BoardDao;
import ii.ii.ioii.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao ;
	
	@Override
	public List<BoardVO> list() throws Exception {

		return dao.list();
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		
		dao.write(vo);
	}

	@Override
	public BoardVO view(int bno) throws Exception {

		 return dao.view(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		
		dao.modify(vo);
	}

}
