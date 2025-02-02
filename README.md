# GraphQL Spring Boot Book API

This project demonstrates a GraphQL API built with Spring Boot for managing a book catalog. It includes features like querying books by ID, filtering books by various criteria, and uses PostgreSQL for data persistence.

## 🛠 Tech Stack

- Java 17
- Spring Boot 3.x
- GraphQL
- PostgreSQL
- Docker
- TestContainers
- JUnit 5

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Docker
- Maven

### Running the Application

1. Start the PostgreSQL database using Docker:
```bash
docker compose up -d
```

2. Run the Spring Boot application:
```bash
./mvnw spring-boot:run
```

3. Access GraphiQL interface at: http://localhost:8080/graphiql

## 📚 API Examples

### Query All Books

```graphql
query {
    books {
        id
        title
        author
        publishedYear
    }
}
```

### Query Book by ID

```graphql
query {
    book(id: "1") {
        id
        title
        author
        publishedYear
    }
}
```

### Filter Books by Criteria

You can filter books using various criteria:

```graphql
query {
    books(book: {
        title: "Spring in Action"
        author: "Craig Walls"
        publishedYear: 2022
    }) {
        id
        title
        author
        publishedYear
    }
}
```

## 🏗 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/a1st/graphqlspringboot/
│   │       ├── book/
│   │       │   ├── Book.java
│   │       │   └── BookRepository.java
│   │       └── utils/
│   │           └── DataLoader.java
│   └── resources/
│       └── graphql/
│           └── schema.graphqls
```

## 🧪 Testing

The project includes comprehensive integration tests using TestContainers. Run tests with:

```bash
./mvnw test
```

Example test cases include:
- Finding all books
- Finding book by ID
- Filtering books by various criteria
- Handling non-existent books

## 📝 Schema Definition

The GraphQL schema defines the following types:

```graphql
type Book {
    id: ID!
    title: String!
    author: String!
    publishedYear: Int!
}

input BookInput {
    title: String
    author: String
    publishedYear: Int
}

type Query {
    books(book: BookInput): [Book]!
    book(id: ID!): Book
}
```

## 🔧 Configuration

The application uses the following configuration in `application.properties`:

```properties
spring.graphql.graphiql.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

## 🐳 Docker Configuration

PostgreSQL database configuration in `compose.yaml`:

```yaml
services:
  postgres:
    image: 'postgres:latest'
    environment:
      - 'POSTGRES_DB=graphql_db'
      - 'POSTGRES_PASSWORD=root'
      - 'POSTGRES_USER=postgres'
    ports:
      - '5432:5432'
```

## 👤 Author

- Abderrahman Youabd (A1ST)