package acycloid.tgBot.Repository;

import acycloid.tgBot.Entity.Spend;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
