package com.ProjectHackathon.CrudDiseases;

import Controller.DiseasesController;
import Models.Diseases;
import Services.DiseasesServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class DiseasesControllerTest {

    @Mock
    DiseasesServices diseasesServices;

    @InjectMocks
    DiseasesController diseasesController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllDiseases() {
        ArrayList<Diseases> diseasesList = new ArrayList<>();
        when(diseasesServices.getAllDiseases()).thenReturn(diseasesList);
        ArrayList<Diseases> result = diseasesController.getAllDiseases();

        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(diseasesServices, times(1)).getAllDiseases();
    }

    @Test
    void testCreateDisease() {
        Diseases newDisease = new Diseases();
        when(diseasesServices.createDiseases(any(Diseases.class))).thenReturn(newDisease);

        Diseases result = diseasesController.createDiseases(newDisease);

        assertNotNull(result);
        verify(diseasesServices, times(1)).createDiseases(any(Diseases.class));
    }

    @Test
    void testDeleteDisease() {
        Long diseaseId = 1L;
        when(diseasesServices.deleteDiseases(diseaseId)).thenReturn(true);

        boolean result = diseasesController.deleteDiseases(diseaseId);

        assertTrue(result);
        verify(diseasesServices, times(1)).deleteDiseases(diseaseId);
    }


    @Test
    void testUpdateDisease() {
        Long diseaseId = 1L;
        Diseases diseaseDetails = new Diseases();
        Optional<Diseases> updatedDiseases = Optional.of(new Diseases());
        when(diseasesServices.upadateDiseases(eq(diseaseId), any(Diseases.class))).thenReturn(updatedDiseases);

        Optional<Diseases> result = diseasesController.updateDiseases(diseaseId, diseaseDetails);

        assertTrue(result.isPresent());
        verify(diseasesServices, times(1)).upadateDiseases(eq(diseaseId), any(Diseases.class));
    }

}











