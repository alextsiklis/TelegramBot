package acycloid.tgBot.Repository;

import acycloid.tgBot.Entity.Income;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}