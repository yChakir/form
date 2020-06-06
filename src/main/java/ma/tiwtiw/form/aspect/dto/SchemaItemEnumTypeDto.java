package ma.tiwtiw.form.aspect.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchemaItemEnumTypeDto {

  private Boolean disabled;

  private String label;

  private String title;

  private Object value;

  private String key;

  private Boolean checked;

  private Boolean group;

  private Boolean isLeaf;

  private List<SchemaItemEnumTypeDto> children;
}