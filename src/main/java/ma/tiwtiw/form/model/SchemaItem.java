package ma.tiwtiw.form.model;

import java.util.ArrayList;
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
public class SchemaItem {

  /**
   * Data type, support JavaScript basic types
   */
  @Default
  private SchemaItemType type = SchemaItemType.STRING;

  /**
   * Enum, static data source
   */
  private SchemaItemEnumType _enum;

  /**
   * Minimum value
   */
  private Double minimum;

  /**
   * If excluding minimum value
   */
  private Boolean exclusiveMinimum;

  /**
   * Maximum value
   */
  private Double maximum;

  /**
   * If excluding maximum value
   */
  private Boolean exclusiveMaximum;

  /**
   * Multiple
   */
  private Double multipleOf;

  /**
   * Maximum length of string
   */
  private Long maxLength;

  /**
   * Minimum length of string
   */
  private Long minLength;

  /**
   * Regular expression, must set if format: 'regex' has been set
   */
  private String pattern;

  /**
   * Array element description, only support array object. Can use other components if array of
   * basic type is needed
   */
  private Schema items;

  /**
   * Minimum number of element in array
   */
  private Long minItems;

  /**
   * Maximum number of element in array
   */
  private Long maxItems;

  /**
   * Element is unique in array
   */
  private Boolean uniqueItems;

  /**
   * additional validation rules for array
   */
  private Schema additionalItems;

  /**
   * Maximum number of property, must be a nonnegative integer
   */
  private Long maxProperties;

  /**
   * Maximum number of property, must be a nonnegative integer
   */
  private Long minProperties;

  /**
   * If required
   */
  private List<String> required;

  /**
   * Propery definition
   */
  @Default
  private List<Pair<String, Schema>> properties = new ArrayList<>();

  /**
   * Condition validation
   */
  private Schema _if;

  /**
   * Condition validation
   */
  private Schema then;

  /**
   * Condition validation
   */
  private Schema _else;

  /**
   * Data format
   *
   * @see <a href="http://json-schema.org/draft/2019-09/json-schema-validation.html">Doc</a>
   */
  private String format;

  /**
   * Title
   */
  private String title;

  /**
   * Description
   */
  private String description;

  /**
   * Default value
   */
  private Object _default;

  /**
   * If read only, equals to nzDisabled
   */
  private Boolean readOnly;

  /**
   * Reference definition
   */
  private String $ref;

  // $schema?: string;
  /**
   * Comment for developer, no real meaning, won't be validated
   */
  private String $comment;
}