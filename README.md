# E-Commerce - Microservices

Exemplo de Micro-serviços com SpringCloud para a disciplina de Arquitetura de software na Unifacisa - PB

## Definições, Acrônimos e Abreviações

### Eureka Server

#### É um serviço REST (Representational State Transfer) que é utilizado para localizar serviços com o objetivo de balanceamento de carga e failover de servidores.

#### Exemplo

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Eureka.png">
</p>

### Config Server

#### É um micro-serviço onde os outros micro-serviços da arquitetura consultam as propriedades da própria aplicação.

#### Exemplo

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Config%20Server.png">
</p>

* Lê as configurações do github dos projetos abaixo:

  - http://localhost:8888/my-eureka/
  - http://localhost:8888/account/
  - http://localhost:8888/inventory/
  - http://localhost:8888/order/
  - http://localhost:8888/recommendation/
  - http://localhost:8888/shipping/
  - http://localhost:8888/my-zuul/

### Zuul

#### É uma Gateway que fornece recursos para roteamento dinâmico, monitoramento, resiliência, segurança e muito mais.

#### Exemplo sem Zuul

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/SemZuul.png">
</p>

#### Exemplo com Zuul

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/ComZuul.png">
</p>