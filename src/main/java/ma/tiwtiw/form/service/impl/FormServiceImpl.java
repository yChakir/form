package ma.tiwtiw.form.service.impl;

import ma.tiwtiw.core.service.impl.BaseMongoTemplateServiceImpl;
import ma.tiwtiw.form.model.Form;
import ma.tiwtiw.form.service.FormService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl extends BaseMongoTemplateServiceImpl<Form, String> implements
    FormService {

  private final MongoTemplate mongoTemplate;

  public FormServiceImpl(MongoTemplate mongoTemplate) {
    super(Form.class);
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  protected MongoTemplate getMongoTemplate() {
    return mongoTemplate;
  }
}
