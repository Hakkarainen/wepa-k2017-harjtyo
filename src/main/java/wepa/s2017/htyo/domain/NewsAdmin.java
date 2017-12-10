
package wepa.k2017.htyo.domain;

import java.sql.Timestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author THyyppä
 */
@Entity
@Table(name = "DiscussionAdmin")
public class DiscussionAdmin extends AbstractPersistable<Long> {
    
    @Column(name = "initiatedBy")
    private Integer initiatedBy;
    @Column(name = "topic")
    private Integer topic;
    @Column(name = "header")
    private String header;
    @Column(name = "numherOfMessages")
    private int numherOfMessages;
    @Column(name = "started")
    private Timestamp started;
    
    public DiscussionAdmin() {
    }

//    public Discussion(Integer initiatedBy, Integer topic, String header) {
//        //this.id = id;
//        this.initiatedBy = initiatedBy;
//        this.topic = topic;
//        this.header = header;
//        this.numherOfMessages = numherOfMessages;
//        this.started = started;
//    }

    public DiscussionAdmin(Integer initiatedBy, Integer topic, String header) {
        //this.id = null;
        this.initiatedBy = initiatedBy;
        this.topic = topic;
        this.header = header;
        this.numherOfMessages = 3;
        //this.started = null;
    }    

    public DiscussionAdmin(Integer initiatedBy, Integer topic, String header, Integer numherOfMessages, Timestamp started) {
        //this.id = id;
        this.initiatedBy = initiatedBy;
        this.topic = topic;
        this.header = header;
        this.numherOfMessages = numherOfMessages;
        this.started = started;
    }
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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
    
    public int getNumherOfMessages() {
        return numherOfMessages;
    }

    public void setNumherOfMessages(Integer numherOfMessages) {
        this.numherOfMessages = numherOfMessages;
    }
}
