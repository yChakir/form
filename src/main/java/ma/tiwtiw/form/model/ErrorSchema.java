package ma.tiwtiw.form.model;

import java.util.List;
import java.util.Map;

public interface ErrorSchema {

  Map<String, String> getErrors();

  void setErrors(Map<String, String> errors);

  Boolean getLiveValidate();

  void setLiveValidate(Boolean liveValidate);

  Boolean getFirstVisual();

  void setFirstVisual(Boolean firstVisual);

  Boolean getOnlyVisual();

  void setOnlyVisual(Boolean onlyVisual);

  List<String> getIngoreKeywords();

  void setIngoreKeywords(List<String> ingoreKeywords);

  Boolean getShowRequired();

  void setShowRequired(Boolean showRequired);
}