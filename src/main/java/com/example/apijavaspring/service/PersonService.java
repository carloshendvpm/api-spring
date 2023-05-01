package com.example.apijavaspring.service;


import com.example.apijavaspring.dto.request.PersonRequestDTO;
import com.example.apijavaspring.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {
  PersonResponseDTO findById(Long id);

  List<PersonResponseDTO> findAll();

  PersonResponseDTO register(PersonRequestDTO personDTO);

  PersonResponseDTO update(Long id, PersonRequestDTO personDTO);

  String delete(Long id);
}
