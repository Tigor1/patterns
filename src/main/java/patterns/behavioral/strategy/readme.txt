Стратегия (Strategy)
=======================================================================================================================================
Цель:

Взаимозаменяемость семейства классов

=======================================================================================================================================

Для чего используется:

Определение семейства классов, инкапсулирование каждого из них и организация их
взаимодействия.

=======================================================================================================================================
Примеры использования:

- есть несколько родственных классов, которые отличаются поведением;
- необходимо иметь несколько вариантов поведения;
- в классе есть данные, о которых не должен знать клиент;
- с помощью условных операторов в классе определено большое количество возможных поведений;
=======================================================================================================================================

Аналогия из жизни:

Вам нужно добраться до аэропорта. Можно доехать на автобусе, такси или велосипеде. Здесь вид
транспорта является стратегией. Вы выбираете конкретную стратегию в зависимости от контекста
— наличия денег или времени до отлёта.

=======================================================================================================================================

Применимость:


- Когда вам нужно использовать разные вариации какого-то алгоритма внутри одного объекта.
    Стратегия позволяет варьировать поведение объекта во время выполнения программы, подставляя в него различные объекты-поведения (например, отличающиеся балансом скорости и потребления ресурсов).

- Когда у вас есть множество похожих классов, отличающихся только некоторым поведением.
    Стратегия позволяет вынести отличающееся поведение в отдельную иерархию классов, а затем свести первоначальные классы к одному, сделав поведение этого класса настраиваемым.

- Когда вы не хотите обнажать детали реализации алгоритмов для других классов.
    Стратегия позволяет изолировать код, данные и зависимости алгоритмов от других объектов, скрыв эти детали внутри классов-стратегий.

- Когда различные вариации алгоритмов реализованы в виде развесистого условного оператора. Каждая ветка такого оператора представляет собой вариацию алгоритма.
    Стратегия помещает каждую лапу такого оператора в отдельный класс-стратегию. Затем контекст получает определённый объект-стратегию от клиента и делегирует ему работу. Если вдруг понадобится сменить алгоритм, в контекст можно подать другую стратегию.

=======================================================================================================================================

Преимущества:

- Горячая замена алгоритмов на лету.
- Изолирует код и данные алгоритмов от остальных классов.
- Уход от наследования к делегированию.
- Реализует принцип открытости/закрытости.

Недостатки:

-Усложняет программу за счёт дополнительных классов.
-Клиент должен знать, в чём состоит разница между стратегиями, чтобы выбрать подходящую.

=======================================================================================================================================
Отношения с другими паттернами

- Мост, Стратегия и Состояние (а также слегка и Адаптер) имеют схожие структуры классов — все они
  построены на принципе «композиции», то есть делегирования работы другим объектам. Тем не менее,
  они отличаются тем, что решают разные проблемы. Помните, что паттерны — это не только рецепт
  построения кода определённым образом, но и описание проблем, которые привели к данному решению.

- Команда и Стратегия похожи по духу, но отличаются масштабом и применением:
    - Команду используют, чтобы превратить любые разнородные действия в объекты. Параметры операции
      превращаются в поля объекта. Этот объект теперь можно логировать, хранить в истории для отмены,
      передавать во внешние сервисы и так далее.
    - С другой стороны, Стратегия описывает разные способы произвести одно и то же действие, позволяя взаимозаменять эти способы в каком-то объекте контекста.

- Стратегия меняет поведение объекта «изнутри», а Декоратор изменяет его «снаружи».

- Шаблонный метод использует наследование, чтобы расширять части алгоритма. Стратегия использует
  делегирование, чтобы изменять выполняемые алгоритмы на лету. Шаблонный метод работает на уровне
  классов. Стратегия позволяет менять логику отдельных объектов.

- Состояние можно рассматривать как надстройку над Стратегией. Оба паттерна используют композицию,
  чтобы менять поведение основного объекта, делегируя работу вложенным объектам-помощникам. Однако
  в Стратегии эти объекты не знают друг о друге и никак не связаны. В Состоянии сами конкретные
  состояния могут переключать контекст.

=======================================================================================================================================
