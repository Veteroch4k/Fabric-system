package veteroch4k.firm_system.firm.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Drawing {

  private int id;

  private int operation_id; // Выполняемая операция по данному чертежу

  private int factory_id; // Цех, где может выполниться данный чертёж


}
