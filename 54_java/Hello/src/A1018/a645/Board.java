package A1018.a645;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public void setSubject() {
        this.subject = subject;
    }

    public void setContent() {
        this.content = content;
    }

    public void setWriter() {
        this.writer = writer;
    }
}
