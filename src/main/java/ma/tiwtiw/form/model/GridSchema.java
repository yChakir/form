package ma.tiwtiw.form.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GridSchema {

  /**
   * Grid spacing
   */
  private Long gutter;

  /**
   * The number of columns placeholders, which is equivalent to `display: none` when it is `0`
   */
  private Long span;

  /**
   * The number of columns placeholders, which is equivalent to `display: none` when it is `0`
   */
  private Long arraySpan;

  /**
   * The number of colums on the left side of the grid
   */
  private Long offset;

  /**
   * Grid size for xs screen
   */
  private GridSize xs;

  /**
   * Grid size for sm screen
   */
  private GridSize sm;

  /**
   * Grid size for md screen
   */
  private GridSize md;

  /**
   * Grid size for lg screen
   */
  private GridSize lg;

  /**
   * Grid size for xl screen
   */
  private GridSize xl;

  /**
   * Grid size for xxl screen
   */
  private GridSize xxl;
}
