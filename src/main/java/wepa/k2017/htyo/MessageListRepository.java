
package wepa.k2017.htyo;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import wepa.k2017.htyo.domain.DiscussionMessage;

/**
 *
 * @author THyyppä
 */
public interface MessageListRepository extends JpaRepository<DiscussionMessage, Long> {
    List<DiscussionMessage> findByWriter(String writer);
//    @Query("SELECT * FROM Discussion_List ORDER BY latest DESC")
//    DiscussionMessage findDiscussionMessagesInOrder();
}
