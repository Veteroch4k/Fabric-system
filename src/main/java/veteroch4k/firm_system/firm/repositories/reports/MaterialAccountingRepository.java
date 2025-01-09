package veteroch4k.firm_system.firm.repositories.reports;

import org.springframework.data.jpa.repository.JpaRepository;
import veteroch4k.firm_system.firm.models.consumables.Material;
import veteroch4k.firm_system.firm.models.reports.MaterialsAccounting;

public interface MaterialAccountingRepository extends JpaRepository<MaterialsAccounting, Integer> {

}
