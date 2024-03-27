Aluno:Marcos Gabriel de Sousa Ferreira     TSI-P5

Padrões GRASP:
Expert (Especialista): A responsabilidade de calcular o preço de uma fita é atribuída à classe Fita, que possui as informações necessárias para realizar essa operação. 
Isso segue o princípio de Especialista, pois a classe Fita é especialista nos dados relacionados ao preço da fita.

Alta Coesão: As classes estão bem organizadas e têm responsabilidades bem definidas. Por exemplo, as estratégias de preço 
(NormalPreçoStrategy, LançamentoPreçoStrategy, InfantilPreçoStrategy) têm uma única responsabilidade: calcular o preço de acordo com o tipo de fita. Isso demonstra alta coesão.

Princípios SOLID:
Princípio da Responsabilidade Única (SRP): Cada classe tem uma única responsabilidade e motivo para mudar. 
Por exemplo, a classe Fita é responsável apenas por representar uma fita e calcular seu preço, enquanto as estratégias de preço têm a única responsabilidade de calcular o preço. 
Isso adere ao princípio SRP.

Princípio da Inversão de Dependência (DIP): A classe Fita depende apenas da abstração PreçoStrategy e não das implementações concretas. 
Isso promove baixo acoplamento e alta coesão, seguindo o princípio DIP.
