package com.huseyinaydin.spring.dao;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Hüseyin Aydın
 */
@Getter
@Setter
public class SearchRequest {

  private String firstname;
  private String lastname;
  private String email;

}
