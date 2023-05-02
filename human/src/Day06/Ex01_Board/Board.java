package Day06.Ex01_Board;

import java.util.Date;


public class Board {
	
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	
	private Date regDate;
	private Date updDate;
	
	
	public Board() {
		this("�젣紐⑹뾾�쓬", "�궡�슜�뾾�쓬", "湲��벖�씠�뾾�쓬");
	}

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = new Date();
		this.updDate = new Date();
	}

	// getter(), setter()
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	// toString()
	// : 媛앹껜瑜� 異쒕젰�븷 �븣, 吏��젙�븷 臾몄옄�뿴 �삎�떇�쓣 諛섑솚�븯�뒗 硫붿냼�뱶
	//   Object(理쒖긽�쐞�겢�옒�뒪)�뿉 �젙�쓽�릺�뼱 �엳�쑝硫�, �씠瑜� �삤踰꾨씪�씠�뵫�븳�떎.
//	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", updDate=" + updDate + "]";
		// Board [boardNo=1, title=�젣紐�, ...]
	}
	
	
	
}






























	
	
	
	
	
	
	
	
	
	
