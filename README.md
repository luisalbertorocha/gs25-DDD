GS-DDD

#Integrantes:
rm553455 - Beatriz Silva Pinheiro Rocha
rm552746 - Pedro Henrique de Assunção Lima
rm553507  - Luis Alberto Rocha Filho

#O projeto:
Nossasolucao foi pensada para criar um sistema onde ira emitir alertas de chamados de incendio

#rotas da aplicacao:

###chamados:
POST http://localhost:8080/v1/chamados/criar - cria um chamado
ex de body:
{
  "local": "mata alta",
  "severidade": 3
}

GET http://localhost:8080/v1/chamados - lista todos os chamados

###Alerta:

GET http://localhost:8080/v1/aerta - lista todos os alertas

###chamados:
POST http://localhost:8080/v1/chamados/criar - adciona uma pessoa a um local para atender os chamados
ex de body:
{
  "nome": "Carlos Silva",
  "idade": 32,
  "setor": "Zona Norte",
  "disponivel": true
}

GET http://localhost:8080/v1/chamados - lista todas as equipes


#Funcionalidaes/Classe de negocio:

1. Criar e listar Chamados
2. Criar e listar Alertas
3. Criar e listar Equipes
4. Monitoramento de Chamados para gerar alertas as pessoas
5. Monitoramento das equipes para designar as diponiveis aos chamados
