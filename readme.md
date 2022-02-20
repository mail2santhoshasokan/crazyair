To Run the project:

1) Run mssql in docker, use the following command:
   docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=Mercedes@e53" -p 1433:1433 --name mssql -d mcr.microsoft.com/mssql/server:2019-latest

To Create DB & Table please use the following commands:
1) Create DB:
   USE master
   GO
   IF NOT EXISTS (
   SELECT [name]
   FROM sys.databases
   WHERE [name] = N'crazyair'
   )
   CREATE DATABASE crazyair
   GO
2) Create Table:   
    CREATE TABLE [dbo].[FlightSchedule]
    (
    [Id] INT NOT NULL PRIMARY KEY, -- Primary Key column
    [airline] NVARCHAR(50) NOT NULL,
    [price] NUMERIC NOT NULL,
    [cabinClass] NVARCHAR(5),
    [departureAirportCode] NVARCHAR(50) NOT NULL,
    [destinationAirportCode] NVARCHAR(50) NOT NULL,
    [departureDate] DATETIME NOT NULL,
    [arrivalDate] DATETIME NOT NULL
    );
    GO
3) Insert Data:
   INSERT INTO [dbo].[FlightSchedule]
   (
   [Id], [airline], [price], [cabinClass], [departureAirportCode], [destinationAirportCode], [departureDate], [arrivalDate]
   )
   VALUES
   (
   1, 'BritishAirways', 350, 'E', 'LHR', 'COK', '2022-02-18 12:00:00.113', '2022-02-19 12:00:00.113'
   )
   GO
To Access Swagger documentation:
   http://localhost:8080/swagger-ui/index.html

To Do:
1) Add more test cases
2) validation in fields
3) Logging and MDC
4) HealthCheck