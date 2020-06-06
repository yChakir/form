package ma.tiwtiw.form.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ACLTypeDto {

  private List<String> role;

  private List<String> ability;

  private String mode;

  private Boolean except;
}