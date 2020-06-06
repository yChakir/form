package ma.tiwtiw.form.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Button {

  /**
   * Submit text of button
   */
  @Default
  private String submit = "form.button.submit";

  /**
   * Submit type of button
   */
  @Default
  private String submitType = "primary";

  /**
   * Submit icon of button
   */
  private ButtonIcon submitIcon;

  /**
   * Reset text of button
   */
  @Default
  private String reset = "form.button.reset";

  /**
   * Reset type of button
   */
  private String resetType = "default";

  /**
   * Reset icon of button
   */
  private ButtonIcon resetIcon;

  /**
   * Search text of button
   */
  @Default
  private String search = "form.button.search";

  /**
   * Edit text of button
   */
  @Default
  private String edit = "form.button.edit";

  /**
   * Button layout
   */
  private ButtonRender render;

}
