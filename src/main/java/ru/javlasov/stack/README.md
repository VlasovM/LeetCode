# Stack / Стек

## Русский

### Что такое стек?
**Стек** — это структура данных, работающая по принципу **LIFO** (Last In, First Out — последним пришёл, первым ушёл). Представьте стопку тарелок: вы кладёте новую сверху и берёте тоже сверху. В Java стандартная реализация стека — `ArrayDeque` (рекомендуется) или устаревший `Stack`. Основные операции:

- `push(element)` – добавить элемент на вершину.
- `pop()` – удалить и вернуть элемент с вершины.
- `peek()` – вернуть элемент с вершины без удаления.
- `isEmpty()` – проверить, пуст ли стек.

Все операции выполняются за **O(1)**.

### Когда использовать стек?
- **Скобки и синтаксический разбор** – проверка правильности вложенности (`Valid Parentheses`).
- **Обратная польская нотация (RPN)** – вычисление выражений с операторами после операндов (`Evaluate Reverse Polish Notation`).
- **Отмена операций (Undo/Redo)** – хранение истории изменений.
- **Обход деревьев/графов** – DFS (Depth-First Search), хотя там часто используют рекурсию.
- **Обработка путей** – упрощение путей в файловой системе (`Simplify Path`).
- **Отслеживание минимумов** – хранение текущего минимума вместе со значениями (`Min Stack`).
- **Вычисление арифметических выражений** – со скобками и приоритетами (`Basic Calculator`).


# Stack

## What is a stack?
A **stack** is a data structure that follows the **LIFO** (Last In, First Out) principle. Think of a stack of plates: you put a new one on top and take it from the top. In Java, the recommended implementation is `ArrayDeque` (or the legacy `Stack` class). Main operations:

- `push(element)` – add an element to the top.
- `pop()` – remove and return the top element.
- `peek()` – return the top element without removing it.
- `isEmpty()` – check if the stack is empty.

All operations are **O(1)**.

## When to use a stack?
- **Parentheses and parsing** – checking nested structures (`Valid Parentheses`).
- **Reverse Polish Notation (RPN)** – evaluating expressions where operators follow operands (`Evaluate Reverse Polish Notation`).
- **Undo/Redo** – storing history of changes.
- **Tree/Graph traversal** – DFS (Depth-First Search) can be implemented with an explicit stack.
- **Path handling** – simplifying filesystem paths (`Simplify Path`).
- **Tracking minimums** – storing current minimum alongside values (`Min Stack`).
- **Evaluating arithmetic expressions** – with parentheses and precedence (`Basic Calculator`).