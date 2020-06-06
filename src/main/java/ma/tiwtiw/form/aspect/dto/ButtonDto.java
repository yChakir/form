package ma.tiwtiw.form.aspect.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ButtonDto {

  private String submit;

  private String submitType;

  private ButtonIconDto submitIcon;

  private String reset;

  private String resetType;

  private ButtonIconDto resetIcon;

  private String search;

  private String edit;

  private ButtonRenderDto render;

}
