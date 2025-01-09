package veteroch4k.firm_system.firm.models;


import java.time.LocalDate;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order{

  private int id;

  private int product_id;

  private int product_quantity;

  private LocalDate order_date;

  private LocalDate finish_date;


}
