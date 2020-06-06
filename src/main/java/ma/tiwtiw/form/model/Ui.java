package ma.tiwtiw.form.model;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For UI Schema, the KEY name **must** start with `$` (for example: `$name`, `$id`) in order to
 * distinguish between the KEY value and the UI option-the structure level should be consistent with
 * `SFSchema`-when KEY is `*` means apply to all sub-form elements
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ui {

  @Default
  List<Pair<String, UiItem>> items = new ArrayList<>();
}
