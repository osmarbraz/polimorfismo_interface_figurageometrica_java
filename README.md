# Exemplo de polimorfismo em Java utilizando interface.

## Contextualização

Exemplo de implementação de polimorfismo em Java utilizando interface.
O projeto modela as classes referentes a objetos geométricos Triângulo e Círculo.
Para estes objetos geométricos necessitam de algumas características como cor e dimensões.
Todas as figuras geométricas devem implementar uma operação para calcular sua área de acordo com a interface CalculoFigura.
Deseja-se conhecer a área total das figuras mantidas no conjunto.
Existe a possibilidade do surgimento de novos tipos de figuras, portanto o conjunto deve ser extensível.
O programa Principal usa objetos da classe Triângulo e Círculo através da interface CalculoFigura.

## Diagrama de classe

![Diagrama de classe](diagramadeclasse.png)

## Arquivo do projeto

O arquivo Modelo.eap é o projeto do sistema utilizando ferramanta CASE Enterprise Arquitect.

## Outros arquivos

- pom.xml - Arquivo de configuração da ferramenta de automação Maven.
- *.bat - Arquivos de lote(Batch) de console para tarefas compilar, executar, documentar, empacotar e limpar o projeto.