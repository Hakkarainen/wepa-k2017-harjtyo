package wepa.k2017.htyo.domain;

/**
 *
 * @author THyyppä
 */
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "DiscussionTopic")
public class DiscussionTopic extends AbstractPersistable<Long> {
    
    @Column(name = "topic")
    private Integer topic;
    @Column(name = "writer")
    private String writer;
    @Column(name = "header")
    private String header;
    
    @OneToMany
    private List<Discussion> discussions;
    
    public DiscussionTopic() {
    }

    public DiscussionTopic(Integer topic, String writer, String header) {
        this.topic = topic;
        this.writer = writer;
        this.header = header;
    }
    
    public List<Discussion> getDiscussions() {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        return this.discussions;
    }
    
    public List<Discussion> addDiscussion(Discussion discussion) {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        this.discussions.add(discussion);
        return this.discussions;
    }
    
        public void delDiscussion(Discussion discussion) {
        if (this.discussions == null) {
            return;
        }
        this.discussions.remove(discussion);
    }

    public Integer getTopic() {
        return this.topic;
    }

    public void setTopic(Integer topic) {
        this.topic = topic;
    }
    
    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String header) {
        this.header = writer;
    }
    
    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}

