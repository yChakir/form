package ma.tiwtiw.form.aspect.controller;

import ma.tiwtiw.core.controller.impl.BaseRestController;
import ma.tiwtiw.form.aspect.dto.FormDto;
import ma.tiwtiw.form.model.Form;
import ma.tiwtiw.form.service.FormService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("forms")
public class FormController extends BaseRestController<Form, FormDto, String> {

  private final FormService formService;

  private final ModelMapper modelMapper;

  public FormController(FormService formService, ModelMapper modelMapper) {
    super(Form.class, FormDto.class);
    this.formService = formService;
    this.modelMapper = modelMapper;
  }

  @Override
  protected FormService getService() {
    return formService;
  }

  @Override
  protected ModelMapper getMapper() {
    return modelMapper;
  }
}
