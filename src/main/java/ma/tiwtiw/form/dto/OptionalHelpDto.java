package ma.tiwtiw.form.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javatuples.Pair;

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

  private Pair<String, String> overlayStyle;
}
