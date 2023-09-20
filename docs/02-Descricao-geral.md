### 2. Descrição Geral

#### 2.1 Requisitos funcionais

|Código|Descrição|Classificação|
|------|---------|--------------|
|RF0   |O aplicativo deve possuir funcionalidades de promoções.   |Obrigatório  |
|RF1   |A entrega dos produtos deve ser feita por entregadores cadastrados no sistema e são atribuídas aos entregadores de acordo com a proximidade deles ao estabelecimento que está vendendo o produto.|Obrigatório  |
|RF2   |Clientes podem cadastrar vários endereços.   |Obrigatório  |
|RF3   |Clientes podem cadastrar várias formas de pagamento.   |Obrigatório  |
|RF4   |Clientes podem seguir estabelecimentos para acompanhar promoções e lançamentos de novos produtos.   |Obrigatório  |
|RF5   |Os clientes devem estar sempre informados sobre a situação dos seus pedidos.   |Obrigatório  |
|RF6   |Os estabelecimentos devem ter a capacidade de gerenciar seus menus e estoques de produtos diretamente no aplicativo.   |Obrigatório  |
|RF7   |Os entregadores devem ter acesso a informações detalhadas sobre os pedidos atribuídos a eles, incluindo o endereço de entrega, itens do pedido e informações de contato do cliente.   |Obrigatório  |
|RF8   |O aplicativo deve oferecer suporte à geolocalização para ajudar os entregadores a navegar até o endereço de entrega de forma eficiente.   |Obrigatório  |
|RF9   |Os clientes devem poder rastrear a localização em tempo real do entregador quando o pedido estiver a caminho.   |Obrigatório  |
|RF10  |O aplicativo deve oferecer opções de pagamento online seguras e confiáveis, incluindo cartões de crédito, carteiras digitais e outros métodos de pagamento eletrônico.   |Obrigatório  |
|RF11  |Os estabelecimentos devem poder definir horários de funcionamento e capacidade de produção máxima para evitar aceitar pedidos fora de seus limites.   |Obrigatório  |
|RF12  |O aplicativo deve permitir que os clientes visualizem o histórico de pedidos anteriores e façam pedidos recorrentes com facilidade.   |Obrigatório  |
|RF13  |Deve existir um sistema de avaliação e classificação para os entregadores, permitindo que os clientes avaliem sua experiência de entrega.   |Obrigatório  |

#### 2.2 Requisitos não funcionais

|Código|Descrição|Classificação|
|------|---------|--------------|
|RNF1|Segurança: O aplicativo deve garantir a segurança dos dados dos clientes, incluindo informações de pagamento e endereços.|Obrigatório|
|RNF2|Desempenho: O aplicativo deve ser responsivo e garantir tempos de resposta rápidos, tanto para a realização de pedidos quanto para a atualização do status dos pedidos.|Obrigatório|
|RNF3|Escalabilidade: O sistema deve ser escalável para lidar com um aumento no número de pedidos e usuários à medida que o aplicativo cresce em popularidade.|Obrigatório|
|RNF4|Confiabilidade: O aplicativo deve ser confiável, minimizando falhas e interrupções nos serviços de entrega.|Obrigatório|
|RNF5|Compatibilidade: O aplicativo deve ser compatível com dispositivos móveis (iOS e Android) e navegadores da web.|Obrigatório|

#### 2.3 Regras de negócio

|Código|Descrição|Classificação|
|------|---------|--------------|
|RN1|Exclusividade de Alimentos e Bebidas: O aplicativo Mesh Delivery oferecerá exclusivamente delivery de alimentos e bebidas.|Obrigatório|
|RN2|Pagamento a Estabelecimentos: Os estabelecimentos cadastrados receberão o pagamento pelas vendas realizadas através do aplicativo após a conclusão bem-sucedida da entrega.|Obrigatório|
|RN3|Taxas de Entrega: Os clientes podem estar sujeitos a taxas de entrega, que serão determinadas com base na distância entre o estabelecimento e o endereço de entrega.|Obrigatório|
|RN4|Restrição de Área de Atuação: A atribuição de entregadores com base na proximidade está restrita a uma área geográfica predefinida para garantir entregas eficientes.|Obrigatório|

#### 2.4 Casos de uso

CDU1 - Realizar pedido
  1. Cliente realiza pedido de um produto
  2. Cliente
  3. Cliente efetua pedido no aplicativo
  4. Quando cliente adiciona produto no carrinho, mas produto fica sem estoque, não será possível concluir o pedido.
  5. Cadastro de loja, cadastro de produto, cadastro de motoboy, cadastro de cliente, cadastar endereço
  6. Acompanhar pedido
