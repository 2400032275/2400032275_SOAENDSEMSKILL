# Contract-First Addition Microservice

A Spring Boot REST API project designed to import and run in Spring Tool Suite (STS).

## API contract
The OpenAPI YAML contract is located at:

`src/main/resources/contracts/add-api.yaml`

It defines:
- GET endpoint: `/ms/add`
- Required query parameters: `num1`, `num2`
- Successful JSON response: `num1`, `num2`, and `result`
- HTTP 400 response for missing or invalid parameters

## Run in Spring Tool Suite (STS)

1. Extract `ContractFirstAddService.zip` to a folder.
2. Open Spring Tool Suite.
3. Select **File > Import**.
4. Select **Maven > Existing Maven Projects** and click **Next**.
5. Browse to the extracted `ContractFirstAddService` folder.
6. Ensure `pom.xml` is selected and click **Finish**.
7. Wait for Maven dependencies to download.
8. Open `AddServiceApplication.java`.
9. Right-click the file and select **Run As > Spring Boot App**.

## Test the API

Open a browser or Postman and send:

`GET http://localhost:8080/ms/add?num1=10&num2=20`

Expected JSON response:

```json
{
  "num1": 10,
  "num2": 20,
  "result": 30
}
```

Try another request:

`GET http://localhost:8080/ms/add?num1=5&num2=7`

Expected result is `12`.

## Project structure

```text
ContractFirstAddService
├── pom.xml
├── README.md
└── src
    └── main
        ├── java
        │   └── com/example/addservice
        │       ├── AddServiceApplication.java
        │       ├── controller/MathController.java
        │       ├── dto/AddResponse.java
        │       └── service/MathService.java
        └── resources
            ├── application.properties
            └── contracts/add-api.yaml
```

**Note:** The YAML file documents the API contract. The Spring Boot controller implements the endpoint; the application does not automatically generate Java code from the YAML.
