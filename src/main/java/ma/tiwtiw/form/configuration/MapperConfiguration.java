package ma.tiwtiw.form.configuration;

import java.util.Map;
import java.util.stream.Collectors;
import ma.tiwtiw.form.dto.FormDto;
import ma.tiwtiw.form.dto.UiItemDto;
import ma.tiwtiw.form.model.Form;
import ma.tiwtiw.form.model.UiItem;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

  @Bean
  public ModelMapper modelMapper() {
    final ModelMapper modelMapper = new ModelMapper();

    Converter<Map<String, UiItem>, Map<String, UiItemDto>> addDollarSign = context -> {
      final Map<String, UiItem> ui = context.getSource();
      if (ui == null) {
        return null;
      }

      return ui.keySet().stream().collect(Collectors.toMap(
          o -> "$" + o,
          o -> modelMapper.map(ui.get(o), UiItemDto.class)
      ));
    };

    Converter<Map<String, UiItemDto>, Map<String, UiItem>> removeDollarSign = context -> {
      final Map<String, UiItemDto> ui = context.getSource();
      if (ui == null) {
        return null;
      }

      return ui.keySet().stream().collect(Collectors.toMap(
          o -> o.replaceAll("\\$", ""),
          o -> modelMapper.map(ui.get(o), UiItem.class)
      ));
    };

    modelMapper.typeMap(FormDto.class, Form.class)
        .addMappings(mapping -> mapping.using(removeDollarSign).map(FormDto::getUi, Form::setUi));

    modelMapper.typeMap(Form.class, FormDto.class)
        .addMappings(mapping -> mapping.using(addDollarSign).map(Form::getUi, FormDto::setUi));

    return modelMapper;
  }
}
