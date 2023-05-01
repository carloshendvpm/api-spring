package com.example.apijavaspring.dto.response;

import com.example.apijavaspring.entity.Person;
import lombok.Getter;

@Getter
public class PersonResponseDTO {
  private long id;

  private String name;
  private String cpf;
  private Integer age;

  public PersonResponseDTO(Person person){
    this.id = person.getId();
    this.name = person.getName();
    this.cpf = person.getCpf();
    this.age = person.getAge();
  }

}
