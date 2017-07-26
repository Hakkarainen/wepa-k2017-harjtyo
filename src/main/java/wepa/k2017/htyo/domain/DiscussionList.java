
package wepa.k2017.htyo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author THyyppä
 */
@Entity
//@NamedNativeQuery(name = "findDiscussionsInOrder", 
//        query = "SELECT * FROM DiscussionList ORDER BY latest DESC", 
//        resultClass = DiscussionList.class)

@Table(name = "DiscussionList")
public class DiscussionList extends AbstractPersistable<Long> {

    @Column(name = "topic")
    private int topic;
    @Column(name = "header")
    private String header;
    @Column(name = "amount")
    private int amount;
    @Column(name = "latest")
    private String latest;
    
    public DiscussionList() {
    }
    
    public DiscussionList(int topic, String header, int amount, String latest) {
        this.topic = topic;
        this.header = header;
        this.amount = amount;
        this.latest = latest;
    }
    
    public String getHeader() {
        return this.getHeader();
    }

    public int getAmount() {
        
        return this.amount;
    }    

    public int getDiscussionTopic() {    
        return this.topic;
    }
    
    public String getLatest() {
        
        return this.latest;
    }
}
