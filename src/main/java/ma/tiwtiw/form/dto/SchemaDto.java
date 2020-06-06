package ma.tiwtiw.form.dto;

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
public class SchemaDto {

  @Default
  List<Pair<String, SchemaItemDto>> items;
}
