package ma.tiwtiw.form.aspect.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ButtonRenderDto {

  private Long spanLabel;

  private Long spanControl;

  private Long offsetControl;

  private Long spanLabelFixed;

  private String widget;

  private List<String> clazz;

  private String size;

  private Long width;

  private GridSchemaDto grid;

  private String optional;

  private OptionalHelpDto optionalHelp;

}
