package ma.tiwtiw.form.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionalHelpDto {

  private String text;

  private String i18n;

  private String icon;

  private String placement;

  private String trigger;

  private Long mouseEnterDelay;

  private Long mouseLeaveDelay;

  private String overlayClassName;

  private Map<String, String> overlayStyle;
}
