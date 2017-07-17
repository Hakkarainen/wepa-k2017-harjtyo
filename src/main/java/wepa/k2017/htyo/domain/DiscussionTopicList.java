
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
@NamedNativeQuery(name = "discussionsPerTopic", 
        query = "SELECT * FROM DiscussionTopicList ORDER BY latest DESC", 
        resultClass = DiscussionTopicList.class)

@Table(name = "DiscussionTopicList")
public class DiscussionTopicList extends AbstractPersistable<Long> {

    @Column(name = "header")
    private String header;
    @Column(name = "amount")
    private int amount;
    @Column(name = "latest")
    private String latest;
    
    public DiscussionTopicList() {
    }
    
    public DiscussionTopicList(String header, int amount, String latest) {
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
    
    public String getLatest() {
        
        return this.latest;
    }  
}
