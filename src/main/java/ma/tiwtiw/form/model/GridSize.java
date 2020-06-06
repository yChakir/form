package ma.tiwtiw.form.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GridSize {

  private Long span;

  private Long order;

  private Long offset;

  private Long push;

  private Long pull;
}
