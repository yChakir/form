package ma.tiwtiw.form.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.dto.BaseDto;
import ma.tiwtiw.form.model.Form;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FormDto extends BaseDto<Form, String> {

  private String layout;

  private SchemaDto schema;

  Map<String, UiItemDto> ui;

  private Object formData;

  private String mode;

  private ButtonDto button;

  private Boolean firstVisual;

  private Boolean liveValidate;

  private Boolean autocomplete;

  private Boolean disabled;

  private Boolean loading;

  private Boolean noColon;

  private Boolean compact;

  private Boolean cleanValue;
}
