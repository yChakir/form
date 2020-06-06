package ma.tiwtiw.form.aspect.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GridSchemaDto {

  private Long gutter;

  private Long span;

  private Long arraySpan;

  private Long offset;

  private GridSizeDto xs;

  private GridSizeDto sm;

  private GridSizeDto md;

  private GridSizeDto lg;

  private GridSizeDto xl;

  private GridSizeDto xxl;
}
