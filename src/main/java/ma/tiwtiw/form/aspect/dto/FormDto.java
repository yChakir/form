package ma.tiwtiw.form.aspect.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.tiwtiw.core.dto.BaseDto;
import ma.tiwtiw.form.model.Form;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor
public class FormDto extends BaseDto<Form, String> {

  private String layout;

  private SchemaDto schema;

  private UiDto ui;

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
