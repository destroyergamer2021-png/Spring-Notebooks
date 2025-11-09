package br.com.fecaf.controller;

import br.com.fecaf.model.Notebooks;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

    @RestController
    @RequestMapping("/api/v1/notebooks")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public class NotebooksController {

        private List<Notebooks> notebooks = new ArrayList<>();

        @PostConstruct
        public void carregarJson() {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                InputStream inputStream = getClass()
                        .getResourceAsStream("/data/notebooks.json");

                notebooks = objectMapper.readValue(inputStream, new TypeReference<List<Notebooks>>() {});
                System.out.println("✅ JSON de Notebooks carregado com sucesso: " + notebooks.size() + " notebooks.");
            } catch (Exception e) {
                System.err.println("❌ Erro ao carregar o JSON de carros: " + e.getMessage());
            }
        }

        @GetMapping
        public List<Notebooks> listarNotebooks() {
            return notebooks;
        }
    }

