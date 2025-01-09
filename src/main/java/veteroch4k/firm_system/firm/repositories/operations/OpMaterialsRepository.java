package veteroch4k.firm_system.firm.repositories.operations;

import org.springframework.data.jpa.repository.JpaRepository;
import veteroch4k.firm_system.firm.models.operations.OpMaterials;
import veteroch4k.firm_system.firm.models.operations.OpMaterialsId;

public interface OpMaterialsRepository extends JpaRepository<OpMaterials, OpMaterialsId> {

}
