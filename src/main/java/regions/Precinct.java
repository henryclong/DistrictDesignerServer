package regions;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hengqi Zhu
 */
@Entity
@Table(name = "PRECINCT")
public class Precinct implements Serializable {

  private String id;
  private Integer rowId;
  private String name;
  private String boundary;
  private String stateName;
  private String districtId;
  private Integer population;
  private Integer white;
  private Integer black;
  private Integer asian;
  private Integer hispanic;
  private String adjPrecinctsList;

  public Precinct() {
  }

  public Precinct(String precinctId, String stateName, String boundary, String adjPrecincts) throws Exception {
    this.id = precinctId;
    this.boundary = boundary;
    this.stateName = stateName;
    this.adjPrecinctsList = adjPrecincts;
  }

  @Id
  @GeneratedValue
  @Column(name = "ID")
  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Column(name = "NAME")
  public String getName() {
    return this.name;
  }

  @Column(name = "ROWID")
  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "BOUNDARY")
  public String getBoundary() {
    return this.boundary;
  }

  public void setBoundary(String boundary) {
    this.boundary = boundary;
  }

  @Column(name = "DISTRICT")
  public String getDistrictId() {
    return this.districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  @Column(name = "ADJPRECINCTS")
  public String getAdjPrecinctsList() {
    return this.adjPrecinctsList;
  }

  public void setAdjPrecinctsList(String adjPrecinctsList) {
    this.adjPrecinctsList = adjPrecinctsList;
  }

  @Column(name = "STATE")
  public String getStateName() {
    return this.stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  @Column(name = "POPULATION")
  public Integer getPopulation() {
    return this.population;
  }

  public void setPopulation(Integer population) {
    this.population = population;
  }

  @Column(name = "WHITE")
  public Integer getWhite() {
    return this.white;
  }

  public void setWhite(Integer white) {
    this.white = white;
  }

  @Column(name = "BLACK")
  public Integer getBlack() {
    return this.black;
  }

  public void setBlack(Integer black) {
    this.black = black;
  }

  @Column(name = "ASIAN")
  public Integer getAsian() {
    return this.asian;
  }

  public void setAsian(Integer asian) {
    this.asian = asian;
  }

  @Column(name = "HISPANIC")
  public Integer getHispanic() {
    return this.hispanic;
  }

  public void setHispanic(Integer hispanic) {
    this.hispanic = hispanic;
  }

}
