package br.ufu.tablerender.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.codehaus.jackson.annotate.JsonIgnore;

@Table(
   name = "columnmd", 
   uniqueConstraints = {@UniqueConstraint(columnNames = {"columnName", "table_id"})}
)
@Entity
public class ColumnMetadata implements Serializable {

    private static final long serialVersionUID = -3003624850210959938L;

    @Id
    @GeneratedValue
    private Long id;
    private String columnName;
    private String dataType;//B - Boolean; I - Integer; D - Decimal; T - Text; R - Relation
    private Integer size;
    private Boolean nullable;
    private String defaultData; 
    private String displayName;
    private Integer displayOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    private TableMetadata table;
    @ManyToOne(fetch = FetchType.LAZY)
    private TableMetadata relatedTable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public String getDefaultData() {
        return defaultData;
    }

    public void setDefaultData(String defaultData) {
        this.defaultData = defaultData;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
    @JsonIgnore
    public TableMetadata getTable() {
        return table;
    }

    public void setTable(TableMetadata table) {
        this.table = table;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @JsonIgnore
    public TableMetadata getRelatedTable() {
        return relatedTable;
    }

    public void setRelatedTable(TableMetadata relatedTable) {
        this.relatedTable = relatedTable;
    }
    
}
