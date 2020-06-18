# E-Commerce - Microservices

#### Exemplo de Micro-serviços com SpringCloud para a disciplina de Arquitetura de software na Unifacisa - PB

## Arquitetura do Projeto

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Architecture%20Project.png">
</p>

## Deployment local

```
cd [microservice-path]
mvn clean
mvn spring-boot:run
```

## Definições, Acrônimos e Abreviações

### Arquitetura de Microservices:

<p align=”justify”>
Desenvolver aplicações de software em um conjuntos de serviços: Independente, Implementável e Escalável.
</p>

### Microservice: 

<p align=”justify”>
É uma pequena porção de software que roda de maneira independente, focada em um único e pequeno conjunto de atividades dentro de um conjunto de serviços muito maior, formando uma arquitetura de micro-serviços.
</p>

### Config Server: 

<p align=”justify”>
É um micro-serviço onde os outros micro-serviços da arquitetura consultam as propriedades da própria aplicação.
</p>

#### Exemplo:

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Config%20Server.png">
</p>

#### * Lê as configurações do github dos projetos abaixo:

  - http://localhost:8888/my-eureka/default  
  - http://localhost:8888/account/default  
  - http://localhost:8888/inventory/default  
  - http://localhost:8888/order/default  
  - http://localhost:8888/recommendation/default  
  - http://localhost:8888/shipping/default  
  - http://localhost:8888/my-zuul/default  

### Service Discovery (Eureka Server):

<p align=”justify”>
É um serviço REST (Representational State Transfer) que é utilizado para localizar serviços com o objetivo de balanceamento de carga e failover de servidores.
</p>

#### Exemplo:

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Eureka.png">
</p>

### Zuul:

<p align=”justify”>
É uma Gateway que fornece recursos para roteamento dinâmico, monitoramento, resiliência, segurança e muito mais.
</p>

#### Exemplo sem Zuul:

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/SemZuul.png">
</p>

#### Exemplo com Zuul:

<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/ComZuul.png">
</p>

#### * Rotas mapeadas na aplicação com o Zuul:

 - http://localhost:9070/accounts/  
 - http://localhost:9070/inventories/  
 - http://localhost:9070/orders/  
 - http://localhost:9070/recommendations/  
 - http://localhost:9070/shipments/  

## Continuous Integration ![HEROKU DEPLOYMENT](https://github.com/mateus-lourenco/e-commerce-microservices/workflows/HEROKU%20DEPLOYMENT/badge.svg)  

<p align=”justify”>
Continuous Integrations é uma metodologia moderna de desenvolvimento, em que os desenvolvedores envolvidos em um projeto integram seus trabalhos continuamente. Cada integração é consolidada por uma ferramenta chamada de automatização de tarefas, que inclusive pode executar diversos testes para identificar erros de digitação de códigos, incompatibilidades entre comandos dados por desenvolvedores diferentes etc.
</p>  
<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Integration.png">
</p>

## Continuous Delivery ![HEROKU DEPLOYMENT](https://github.com/mateus-lourenco/e-commerce-microservices/workflows/HEROKU%20DEPLOYMENT/badge.svg)  
<p align=”justify”>
É garantir que novas modificações estejam disponíveis – validação em ambiente de Homologação ou QA – para serem implementadas no ambiente de produção. O deploy para produção não é automático, porém pode ser realizado a qualquer momento, dependendo do aceite da alteração.
</p>
<p align="center">
<img src="https://github.com/mateus-lourenco/e-commerce-microservices/blob/developer/images/Delivery.png">
</p>

## Como foi feito o Pipeline CI / CD:

1 - Utilizamos o [GitHub Actions](https://github.com/mateus-lourenco/e-commerce-microservices/actions) para implementar um pipeline de Integração Contínua e Entrega Contínua.

2 - Utilizamos o [Heroku](https://www.heroku.com/) para fazer o deploy de todos os serviços da aplicação. (OBS: Neste exemplo, utilizamos 2 contas do Heroku para separar os serviços da aplicação).

3 - De cada uma das contas criadas, extraimos a API KEY e criamos 2 segredos no repositório da aplicação para que a pipeline criada conseguisse se comunicar com as contas no Heroku.

<p align="center">
<img src="">
</p>

4 - Em cada conta, você terá que criar os serviços da aplicação de acordo com os exemplos abaixo:

<p align="center">
<img src="">
</p>

5 - E com essas informações, poderá configurar o arquivo de [Workflow](https://github.com/mateus-lourenco/e-commerce-microservices/blob/master/.github/workflows/CI-CD-Heroku.yml), para depois executar o pipeline.

<p align="center">
<img src="">
</p>

## Referências

- [lelodois/spring-cloud](https://github.com/lelodois/spring-cloud)  
- [Spring Cloud Config](https://medium.com/dev-cave/spring-cloud-config-48e423446ed8#:~:text=Como%20funciona,as%20propriedades%20da%20pr%C3%B3pria%20aplica%C3%A7%C3%A3o.&text=L%C3%B3gico%20que%20n%C3%A3o%20seria%20muito,sem%20depend%C3%AAncias%20da%20m%C3%A1quina%20f%C3%ADsica.)  
- [Arquitetura de MicroServices com Spring Cloud e Spring Boot — Parte 3](https://coderef.com.br/arquitetura-de-microservices-com-spring-cloud-e-spring-boot-parte-3-b84b3dce13a0#:~:text=O%20Eureka%20%C3%A9%20um%20servi%C3%A7o,carga%20e%20failover%20de%20servidores.)  
- [Netflix/zuul](https://github.com/Netflix/zuul)  
- [O que é um micro servico ou microservice?](https://www.luiztools.com.br/post/o-que-e-um-micro-servico-ou-microservice/)  
- [Microservice Architectures With Spring Cloud and Docker](https://dzone.com/articles/microservice-architecture-with-spring-cloud-and-do)  
