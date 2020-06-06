package ma.tiwtiw.form.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UiItemDto {

  List<Pair<String, String>> errors;

  private String widget;

  @JsonProperty("class")
  private List<String> clazz;

  private String size;

  private Long width;

  private GridSchemaDto grid;

  private String optional;

  private OptionalHelpDto optionalHelp;

  private Long spanLabel;

  private Long spanControl;

  private Long offsetControl;

  private Long spanLabelFixed;

  private String i18n;

  private String descriptionI18n;

  private Boolean liveValidate;

  private Boolean firstVisual;

  private Boolean onlyVisual;

  private List<String> ingoreKeywords;

  private Boolean showRequired;

  private Boolean debug;

  private List<String> order;

  private Boolean hidden;

  private ACLTypeDto acl;
}
