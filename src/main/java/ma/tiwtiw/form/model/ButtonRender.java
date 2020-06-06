package ma.tiwtiw.form.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ButtonRender implements HorizontalLayoutSchema, RenderSchema {

  /**
   * `label` grid placeholders, default: `5` - `0` is equivalent to `display: none` - Limited to
   * horizontal layout
   */
  private Long spanLabel;

  /**
   * `control` grid placeholders, default: `19` - `0` is equivalent to `display: none` - Limited to
   * horizontal layout
   */
  private Long spanControl;

  /**
   * `control` The number of grid spaces on the left side of the grid. - Limited to horizontal
   * layout
   */
  private Long offsetControl;

  /**
   * `label` fixed width - Limited to horizontal layout
   */
  private Long spanLabelFixed;

  /**
   * Widget name
   */
  private String widget;

  /**
   * Custom class, equivalent to `[ngClass]` value
   */
  private List<String> clazz;

  /**
   * Element component size
   */
  private SizeEnum size;

  /**
   * Specify the width, unit: `px`
   */
  private Long width;

  /**
   * Responsive properties
   */
  private GridSchema grid;

  /**
   * Label optional information
   */
  private String optional;

  /**
   * Optional help for tags, use `nz-tooltip` to show
   */
  private OptionalHelp optionalHelp;

}
