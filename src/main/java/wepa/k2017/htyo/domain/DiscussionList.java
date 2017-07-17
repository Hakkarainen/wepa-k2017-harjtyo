
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
@NamedNativeQuery(name = "findMessagesInOrder", 
        query = "SELECT * FROM DiscussionList ORDER BY latest DESC", 
        resultClass = DiscussionList.class)

@Table(name = "DiscussionList")
public class DiscussionList extends AbstractPersistable<Long> {

    @Column(name = "row")
    private int row;
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
    
    public DiscussionList(int row, int topic, String header, int amount, String latest) {
        this.row = row;
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
    public int getRow() {
        
        return this.row;
    }
    public int compareTo(DiscussionList t) {
       if (this.row > t.getRow()) {
            return 1;
        } else if (this.row < t.getRow()) {
            return -1;
        } else {
            return 0;

        }    
    }   
}
