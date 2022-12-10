package com.huseyinaydin.spring.dto;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Hüseyin Aydın
 */
@Getter
@Setter
public class ExampleDto {

  @NotNull
  private String a;
  @NotNull
  private String b;
  @NotNull
  private String c;

}
