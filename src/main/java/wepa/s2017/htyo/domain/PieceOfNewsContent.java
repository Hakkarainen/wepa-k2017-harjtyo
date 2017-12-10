
package wepa.k2017.htyo.domain;

/**
 *
 * @author THyyppä
 */
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "DiscussionMessage")
public class DiscussionMessage extends AbstractPersistable<Long> {

    @Column(name = "writerID")
    private Integer writerID;
    @Column(name = "discussion")
    private int discussion;
    @Column(name = "writer")
    private String writer;
    @Column(name = "content")
    private String content;
    @Column(name = "sendTime")
    private Timestamp sendTime;


//
//    public DiscussionMessage() {
//    }
    
    public DiscussionMessage() {
        //this.msgId = -1;
        this.writerID = -1;
        this.writer = "Käyttäjä";
        this.discussion = -1;
        Date date = new Date();
        this.sendTime = new Timestamp(date.getTime());
        this.content = "Viesti";
    }
    
    public DiscussionMessage(String writer, String content) {
        //this.msgId = -1;
        this.writerID = 1;
        this.writer = writer;
        this.discussion = 1;
        Date date = new Date();
        this.sendTime = new Timestamp(date.getTime());
        this.content = content;
    }

    public DiscussionMessage(int writerID, int discussion, String writer, String content, Timestamp sendTime) {
        //this.msgId = msgId;
        this.writerID = writerID;
        this.writer = writer;
        this.discussion = discussion;
        this.sendTime = sendTime;
        this.content = content;
    }
    

    public int getWriterID() {
        return writerID;
    }

    public int getDiscussion() {
        return discussion;
    }

    public String getWriter() {
        return writer;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    public String getContent() {
        return content;
    }

//    public int getMessageID() {
//        return msgId;
//    }       
}
