# AT_FERNANDO_SPRINT2


1. **O que é SOA? Qual o objetivo dessa arquitetura?**

SOA é o acrônimo de Service-Oriented Architecture (em português: Arquitetura Orientada a Serviços) é um padrão de projeto de software, ou padrão de arquitetura de software de baixo acoplamento, onde as funcionalidades implementadas nas aplicações devem ser disponibilizadas na forma de serviços, acessíveis normalmente via web services, é baseada nos princípios da computação distribuída, que utiliza o paradigma request/reply para estabelecer a comunicação entre os sistemas clientes e os sistemas dos serviços.

SOA tem como objetivo permitir que usuários agrupam funcionalidades de forma a obter aplicações dedicadas que serão construídas quase inteiramente a partir de serviços de software pré-existentes. Quanto maior o agrupamento, menor a quantidade de interface necessária para implementar qualquer conjunto de funcionalidade; no entanto, agrupamentos muito grandes são mais difíceis de reutilizar. Cada interface tem uma quantidade de processamento, portanto há que se considerar a performance e a granularidade dos serviços. A grande promessa de SOA sugere que a criação da n-ésima aplicação é baixa, pois todos os serviços necessários para satisfazer aos requisitos da aplicação já existem. No mundo ideal, bastaria coordenar os serviços para produzir uma nova aplicação.

1. **O que são microsserviços? Quando microsserviços são uma boa opção? Quando não são?**

A arquitetura de microsserviço - uma variante do estilo estrutural da arquitetura orientada a serviços - organiza um aplicativo como uma coleção de serviços vagamente acoplados. Em uma arquitetura de microsserviços, os serviços são refinados e os protocolos são leves.

Com microsserviços, suas equipes e tarefas rotineiras podem se tornar mais eficientes por meio do desenvolvimento distribuído. Além disso, é possível desenvolver vários microsserviços ao mesmo tempo. Isso significa que você pode ter mais desenvolvedores trabalhando simultaneamente na mesma aplicação, o que resulta em menos tempo gasto com desenvolvimento.

Com diversos serviços, a manutenção dos ambientes torna-se mais complexa. É necessário gerenciar as dependências de cada serviço e os instanciar de forma independente.

A utilização de diversas tecnologias no ecossistema, pode resultar em custo maior de infraestrutura, se comparado a uma aplicação monolítica. A utilização de uma máquina para cada serviço pode tornar a operação muito cara. Containers são uma solução viável e bastante utilizada.

A utilização de microsserviços adiciona um grau a mais de dificuldade no gerenciamento de instâncias de aplicações. Enquanto em uma aplicação monolítica lidamos basicamente com uma instância, que é a aplicação completa, com microsserviços, muitas vezes, precisamos gerenciar múltiplas instâncias de diversos serviços. Essa complexidade na utilização, estruturação e gerenciamento de sistemas distribuídos deve ser levada em consideração na escolha da abordagem.

Há a necessidade de definir, implantar e manter uma forma de comunicação entre os serviços. Para isso, são utilizadas normalmente duas estratégias: REST e serviços mensageiros como ActiveMQ e RabbitMQ.

Com múltiplos pontos de falha, principalmente na comunicação entre os serviços, é necessário estar preparado para monitorar e recuperar instâncias, sempre que necessário. Este ponto é crucial para um uso bem sucedido de microsserviços.

O maior custo de entrada também pode ser considerado um ponto contra. É necessário um esforço extra para padronização, gerenciamento e manutenção tanto dos serviços quanto dos times envolvidos. A adaptação dos times a nova realidade de desenvolvimento e pensamento leva algum tempo e isso deve ser considerado.

1. **Por que o método DDD de projeto de software ajuda na elaboração de microsserviços?**

No DDD basicamente, as decisões técnicas estão atreladas à necessidades oriundas do negócio, e não meramente visam &quot;tecnologia por tecnologia&quot; ou &quot;patterns por patterns&quot;, como desenvolvimento voltado a padrões de mercado ou modismos que não estão diretamente relacionados ao problema de negócio.

A arquitetura de Microsserviços é um exemplo de um conceito que pode acabar sendo adotado por ser uma tendência de mercado, sem que o time tenha a devida consciência dos desafios ou mesmo das vantagens que pode trazer à solução.

1. **Quanto a comunicação entre microsserviços:**
  1. _O que é RPC? Cite duas implementações dessa tecnologia? Para cada uma delas defina as vantagens e desvantagens._

**R:**

O Remote Procedure Call (Chamada de Procedimento Remoto) é uma tecnologia de comunicação entre processos que permite a um programa de computador chamar um procedimento em outro espaço de endereçamento.

É uma tecnologia para a criação de programas distribuídos servidor/cliente que provê um paradigma de comunicação de alto nível no sistema operacional, já presumindo a existência de um protocolo de transporte, como TCP/IP ou UDP, para carregar a mensagem entre os programas comunicantes.

Assim, o usuário pode utilizar procedimentos remotos como se fossem chamadas locais, sem precisar se preocupar com possíveis diferenças, tal como a arquitetura, da máquina do processo cliente e do servidor.

  1. _O que é REST? O que é RESTful? Por que essa arquitetura é tão popular?_

O termo transferência de estado

representacional - REST (Representational

State Transfer) foi introduzido e definido no

ano de 2000 através de uma tese de Ph.D do

cientista Roy Fielding, um dos principais

autores da especificação do protocolo HTTP

O intuito geral da tese era a formalização

de um conjunto de melhores práticas

denominadas constraints

Essas constraints tinham como objetivo

determinar a forma na qual padrões como HTTP

e URI deveriam ser modelados, aproveitando de

fato todos os recursos oferecidos pelos

mesmos.

Quando estamos discutindo sobre o modelo e

sobre as características que sito

anteriormente, você deve utilizar o termo

REST, já no momento em que você estiver

falando de uma implementação que usa essas

mesmas características, você deve usar

RESTful

REST nada mais é que um conjunto de melhores

práticas denominadas constraints

Ou seja, se temos uma API que não segue os

princípios REST, teremos apenas uma API HTTP

A utilização de Rest API é importante para adicionar diversas funcionalidades ao site. Suas características permitem a integração com diferentes aplicações; entre elas, as redes sociais e os sistemas de pagamento.

por isso é tão popular

  1. _O que é um Message Broker?_

_Um intermediário de mensagens é um módulo intermediário de programa de computador que converte uma mensagem do protocolo formal de mensagens do remetente para o protocolo formal de mensagens do destinatário._

_São agentes intermediários, geralmente chamados de middleware, que ficam entre os processos para gerenciar a comunicação entre eles._

_Implementa comunicação assíncrona entre microsserviços, pois eles oferecem uma variedade de recursos poderosos_

_Brokers provêem queues (filas), tópicos ou ambos_

_As filas geralmente são ponto a ponto: Um remetente coloca uma mensagem em uma fila e um consumidor lê a partir dessa fila._

_Com um sistema baseado em tópicos, vários consumidores podem se inscrever em um tópico, e cada consumidor inscrito receberá uma cópia dessa mensagem._

    1. _Explique como é a implementação em Filas. RabbitMQ é uma boa tecnologia para essa implementação? Justifique._

Para implementar uma fila, devemos ser capazes de inserir novos elementos em uma extremidade, o fim, e retirar elementos da outra extremidade, o início. Ou seja, sempre inserimos novos elementos no fim da fila e quando removemos um elemento ele é retirado do início da fila.

Permitindo o envio assíncrono de mensagens é um tipo de comunicação entre aplicações que os corretores de mensagens tornam possível. Evita a perda de dados valiosos e permite que os sistemas continuem a funcionar mesmo perante os problemas intermitentes de conectividade ou latência comuns nas redes públicas. O envio assíncrono de mensagens garante que as mensagens serão entregues uma (e apenas uma vez) na ordem correcta em relação a outras mensagens.

Fila funciona como um mecanismo de distribuição de carga

Um consumidor pode representar um ou mais microsserviços - normalmente modelados como um grupo de consumidores

Quando uma mensagem é colocada na fila, apenas um membro do grupo de consumidores recebe essa mensagem.

O RabbitMQ é um software de mensagens com código aberto, que implementou o protocolo &quot;Advanced Message Queuing Protocol&quot;, que foi estendido com uma arquitetura de plug-in para suportar o protocolo &quot;Streaming Text Oriented Messaging Protocol&quot;, o MQTT entre outros protocolos.

Em poucas palavras, RabbitMQ é um software open source de mensageria. Fornece uma forma comunicação assíncrona de dados entre processos, aplicações ou servidores. É um dos brokers de mensagens mais utilizados e implementa o protocolo AMQP — Advanced Message Queueing Protocol.

    1. _Explique como é a implementação usando tópicos. Kafka é uma boa tecnologia para essa implementação? Justifique._
  1. _Disserte sobre a diferença entre comunicação assíncrona e síncrona bloqueante. Qual a vantagem de cada método?_

_Enquanto a comunicação síncrona refere-se ao contato imediato entre o emissor (quem envia a mensagem) e o receptor (quem recebe a mensagem), a comunicação assíncrona é atemporal. Ou seja, na comunicação assíncrona o emissor envia a mensagem, mas não necessariamente o receptor irá recebê-la imediatamente._

_síncrona bloqueante:_

_Um microsserviço faz uma chamada para outro microsserviço e bloqueia a operação que aguarda a resposta._

_É bem familiar porém gera um Acoplamento temporal nas chamadas_

_o que é uma grande desvantagem._

_assíncrona:_

_O microsserviço que emite uma chamada pode continuar o processamento, quer a chamada seja recebida ou não._

_Maior complexidade de implementação e números de opções a serem tratadas,_

_o que é uma grande desvantagem._

  1. Em qual situação a comunicação com o padrão &quot;Common Data&quot; é aconselhada.

Quando deseja permitir a interoperatividade entre sistemas.

  1. Descreva o padrão API Gateway.
 Em uma arquitetura de microsserviços, os aplicativos cliente normalmente precisam consumir a funcionalidade de mais de um microsserviço. Se esse consumo for executado diretamente, o cliente precisará manipular várias chamadas para terminais de microsserviço. O que acontece quando o aplicativo evolui e novos microsserviços são introduzidos ou os microsserviços existentes são atualizados? Se o seu aplicativo tiver muitos microsserviços, lidar com tantos pontos de extremidade dos aplicativos cliente pode ser um pesadelo. Como o aplicativo cliente seria acoplado a esses pontos de extremidade internos, a evolução dos microsserviços no futuro pode causar alto impacto aos aplicativos cliente.

Quando você projeta e cria aplicativos grandes ou complexos baseado em microsserviço com vários aplicativos cliente, uma boa abordagem a considerar pode ser um Gateway de API. Esse padrão é um serviço que fornece um ponto de entrada única para determinados grupos de microserviços. É semelhante ao padrão fachada do design orientado a objeto, mas, nesse caso, faz parte de um sistema distribuído. O padrão de Gateway de API às vezes também é conhecido como BFF (&quot;back-end para front-end&quot;), porque ele é criado pensando nas necessidades do aplicativo cliente.

Portanto, o gateway da API fica entre os aplicativos cliente e os microsserviços. Ele atua como um proxy reverso, encaminhando as solicitações de clientes para serviços. Ele também pode fornecer outros recursos de corte cruzado, como autenticação, terminação de SSL e cache.

1. **O que é OpenAPI?**

A OpenAPI Specification, originalmente conhecida como Swagger Specification, é uma especificação para arquivos de interface legíveis por máquina para descrever, produzir, consumir e visualizar serviços da Web RESTful.

1. No TP3 desenvolvemos um projeto de um gerenciador de atividades acadêmicas para alunos de um colégio. O sistema permite que o professor crie atividades que serão executadas pelos alunos.
  1. Escreva o contrato dos serviços de processamento de pedidos (indique: o VERBO, A URI/Template, o Uso, os argumentos esperados, a saída esperada).
  2. Desenhe os diagramas de domínio da solução projetada.
  3. Demonstre através de printscreens os serviços funcionando.

2. Nesse _assessment_, iremos implementar outros microsserviços com as seguintes funcionalidades:
  1. Ao concluir a atividade, o aluno submeterá a atividade para avaliação. (Não serão modeladas (nem implementadas) questões ou respostas, apenas um serviço que indica que a atividade (identificada por um ID) foi concluída)

  1. O professor atribuirá notas para cada atividade através de um serviço dedicado. O endpoint de correção das atividades irá se comunicar com microsserviço de conclusão de atividade através de um Message Broker. Como resultado, será criado um repositório que armazenará
aluno, id\_atividade, disciplina, nota

  2. Demonstre através de printscreens os microsserviços funcionando. Deixe o código fonte disponível (sugestão github.com e indique o endereço)
