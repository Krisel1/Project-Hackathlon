package com.ProjectHackathon.CrudDiseases;


import Controller.DiseasesController;
import Models.Diseases;
import Repositories.IDiseasesRepository;
import Services.DiseasesServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.jshell.tool.ConsoleIOContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.verification.VerificationMode;
import org.springframework.boot.test.mock.mockito.MockBean;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CreateControllerTest {

@Mock
    DiseasesServices diseasesServices;

        @InjectMocks
    DiseasesController diseasesController;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
    void createDiseases(){
            Diseases diseases = new Diseases("Asma", "Asma: afección de la respiración");
            when(IDiseasesRepository.save(diseases)).thenReturn(diseases);

            Diseases createdDiseases = diseasesServices.createDiseases(diseases);

            assertNotNull(createdDiseases);
            assertEquals("Asma", createdDiseases.getName());
            assertEquals("Asma: afección de la respiración", createdDiseases.getDescription());

            verify(IDiseasesRepository, times(1)).save(diseases);}

}
@MockBean
private DiseasesServices diseasesServices;

private ObjectMapper objectMapper = new ObjectMapper();

@Test
public void testCreateDiseases() throws Exception {
    Diseases disease = new Diseases("Flu", "Flu description");

    when(diseasesServices.createDiseases(any(Diseases.class))).thenReturn(disease);

    mockMvc.perform(post("/diseases")
                    .contentType("application/json")
                    .content(objectMapper.writeValueAsString(disease)))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name").value("Flu"))
            .andExpect(jsonPath("$.description").value("Flu description"));

    verify(diseasesServices, times(1)).createDiseases(any(Diseases.class));
}

private CreateControllerTest verify(DiseasesServices diseasesServices, VerificationMode times) {
    return null;
}
}
private ConsoleIOContext.AllSuggestionsCompletionTask mockMvc;