package veteroch4k.firm_system.firm.repositories.factories;

import org.springframework.data.jpa.repository.JpaRepository;
import veteroch4k.firm_system.firm.models.factories.FactoryMaterials;
import veteroch4k.firm_system.firm.models.factories.FactoryMaterialsId;

public interface FactoryMaterialsRepository extends JpaRepository<FactoryMaterials, FactoryMaterialsId> {

}
