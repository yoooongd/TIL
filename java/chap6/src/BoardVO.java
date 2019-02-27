import java.util.Date;

public class BoardVO {
//게시물 1개 작성 저장 변수들
	private int seq;//번호
	private String title;//제목
	private String contents;//내용(내용변수 private으로 하고)
	private String writer;//작성자
	private Date time;//시간
	private int password;//암호
	private int viewcount;//조회수
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public int getSeq() {
		return seq;
	}
	
}
