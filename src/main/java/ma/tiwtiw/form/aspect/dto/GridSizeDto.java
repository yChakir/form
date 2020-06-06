package ma.tiwtiw.form.aspect.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GridSizeDto {

  private Long span;

  private Long order;

  private Long offset;

  private Long push;

  private Long pull;
}
