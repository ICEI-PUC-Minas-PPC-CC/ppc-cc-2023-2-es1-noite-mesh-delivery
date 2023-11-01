### 2. Descrição Geral

### 2.1 Requisitos funcionais

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

### 2.2 Requisitos não funcionais

|Código|Descrição|Classificação|
|------|---------|--------------|
|RNF1|Segurança: O aplicativo deve garantir a segurança dos dados dos clientes, incluindo informações de pagamento e endereços.|Obrigatório|
|RNF2|Desempenho: O aplicativo deve ser responsivo e garantir tempos de resposta rápidos, tanto para a realização de pedidos quanto para a atualização do status dos pedidos.|Obrigatório|
|RNF3|Escalabilidade: O sistema deve ser escalável para lidar com um aumento no número de pedidos e usuários à medida que o aplicativo cresce em popularidade.|Obrigatório|
|RNF4|Confiabilidade: O aplicativo deve ser confiável, minimizando falhas e interrupções nos serviços de entrega.|Obrigatório|
|RNF5|Compatibilidade: O aplicativo deve ser compatível com dispositivos móveis (iOS e Android) e navegadores da web.|Obrigatório|

### 2.3 Regras de negócio

|Código|Descrição|Classificação|
|------|---------|--------------|
|RN1|Exclusividade de Alimentos e Bebidas: O aplicativo Mesh Delivery oferecerá exclusivamente delivery de alimentos e bebidas.|Obrigatório|
|RN2|Pagamento a Estabelecimentos: Os estabelecimentos cadastrados receberão o pagamento pelas vendas realizadas através do aplicativo após a conclusão bem-sucedida da entrega.|Obrigatório|
|RN3|Taxas de Entrega: Os clientes podem estar sujeitos a taxas de entrega, que serão determinadas com base na distância entre o estabelecimento e o endereço de entrega.|Obrigatório|
|RN4|Restrição de Área de Atuação: A atribuição de entregadores com base na proximidade está restrita a uma área geográfica predefinida para garantir entregas eficientes.|Obrigatório|

### 2.4 Casos de uso

#### [CDU1] - Entrega de Produtos por Entregadores

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de entrega de produtos por parte dos entregadores cadastrados no sistema.

2. **Atores**
   - Ator Primário: Entregador
   - Ator Secundário: Cliente

3. **Cenário Principal**
   - O entregador recebe os detalhes do pedido.
   - O entregador se dirige ao endereço de entrega.
   - O entregador entrega os produtos ao cliente.

4. **Cenários Alternativos**
   - Se o cliente não estiver disponível no momento da entrega, o entregador pode seguir um procedimento específico para reagendar a entrega ou notificar o cliente.

5. **Pré-Condições**
   - O entregador está logado no sistema.
   - O pedido está pronto para ser entregue.

6. **Pós-Condições**
   - O pedido é marcado como entregue no sistema.

7. **Requisitos Especiais**
   - O aplicativo deve fornecer informações de contato do cliente para o entregador.

8. **Informações Adicionais**
   - É necessário garantir a segurança e integridade dos produtos durante o processo de entrega.

#### [CDU2] - Cadastro de Endereços pelos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de cadastro de endereços pelos clientes no sistema.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de cadastro de endereços.
   - O cliente insere os detalhes do endereço.
   - O sistema registra o novo endereço associado ao cliente.

4. **Cenários Alternativos**
   - Se houver falha no processo de cadastro, o sistema notifica o cliente e oferece a opção de tentar novamente.

5. **Pré-Condições**
   - O cliente está autenticado no sistema.

6. **Pós-Condições**
   - O endereço é registrado no perfil do cliente.

7. **Requisitos Especiais**
   - Assegurar que os endereços sejam válidos e consistentes.

8. **Informações Adicionais**
   - O cliente pode cadastrar múltiplos endereços.

#### [CDU3] - Cadastro de Formas de Pagamento pelos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de cadastro de formas de pagamento pelos clientes no sistema.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de cadastro de formas de pagamento.
   - O cliente insere os detalhes da forma de pagamento.
   - O sistema registra a nova forma de pagamento associada ao cliente.

4. **Cenários Alternativos**
   - Se houver falha no processo de cadastro, o sistema notifica o cliente e oferece a opção de tentar novamente.

5. **Pré-Condições**
   - O cliente está autenticado no sistema.

6. **Pós-Condições**
   - A forma de pagamento é registrada no perfil do cliente.

7. **Requisitos Especiais**
   - Assegurar que os dados da forma de pagamento sejam seguros.

8. **Informações Adicionais**
   - O cliente pode cadastrar múltiplas formas de pagamento.


#### [CDU4] - Seguir Estabelecimentos pelos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de seguir estabelecimentos pelos clientes para acompanhar promoções e lançamentos de novos produtos.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de seguir estabelecimentos.
   - O cliente seleciona o estabelecimento desejado para seguir.

4. **Cenários Alternativos**
   - O cliente pode optar por deixar de seguir um estabelecimento a qualquer momento.

5. **Pré-Condições**
   - O cliente está autenticado no sistema.

6. **Pós-Condições**
   - O estabelecimento é adicionado à lista de estabelecimentos seguidos pelo cliente.

7. **Requisitos Especiais**
   - Garantir que as ações de seguir e deixar de seguir sejam intuitivas para o cliente.

8. **Informações Adicionais**
   - Os clientes receberão notificações sobre promoções e lançamentos dos estabelecimentos que estão seguindo.

#### [CDU5] - Informar Situação dos Pedidos aos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de informar aos clientes a situação dos seus pedidos.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O sistema atualiza o status do pedido.
   - O cliente acessa a funcionalidade para verificar o status do pedido.

4. **Cenários Alternativos**
   - O sistema pode enviar notificações ao cliente sobre mudanças no status do pedido.

5. **Pré-Condições**
   - O cliente realizou um pedido.

6. **Pós-Condições**
   - O cliente é informado sobre o status atual do pedido.

7. **Requisitos Especiais**
   - Garantir que as informações de status sejam precisas e atualizadas em tempo real.

8. **Informações Adicionais**
   - Os status podem incluir "Em processamento", "A caminho", "Entregue", etc.

#### [CDU6] - Gerenciamento de Menus e Estoques pelos Estabelecimentos

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de gerenciamento de menus e estoques de produtos pelos estabelecimentos no aplicativo.

2. **Atores**
   - Ator Primário: Estabelecimento

3. **Cenário Principal**
   - O estabelecimento acessa a funcionalidade de gerenciamento de menus e estoques.
   - O estabelecimento atualiza o menu e o estoque de produtos.

4. **Cenários Alternativos**
   - O estabelecimento pode adicionar, remover ou modificar produtos no menu.

5. **Pré-Condições**
   - O estabelecimento está autenticado no sistema.

6. **Pós-Condições**
   - As alterações no menu e estoque são refletidas no aplicativo.

7. **Requisitos Especiais**
   - Garantir que as operações de gerenciamento sejam intuitivas para o estabelecimento.

8. **Informações Adicionais**
   - Os estabelecimentos podem atualizar os menus de acordo com a disponibilidade dos produtos.

#### [CDU7] - Acesso a Informações de Pedidos pelos Entregadores

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de acesso dos entregadores a informações detalhadas sobre os pedidos atribuídos a eles.

2. **Atores**
   - Ator Primário: Entregador

3. **Cenário Principal**
   - O entregador acessa a funcionalidade de visualização de pedidos atribuídos.
   - O entregador seleciona um pedido para visualizar detalhes.

4. **Cenários Alternativos**
   - O entregador pode contatar o cliente, se necessário, com informações de contato fornecidas.

5. **Pré-Condições**
   - O entregador está autenticado no sistema.

6. **Pós-Condições**
   - O entregador tem acesso às informações detalhadas do pedido.

7. **Requisitos Especiais**
   - Garantir que as informações dos pedidos sejam precisas e estejam disponíveis em tempo real.

8. **Informações Adicionais**
   - As informações do pedido podem incluir endereço de entrega, itens do pedido e informações de contato do cliente.

#### [CD8] - Suporte à Geolocalização para Entregadores

1. **Descrição Resumida**
   - Este caso de uso descreve o suporte à geolocalização para ajudar os entregadores a navegar até o endereço de entrega de forma eficiente.

2. **Atores**
   - Ator Primário: Entregador

3. **Cenário Principal**
   - O entregador acessa a funcionalidade de geolocalização.
   - O sistema exibe a rota até o endereço de entrega.

4. **Cenários Alternativos**
   - O sistema pode oferecer opções de rotas alternativas.

5. **Pré-Condições**
   - O entregador está autenticado no sistema.

6. **Pós-Condições**
   - O entregador tem acesso às informações de navegação.

7. **Requisitos Especiais**
   - Garantir que a geolocalização seja precisa e atualizada em tempo real.

8. **Informações Adicionais**
   - A geolocalização ajuda a otimizar o tempo de entrega.

#### [CDU9] - Rastreamento em Tempo Real para Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de rastreamento em tempo real da localização do entregador para os clientes.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de rastreamento do pedido.
   - O sistema exibe a localização em tempo real do entregador.

4. **Cenários Alternativos**
   - O sistema pode oferecer atualizações periódicas da localização do entregador.

5. **Pré-Condições**
   - O cliente realizou um pedido.

6. **Pós-Condições**
   - O cliente está informado sobre a localização atual do entregador.

7. **Requisitos Especiais**
   - Garantir que a localização seja precisa e atualizada em tempo real.

8. **Informações Adicionais**
   - O rastreamento em tempo real oferece uma experiência melhor para o cliente.

#### [CDU10] - Opções de Pagamento Online para Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de oferecer opções de pagamento online seguras e confiáveis para os clientes.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de seleção de método de pagamento.
   - O cliente seleciona a forma de pagamento desejada.

4. **Cenários Alternativos**
   - O sistema pode oferecer opções de parcelamento, se disponíveis.

5. **Pré-Condições**
   - O cliente está autenticado no sistema.

6. **Pós-Condições**
   - O pagamento é processado de acordo com a escolha do cliente.

7. **Requisitos Especiais**
   - Garantir a segurança e confiabilidade das transações online.

8. **Informações Adicionais**
   - As opções de pagamento podem incluir cartões de crédito, carteiras digitais, entre outras.

#### [CDU11] - Definir Horários e Capacidade Máxima pelos Estabelecimentos

1. **Descrição Resumida**
   Este caso de uso descreve o processo de permitir que os estabelecimentos definam horários de funcionamento e capacidade máxima para evitar aceitar pedidos fora de seus limites.

2. **Atores**
   - Ator Primário: Estabelecimento

3. **Cenário Principal**
   - O estabelecimento acessa a funcionalidade de configuração de horários e capacidade máxima.
   - O estabelecimento define os horários de funcionamento e a capacidade máxima de produção.

4. **Cenários Alternativos**
   - O estabelecimento pode alterar os horários e a capacidade máxima a qualquer momento.

5. **Pré-Condições**
   - O estabelecimento está autenticado no sistema.

6. **Pós-Condições**
   - Os horários e a capacidade máxima são atualizados no sistema.

7. **Requisitos Especiais**
   - Garantir que os horários e a capacidade máxima sejam respeitados para evitar sobrecarga.

8. **Informações Adicionais**
   - O controle de horários e capacidade ajuda a otimizar o processo de produção.

#### [CDU12] - Visualização de Histórico de Pedidos pelos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de permitir que os clientes visualizem o histórico de pedidos anteriores no sistema.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de histórico de pedidos.
   - O sistema exibe a lista de pedidos anteriores do cliente.

4. **Cenários Alternativos**
   - O cliente pode acessar detalhes de um pedido específico para obter mais informações.

5. **Pré-Condições**
   - O cliente está autenticado no sistema.

6. **Pós-Condições**
   - O cliente tem acesso ao histórico de pedidos.

7. **Requisitos Especiais**
   - Garantir que as informações do histórico de pedidos sejam precisas e atualizadas.

8. **Informações Adicionais**
   - O histórico de pedidos permite aos clientes rever suas compras passadas.

#### [CDU13] - Avaliação e Classificação de Entregadores pelos Clientes

1. **Descrição Resumida**
   - Este caso de uso descreve o processo de permitir que os clientes avaliem e classifiquem a experiência de entrega proporcionada pelos entregadores.

2. **Atores**
   - Ator Primário: Cliente

3. **Cenário Principal**
   - O cliente acessa a funcionalidade de avaliação e classificação dos entregadores.
   - O cliente seleciona o entregador e atribui uma avaliação e/ou classificação.

4. **Cenários Alternativos**
   - O cliente pode fornecer comentários adicionais sobre a experiência de entrega.

5. **Pré-Condições**
   - O cliente realizou um pedido.

6. **Pós-Condições**
   - A avaliação e a classificação são registradas no sistema.

7. **Requisitos Especiais**
   - Garantir que as avaliações e classificações sejam úteis para aprimorar a qualidade da entrega.

8. **Informações Adicionais**
   - As avaliações podem ser utilizadas para premiar ou reconhecer o bom desempenho dos entregadores.

### 2.5 Operações nos Casos de Uso
   @Gabriel
   - Avaliacao
   - Cliente
   - Entregador
   - Endereco
   - Estabelecimento
   - FormaDePagamento
   - HorarioDeFuncionamento
   - Pedido
   - Produto
