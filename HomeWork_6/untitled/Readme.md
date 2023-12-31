## Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
### a. Рассчитывает среднее значение каждого списка.
### b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.

#### Важно:
Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют правильность 
работы программы. Тесты должны учитывать различные сценарии использования вашего приложения.
Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.

#### *Формат и требования к сдаче: *
Отчет о выполнении этого задания должен включать в себя следующие элементы:
- Код программы
- Код тестов
- Отчет pylint/Checkstyle
- Отчет о покрытии тестами
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно эти сценарии.

### Решение:

В качестве ЯП был выбран Java. Приложение напсиано в соотвествии с принципами ООП.

Для написания тестов применены библиотек JUnit и Mokito. Над каждым тестом приведена 
аннотация, в которой описано: метод теста и метод, который он проверяет. Применял unit и mock-тесты для
проверки методов классов MyList и Controller. Для тестирования взаимодействия контроллера
и модели применял Mockito, для создания mock-объектов. Списки заполнены с помощью метода Random.

### Покрытие тестами:

Статистика указана в файле CoverageTest.jpg в корне проекта.

