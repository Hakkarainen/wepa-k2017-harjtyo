package wepa.k2017.htyo.domain;

/**
 *
 * @author THyyppä
 */
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "DiscussionUser")
public class DiscussionUser extends AbstractPersistable<Long> {

    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;

    @OneToMany
    private List<DiscussionTopic> discussionTopics;

    @ManyToMany
    private List<Discussion> discussions;

    @OneToMany
    private List<DiscussionMessage> discussionMessages;

    public DiscussionUser() {
    }

    public DiscussionUser(String userName) {
        this.userName = userName;
        this.password = "";
    }

    public DiscussionUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public List<DiscussionTopic> getDiscussionsTopics() {
        if (this.discussionTopics == null) {
            this.discussionTopics = new ArrayList<>();
        }
        return this.discussionTopics;
    }

    public List<Discussion> getDiscussions() {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        return this.discussions;
    }

    public List<DiscussionMessage> getDiscussionMessages() {
        if (this.discussionMessages == null) {
            this.discussionMessages = new ArrayList<>();
        }

        return this.discussionMessages;
    }

}
