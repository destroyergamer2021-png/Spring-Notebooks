# API REST de Notebooks - Spring Boot

## 📋 Descrição do Projeto

Esta é uma API REST desenvolvida em Spring Boot para gerenciar um catálogo de notebooks. A API permite operações CRUD (Create, Read, Update, Delete) e carrega dados iniciais de um arquivo JSON.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4.0.0-RC1**
- **Spring Web**
- **Jackson** (para manipulação de JSON)
- **Maven** (gerenciamento de dependências)

## 📝 Observações Importantes

- A API utiliza armazenamento em memória (dados são perdidos ao reiniciar)
- CORS está habilitado para permitir requisições de qualquer origem
- Os dados iniciais são carregados automaticamente do arquivo JSON
- Implementa apenas o endpoint GET para listagem de notebooks

## 📋 Objetivo

Desenvolver uma API REST completa utilizando Spring Boot, seguindo o modelo da API de Carros apresentada em aula. O aluno deve escolher um dos temas sugeridos e implementar todas as operações CRUD.

## 📝 Requisitos Obrigatórios

### 1. Estrutura do Projeto
- ✅ Projeto Maven com Spring Boot
- ✅ Estrutura de pacotes organizada (model, controller)
- ✅ Classe principal com @SpringBootApplication

### 2. Model (Entidade)
- ✅ Classe com pelo menos 8 atributos relevantes
- ✅ Todos os getters e setters implementados
- ✅ Método toString() sobrescrito

### 3. Controller REST
- ✅ Anotações corretas (@RestController, @RequestMapping, @CrossOrigin)
- ✅ Implementação de todos os endpoints CRUD:
  - **GET** `/api/v1/notebooks` - Listar todos
  - **GET** `/api/v1/notebooks/{id}` - Buscar por ID

### 4. Dados Iniciais
- ✅ Arquivo JSON com pelo menos 10 registros
- ✅ Carregamento automático dos dados com @PostConstruct
- ✅ Dados realistas e bem estruturados

### 5. Funcionalidades
- ✅ Armazenamento em memória (List)
- ✅ Pesquisar por ID

## 📦 Estrutura do Projeto

projeto-api-[tema]/
├── pom.xml
├── README.md (documentação da sua API)
├── src/
│   └── main/
│       ├── java/
│       │   └── br/com/fecaf/
│       │       ├── App.java
│       │       ├── model/
│       │       │   └── [SuaEntidade].java
│       │       └── controller/
│       │           └── [SeuController].java
│       └── resources/
│           └── data/
│               └── [dados].json
