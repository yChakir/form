package ma.tiwtiw.form.model;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionalHelp {

  private String text;

  private String i18n;

  private String icon;

  private OptionalHelpPlacementEnum placement;

  private OptionalHelpTriggerEnum trigger;

  private Long mouseEnterDelay;

  private Long mouseLeaveDelay;

  private String overlayClassName;

  private Map<String, String> overlayStyle;
}
