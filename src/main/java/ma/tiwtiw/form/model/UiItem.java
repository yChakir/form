package ma.tiwtiw.form.model;

import java.util.List;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UiItem implements RenderSchema, HorizontalLayoutSchema, I18NSchema, ErrorSchema {

  /**
   * Custom error message text, key name agrees with `ErrorData.keyword` value
   */
  List<Pair<String, String>> errors;

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
   * Refers to the international key value of `schema.title`
   */
  private String i18n;

  /**
   * Corresponding to `schema.description` internationalization
   */
  private String descriptionI18n;

  /**
   * If realtime validation
   */
  private Boolean liveValidate = Boolean.TRUE;

  /**
   * If show visual error immediately
   */
  private Boolean firstVisual = Boolean.FALSE;

  /**
   * If only show visual error not error text
   */
  private Boolean onlyVisual;

  /**
   * Ignore validation for some data types
   */
  private List<String> ingoreKeywords;

  /**
   * Whether it is mandatory to display `*` on the label to indicate that it is required. Generally,
   * when using a custom check, `validator` may require required items to be processed
   */
  private Boolean showRequired = Boolean.TRUE;

  /**
   * Debug mode
   */
  private Boolean debug;

  /**
   * Order of property
   */
  private List<String> order;

  /**
   * If hide
   */
  private Boolean hidden;

  // todo
  /**
   * Is visible with conditions
   */
  // visibleIf?: { [key: string]: any[] | ((value: any) => boolean) };

  /**
   * ACL permission
   */
  private ACLType acl;
}
