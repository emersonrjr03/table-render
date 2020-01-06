package br.ufu.tablerender.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tablemd") 
public class TableMetadata implements Serializable {

    private static final long serialVersionUID = -102466307353949490L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String tableName;
    private String displayName;

    @OneToMany(mappedBy = "table", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<ColumnMetadata> columnMetadataList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<ColumnMetadata> getColumnMetadataList() {
        return columnMetadataList;
    }

    public void setColumnMetadataList(List<ColumnMetadata> columnMetadataList) {
        this.columnMetadataList = columnMetadataList;
    }    

}