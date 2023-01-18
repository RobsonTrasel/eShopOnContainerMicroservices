
# E-Shopping Commerce

Este projeto é um exemplo de como construir um e-commerce usando uma arquitetura baseada em microserviços, escalabilidade, Event-Driven Architecture (EDA), Command-Query Responsibility Segregation (CQRS) e Java com Spring e Spring Boot.

O projeto é dividido em vários microserviços, cada um responsável por uma funcionalidade específica, como gerenciamento de produtos, carrinho de compras, pagamentos, etc. Isso permite escalar o sistema de acordo com a necessidade.

EDA é usada para sincronizar os microserviços e garantir que todos os dados estejam sempre atualizados. Cada microserviço é responsável por uma tarefa específica, como consultar ou modificar dados, o que ajuda a manter a arquitetura limpa e fácil de manter.

Os microserviços são embalados em containers, o que facilita a implantação e o gerenciamento. Java, Spring e Spring Boot são usados para desenvolver os microserviços, oferecendo recursos robustos para criar aplicativos web escaláveis e de alta performance.

O projeto tem como objetivo ser um exemplo e base para desenvolvimento de outros projetos de e-commerce, mas é importante lembrar que antes de usar em um ambiente de produção, é necessário seguir boas práticas de segurança e proteger informações confidenciais.





## Funcionalidades

- Gerenciamento de produtos: um microserviço responsável por gerenciar os produtos disponíveis para venda no e-commerce, incluindo adição, edição e exclusão de produtos.

- Carrinho de compras: um microserviço responsável por gerenciar os itens adicionados ao carrinho de compras pelos usuários, incluindo adição, edição e exclusão de itens.

- Pagamentos: um microserviço responsável por processar pagamentos, incluindo suporte para vários métodos de pagamento, como cartão de crédito, débito, transferência bancária e boleto.

- Autenticação e autorização: um microserviço responsável por gerenciar a autenticação e autorização dos usuários, incluindo registro, login e gerenciamento de permissões.

- Monitoramento e gerenciamento: um microserviço responsável por coletar métricas e fornecer uma interface para gerenciar e monitorar o estado dos microserviços.

- Gerenciamento de pedidos: um microserviço responsável por gerenciar os pedidos, incluindo o processamento, rastreamento e entrega.

- Gerenciamento de estoque: um microserviço responsável por gerenciar o estoque de produtos, incluindo a atualização do estoque quando um produto é adicionado ao carrinho de compras ou um pedido é processado.

- Recomendação de Produtos: um microserviço responsável por fornecer recomendações de produtos baseadas no histórico de compras do usuário e nos dados de comportamento de compras.


## Contribuindo

Contribuições são sempre bem-vindas!

Veja `contribuindo.md` para saber como começar.

Por favor, siga o `código de conduta` desse projeto.


## Feedback

Se você tiver algum feedback, por favor nos deixe saber por meio de robson.trasel@gmail.com


## Licença

[MIT](https://choosealicense.com/licenses/mit/)

