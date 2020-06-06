package ma.tiwtiw.form.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@NonNull
@AllArgsConstructor
public class SchemaItemEnumType {

  /**
   * Disabled
   */
  private Boolean disabled;

  /**
   * Label
   */
  private String label;

  /**
   * Title
   */
  private String title;

  /**
   * Value
   */
  private Object value;

  /**
   * Primary key, applicable to some widget data key names, for example: `tree-select`
   */
  private String key;

  /**
   * Whether selected
   */
  private Boolean checked;

  /**
   * Group name, applicable part of widgets that allow group list, for example: `select`-the text
   * corresponding to the group is `label`-`children` is a child
   */
  private Boolean group;

  private Boolean isLeaf;

  /**
   * Subclass corresponding to the group
   */
  @Default
  private List<SchemaItemEnumType> children = new ArrayList<>();
}