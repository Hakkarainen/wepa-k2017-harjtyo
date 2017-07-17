package wepa.k2017.htyo.domain;

/**
 *
 * @author THyyppä
 */
import java.sql.Timestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Discussion")
public class Discussion extends AbstractPersistable<Long> {
    
    @Column(name = "initiatedBy")
    private Integer initiatedBy;
    @Column(name = "topic")
    private Integer topic;
    @Column(name = "header")
    private String header;
    @Column(name = "numberOfMessages")
    private int numberOfMessages;
    @Column(name = "started")
    private String started;
    
    @OneToMany
    private List<DiscussionMessage> messages;
    
    public Discussion() {
    }

//    public Discussion(Integer initiatedBy, Integer topic, String header) {
//        //this.id = id;
//        this.initiatedBy = initiatedBy;
//        this.topic = topic;
//        this.header = header;
//        this.numberOfMessages = numberOfMessages;
//        this.started = started;
//    }

    public Discussion(Integer initiatedBy, Integer topic, String header) {
        //this.id = null;
        this.initiatedBy = initiatedBy;
        this.topic = topic;
        this.header = header;
        this.numberOfMessages = 3;
        this.started = "2017-07-15 18:00:00.000";
    }    

    public Discussion(Integer initiatedBy, Integer topic, String header, Integer numherOfMessages, Timestamp started) {
        //this.id = id;
        this.initiatedBy = initiatedBy;
        this.topic = topic;
        this.header = header;
        this.numberOfMessages = 0;
        this.started = "2017-07-15 18:00:00.000";
    }
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public List<DiscussionMessage> getMessages() {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }

        return this.messages;
    }

    public Integer getInitiator() {
        return initiatedBy;
    }

    public void setInitiator(Integer initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public Integer getTopic() {
        return topic;
    }

    public void setTopic(Integer topic) {
        this.topic = topic;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
//    public Timestamp getStarted() {
//        return started;
//    }
//    public void setStarted(Timestamp started) {
//        this.started = started;
//    }
    
    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    public void setNumherOfMessages(Integer numherOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }
}
