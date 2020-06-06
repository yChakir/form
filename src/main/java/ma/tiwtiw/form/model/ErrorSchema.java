package ma.tiwtiw.form.model;

import java.util.List;
import javafx.util.Pair;

public interface ErrorSchema {

  List<Pair<String, String>> getErrors();

  void setErrors(List<Pair<String, String>> errors);

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