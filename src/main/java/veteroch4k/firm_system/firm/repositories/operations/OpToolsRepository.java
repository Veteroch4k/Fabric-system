package veteroch4k.firm_system.firm.repositories.operations;

import org.springframework.data.jpa.repository.JpaRepository;
import veteroch4k.firm_system.firm.models.operations.OpTools;
import veteroch4k.firm_system.firm.models.operations.OpToolsId;

public interface OpToolsRepository extends JpaRepository<OpTools, OpToolsId> {

}
