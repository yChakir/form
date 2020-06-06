package ma.tiwtiw.form.aspect.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchemaItemDto {

  @Default
  private String type;

  @JsonProperty("enum")
  private SchemaItemEnumTypeDto _enum;

  private Double minimum;

  private Boolean exclusiveMinimum;

  private Double maximum;

  private Boolean exclusiveMaximum;

  private Double multipleOf;

  private Long maxLength;

  private Long minLength;

  private String pattern;

  private SchemaDto items;

  private Long minItems;

  private Long maxItems;

  private Boolean uniqueItems;

  private SchemaDto additionalItems;

  private Long maxProperties;

  private Long minProperties;

  private List<String> required;

  private List<Pair<String, SchemaDto>> properties;

  @JsonProperty("if")
  private SchemaDto _if;

  private SchemaDto then;

  @JsonProperty("else")
  private SchemaDto _else;

  private String format;

  private String title;

  private String description;

  @JsonProperty("default")
  private Object _default;

  private Boolean readOnly;

  private String $ref;

  private String $comment;
}