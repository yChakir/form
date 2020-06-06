package ma.tiwtiw.form.model;

import java.util.ArrayList;
import java.util.List;

public class SchemaItemEnumType {
  // [key: string]: any;

  /**
   * 是否禁用状态
   */
  private Boolean disabled;

  /**
   * 文本
   */
  private String label;

  /**
   * 文本
   */
  private String title;

  /**
   * 值
   */
  private Object value;

  /**
   * 主键，适用部分小部件数据键名，例如：`tree-select`
   */
  private String key;

  /**
   * 是否选中
   */
  private Boolean checked;

  /**
   * 组名，适用部分允许组列表的小部件，例如：`select` - 组对应的文本为 `label` - `children` 为子项
   */
  private Boolean group;

  private Boolean isLeaf;

  /**
   * 组对应的子类
   */
  private List<SchemaItemEnumType> children = new ArrayList<>();
}