#Порождающие паттерны
1. Factory Methods <br>
Позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов.
2. Abstract Factory <br>
Определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.

3. Builder <br>
Паттерн предлагающий возможность создавать объектс помощью различных строителей, которые в зависимости от различных условий строят объект по своей логике.
Зачастую используется с классом директором который определеяет основной функционал через методы.

4. Prototype <br>
Прототип представляет собой интерфес для целой группы классов предоставляя простой<br>
метод копирования объектов, без теребований внутреннего устройства

5. Singleton <br>
Единственный класс и объект, нельзя создать более 1 объекта, все взаимодйствие через него
Одиночка предоставляет возможность работать с 1 объектом, это ползено если нужен<br>
единственный объект доступный всем клиентам