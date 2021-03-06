![received_10212894458459312](https://user-images.githubusercontent.com/22719369/27750514-81258188-5dae-11e7-9252-5d693de16103.jpeg)

**Projeto para utilização em Quadras Esportivas.**  

### Integrantes
* Miguel Novack  
* Roger Rezende
* William Maich

### Introdução
Visando a dificuldade de proprietários de quadras esportivas, com o grande número de clientes, ter um controle de aluguéis e movimentação de caixa, o WebSports é um software que tem como objetivo auxiliar no controle de Quadras Poliesportivas, assim facilitando tanto o proprietário da quadra quanto o usuário, oferecendo comodidade para fazer reservas à distância. O sistema permitirá gerenciar clientes, produtos, quadras e gastos.

### Tecnologias
1. Para auxílio e diminuição do código, utilizamos o [Play! framework](https://www.playframework.com/).
1. Junto ao Play, para autenticação estamos usando [Deadbolt 2](https://github.com/schaloner/deadbolt-2).
1. Para gerenciamento de dependências utilizamos o [Scala - SBT](http://www.scala-sbt.org/).
1. Ferramenta de Mapeamento Objeto-Relacional [Ebean](http://ebean-orm.github.io/).
1. Para Front-end [Sass](http://sass-lang.com/libsass) / [jQuery](https://jquery.com/) / [FullCalendar.js](https://fullcalendar.io/).
1. Para versionamento [GitHub](https://github.com/) e [Git](https://git-scm.com/).

### Instalação para Teste
1. Clone o [projeto](https://github.com/javielrezende/WebSports) <code>git clone https://github.com/javielrezende/WebSports</code>
1. Instalar e declarar nas variáveis do Sistema o [Java 8 JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
1. Baixar o software e instalar o [Scala - SBT](http://www.scala-sbt.org/)
1. Setar nas variáveis de ambiente do Sistema Operacional a pasta bin do Play com o comando no prompt de comando: <code>setx PATH=%PATH%;"C:\Program Files (x86)\sbt\bin"</code>
1. Abra o xampp e rode o mysql e crie o banco de dados com o nome: "websports"
1. Para windows, no prompt de comando, na raíz do projeto digite <code>sbt run</code>
1. No navegador  digite [localhost:9000]()

### Observação

Em caso de erro de UTF-8, verificar se o nome do usuário ou o nome da pasta no qual foi colocado o projeto está com algum caracter especial (acentos, traços e pontos). O sistema não aceita esses caracteres nestes locais, impedindo o funcionamento correto.

### Documentação JavaDoc
[https://mglnb.github.io/websports/](https://mglnb.github.io/websports/)
