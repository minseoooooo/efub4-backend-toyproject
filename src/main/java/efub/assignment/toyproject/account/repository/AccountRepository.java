package efub.assignment.toyproject.account.repository;


import efub.assignment.toyproject.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Boolean existsByEmail(String email);
}