package ma.tiwtiw.form.model;

import java.util.List;

interface RenderSchema {

  String getWidget();

  void setWidget(String widget);

  List<String> getClazz();

  void setClazz(List<String> clazz);

  SizeEnum getSize();

  void setSize(SizeEnum size);

  Long getWidth();

  void setWidth(Long width);

  GridSchema getGrid();

  void setGrid(GridSchema grid);

  String getOptional();

  void setOptional(String optional);

  OptionalHelp getOptionalHelp();

  void setOptionalHelp(OptionalHelp optionalHelp);
}