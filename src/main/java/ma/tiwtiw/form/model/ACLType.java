package ma.tiwtiw.form.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ACLType {

  /**
   * List of role
   */
  private List<String> role;

  /**
   * List of permission
   */
  private List<String> ability;

  /**
   * <ul>
   * <li>allOf Must be valid against all of the given permission.</li>
   * <li>oneOf Must be valid against exactly one of the given permission.</li>
   * </ul>
   */
  @Default
  private ACLTypeModeEnum mode = ACLTypeModeEnum.ONE_OF;

  /**
   * Whether it's except, when the result is true, it means unauthorized
   */
  private Boolean except;
}