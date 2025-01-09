package veteroch4k.firm_system.firm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import veteroch4k.firm_system.firm.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
