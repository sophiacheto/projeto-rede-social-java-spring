# Rede Social com Java Spring
Resolução do projeto final do curso Java Backend Santander, com a criação de um projeto Java simulando uma rede social com banco de dados.

### Diagramação de Classes

``` mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Update[] updates
    -Post[] posts
  }

  class Account {
    -String username
    -String bio
  }

  class Update {
    -String icon
    -String description
  }

  class Post {
    -String photo
    -String caption
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Update
  User "1" *-- "N" Post

```
