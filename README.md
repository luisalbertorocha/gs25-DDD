# GS-DDD - Sistema de Monitoramento de Incêndios

## Integrantes
- rm553455 – Beatriz Silva Pinheiro Rocha  
- rm552746 – Pedro Henrique de Assunção Lima  
- rm553507 – Luis Alberto Rocha Filho  

---

## Sobre o projeto

O projeto foi desenvolvido para registrar e responder automaticamente a chamados de incêndio. A ideia é permitir que os chamados sejam criados com local e severidade, que alertas sejam gerados a partir disso e que equipes disponíveis sejam atribuídas automaticamente para o atendimento.

---

## Funcionalidades

- Criar e listar chamados
- Gerar e listar alertas
- Cadastrar e listar equipes de atendimento
- Atribuir automaticamente equipes disponíveis aos chamados
- Atualizar status de chamados e disponibilidade das equipes

---

## Rotas da API

### Chamados

- **Criar chamado**  
  `POST /v1/chamados/criar`  
  Exemplo de body:
  ```json
  {
    "local": "Mata Alta",
    "severidade": 3
  }
  ```

- **Listar chamados**  
  `GET /v1/chamados`

### Alertas

- **Listar alertas**  
  `GET /v1/alerta`

### Equipes

- **Cadastrar equipe**  
  `POST /v1/equipe/criar`  
  Exemplo de body:
  ```json
  {
    "nome": "Carlos Silva",
    "idade": 32,
    "setor": "Zona Norte",
    "disponivel": true
  }
  ```

- **Listar equipes**  
  `GET /v1/equipe`

---

## Como rodar o projeto

### Requisitos
- Java 17+
- IntelliJ IDEA (ou outra IDE com suporte a Spring Boot)
- Maven (se o projeto usar)
- PostgreSQL (caso esteja usando banco de dados)

### Passo a passo

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. Abra o projeto no IntelliJ IDEA.

3. Rode a aplicação:
   - Vá até a classe principal (com `@SpringBootApplication`)
   - Clique em “Run” ou use `Shift + F10`

4. Acesse o sistema em:
   ```
   http://localhost:8080
   ```

---

## Dica para entrega do projeto (zip)

Se for enviar ou entregar o projeto:

```
Projeto.zip
├── src/
├── out/               (se quiser incluir o .jar gerado)
├── pom.xml            (ou build.gradle)
├── README.md
└── .gitignore         (se quiser ignorar /target, /.idea etc.)
```