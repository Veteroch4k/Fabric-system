package veteroch4k.firm_system.firm.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import veteroch4k.firm_system.firm.models.factories.Factory;
import veteroch4k.firm_system.firm.models.operations.Operation;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "drawings")
public class Drawing {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToOne
  @JoinColumn(name = "operation_id")
  private Operation operation; // Выполняемая операция по данному чертежу

  @OneToOne
  @JoinColumn(name = "factory_id")
  private Factory factory; // Цех, где может выполниться данный чертёж


}
