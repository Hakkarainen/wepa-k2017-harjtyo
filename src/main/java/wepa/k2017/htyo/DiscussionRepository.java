
package wepa.k2017.htyo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wepa.k2017.htyo.domain.Discussion;
//
/**
 *
 * @author THyyppä
 */
public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
}