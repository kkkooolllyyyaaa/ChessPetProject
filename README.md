# Шахматы
Необходимо реализовать игру в шахматы в ООП стиле:
- Играет два игрока, ходят по очереди
- Игру нужно реализовать с помощью одной консоли,
  сначала свой ход пишет первый игрок, затем второй
- Ход вводится в формате "G1 G3"
- Если данный ход невозможно совершить
  (нет фигуры, данная фигура так не ходит, есть препятствие
  на пути в виде своей или вражеской фигуры),
  то нужно попросить игрока ввести ход заново
- Игра завершается автоматически, когда один из игроков ставит "МАТ"
- В консоль нужно выводить логи о каждом ходе,
  о съеденных фигурах, о поставленном ШАХе
- После каждого хода нужно вывести в консоль текущее состояние доски

Детали реализации:
- Каждая фигура – отдельный класс
- Использовать интерфейсы и абстрактные классы при необходимости
- Использовать lombok
- Пытаться использовать абстракции там, где это нужно. Например, абстракция
  работы с вводом и абстракция работы с выводом.
  Нельзя зависеть от ввода/вывода в консоль,
  он в теории может быть сетевым, но в рамках проекта
  нужно реализовать именно IO с одной консоли
- Можно использовать паттерн "фабричный метод" для созданяи фигур
- Отдельно сделать классы фигур, доски, работы с вводом, работы с выводом, игрока, игры
- Нужно написать тесты с использованием JUnit5
- При написании нужно придерживаться SOLID, DRY, KISS.
  В идеале применить один-два популярных паттерна проектирования
- На реализацию даётся 3 дня