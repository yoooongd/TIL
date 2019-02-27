package vo;

public class BoardVo {
	int seq;//게시물 번호
	String title;//제목
	String contents;//내용
	int viewcount;//조회수

	public String toString() {
		return (seq+"="+title+"="+contents+"="+viewcount+"\n");
	}
	
	public BoardVo(int seq, String title, String contents, int viewcount) {
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.viewcount = viewcount;
}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
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
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
}
