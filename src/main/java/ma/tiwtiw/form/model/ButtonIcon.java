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
public class ButtonIcon {

  /**
   * Equivalent to `nzType` value of `nz-icon`
   */
  private String type;

  /**
   * Icon theme style, default: `outline`
   */
  @Default
  private ButtonIconThemeEnum theme = ButtonIconThemeEnum.OUTLINE;

  /**
   * Only for two-color icons, set the main color of the two-color icons, only effective for the
   * current icon
   */
  private String twoToneColor;

  /**
   * Specify the icon type from IconFont
   */
  private String iconFont;
}
