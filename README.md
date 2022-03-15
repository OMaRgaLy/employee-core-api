Данный репозиторий по ДЗ

- Создать Spring Boot проект для управления сотрудниками (employee-core-api)
Проект employee-core-api - сервис для управления сотрудниками (добавить, обновить, удалить, получить). 
Перейти на официальный сайт https://start.spring.io/ для генерации проекта 
Заполнить поля и добавить зависимости:
Spring Web,
Validation,
Lombok (optional). 
Скачать сгенерированный проект.
Открыть проект с помощью IDE IntelliJ Idea. 

- Реализовать логику веб-сервиса для проекта employee-core-api 
- Контроллер employeeController 
Отправить посылку Метод POST /post 
Получить список всех посылок Метод GET /post/all 
Просмотреть статус посылки по ID Метод GET /post/{postId} 
Изменить данные о посылке по ID Метод PUT /post/{postId} 
Удалить данные о посылке по ID Метод DELETE /post/{userId} 
- Модель employeeModel 
String employeeId - ID сотрудника - поле обязательное к заполнению (@NotNull) 
String name - имя - поле обязательное к заполнению (@NotNull) 
String surname - фамилия - поле обязательное к заполнению (@NotNull) 
String company - компания
String position - должность
String email - почта (проверка на формат почты)
double salary - зарплата
- Реализовать RESTful методы для проекта employee-core-api сервиса employeeService и его имплементации employeeServiceImpl: 
Метод createEmployee() для создания сотрудника (добавление нового сотрудника)
Метод getEmployessAll() для вывода списка всех сотрудников
Метод getEmployeeById() для вывода данных о сотруднике по ID
Метод updateEmployeeById() для обновления данных о сотруднике по ID
Метод deleteEmployeeById() для удаления сотрудника по ID
