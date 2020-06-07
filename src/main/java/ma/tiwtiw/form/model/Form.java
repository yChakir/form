package ma.tiwtiw.form.model;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.model.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Form extends BaseModel<String> {

  /**
   * Layout of the form
   */
  @Default
  private LayoutEnum layout = LayoutEnum.HORIZONTAL;

  /**
   * Required JSON Schema
   */
  private Schema schema;

  /**
   * UI Schema
   */
  @Default
  Map<String, UiItem> ui = new HashMap<>();

  /**
   * Default form values
   */
  private Object formData;

  /**
   * Form type mode
   */
  @Default
  private ModeEnum mode = ModeEnum.DEFAULT;

  /**
   * Submit button of the form
   */
  private Button button;

  /**
   * Whether to show visual error immediately
   */
  @Default
  private Boolean firstVisual = Boolean.TRUE;


  /**
   * Whether to live validate
   */
  @Default
  private Boolean liveValidate = Boolean.TRUE;

  /**
   * Autocomplete value of this form
   */
  private Boolean autocomplete;

  /**
   * Whether to disabled status
   */
  @Default
  private Boolean disabled = Boolean.FALSE;

  /**
   * Whether to load status，when true reset button is disabled status, submit button is loading
   * status
   */
  @Default
  private Boolean loading = Boolean.FALSE;

  /**
   * Whether to not display : after label text.
   */
  @Default
  private Boolean noColon = Boolean.FALSE;

  /**
   * Whether compact style
   */
  @Default
  private Boolean compact = Boolean.FALSE;

  /**
   * Whether to clean up data for undefined Schema
   */
  @Default
  private Boolean cleanValue = Boolean.FALSE;
}
