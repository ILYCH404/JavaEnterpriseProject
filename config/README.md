##MealRestController
***
getAll - Получение списка всей еды
    
    curl --request GET 'http://localhost:8080/topjava/rest/profile/meals'
GET http://localhost:8080/topjava/rest/profile/meals
***
getMeal - Получение блюда по id

    curl --request GET 'http://localhost:8080/topjava/rest/profile/meals/100003'
GET http://localhost:8080/topjava/rest/profile/meals/100003
***
delete - удаление блюда

    curl --request DELETE 'http://localhost:8080/topjava/rest/profile/meals/100003'
DEL http://localhost:8080/topjava/rest/profile/meals/100003
***
update - Редактирование еды

    curl --request PUT 'http://localhost:8080/topjava/rest/profile/meals/100004'
PUT http://localhost:8080/topjava/rest/profile/meals/100004
***
createWithLocation - Создание новой еды

    curl --request POST 'http://localhost:8080/topjava/rest/profile/meals/'
POST http://localhost:8080/topjava/rest/profile/meals/
***
filter - Получение еды с фильтрацией по времени

    curl --request GET 'http://localhost:8080/topjava/rest/profile/meals/filter?startDate=2020-01-30&endDate=2020-01-30&startTime=12%3A00&endTime=18%3A00' `
--data-raw ''
GET http://localhost:8080/topjava/rest/profile/meals/filter?startDate=2020-01-30&endDate=2020-01-30&startTime=12%3A00&endTime=18%3A00

