package com.huseyinaydin.spring.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Hüseyin Aydın
 */
@Setter
@Getter
@Entity
public class Mission {

  @Id
  @GeneratedValue
  private Integer id;

  private String name;

  private int duration;

  @ManyToMany(mappedBy = "missions")
  private List<Employee> employees;

}
