package ma.tiwtiw.form.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ButtonIconDto {

  private String type;

  private String theme;

  private String twoToneColor;

  private String iconFont;
}
