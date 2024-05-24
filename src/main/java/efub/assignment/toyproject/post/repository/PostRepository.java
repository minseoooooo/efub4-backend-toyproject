package efub.assignment.toyproject.post.repository;


import efub.assignment.toyproject.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    boolean existsByPostIdAndAccount_AccountId(Long id, Long accountId);
}
