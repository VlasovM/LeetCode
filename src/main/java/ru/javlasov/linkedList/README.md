# Linked List / Связные списки

## Русский

### Что такое связный список?
**Связный список** — это структура данных, состоящая из узлов (`ListNode`), каждый из которых содержит значение (`val`) и ссылку на следующий узел (`next`). В некоторых реализациях есть также ссылка на предыдущий узел (двусвязный список). В Java встроенный `LinkedList` является двусвязным, но в задачах LeetCode часто используется односвязный `ListNode` с полями `val` и `next`.

### Основные паттерны для связных списков
1. **Итеративный обход** – проход по всем узлам с помощью цикла `while (head != null) { ... head = head.next; }`.
2. **Два указателя (Fast & Slow)** – один бежит быстрее (например, на 2 шага), другой медленнее. Используется для:
   - Поиска середины списка.
   - Обнаружения цикла (алгоритм Флойда).
   - Поиска узла с конца (например, удаление N-го с конца).
3. **Слияние (Merge)** – объединение двух отсортированных списков с использованием фиктивного узла (`dummy`).
4. **Разворот (Reverse)** – изменение ссылок между узлами для обращения порядка (можно итеративно или рекурсивно).
5. **Арифметические операции** – сложение чисел, представленных списками в обратном порядке (поразрядное сложение с переносом).
6. **Рекурсия** – многие задачи на списки можно решать рекурсивно (например, разворот, слияние), но это требует O(n) памяти из-за стека вызовов.

### Сложность операций для односвязного списка
- Доступ по индексу – O(n) (нет произвольного доступа).
- Поиск элемента – O(n).
- Вставка в начало – O(1) (если есть ссылка на голову).
- Вставка после известного узла – O(1).
- Удаление узла (если известен предыдущий) – O(1).
- Обход всех элементов – O(n).

### Советы
- Всегда проверяйте, что список не пустой (`head != null`), перед обращением к `head.val` или `head.next`.
- Для слияния или построения нового списка используйте фиктивный узел `dummy`, чтобы упростить обработку головы.
- При обходе с двумя указателями внимательно проверяйте условия выхода (например, `fast != null && fast.next != null`).
- Для обнаружения цикла используйте алгоритм Флойда (черепаха и заяц).
- При работе с рекурсией помните о возможном переполнении стека для длинных списков.

---

## English

### What is a linked list?
A **linked list** is a data structure made of nodes (`ListNode`), each containing a value (`val`) and a reference to the next node (`next`). Some implementations also have a reference to the previous node (doubly linked list). In Java, the built-in `LinkedList` is doubly-linked, but LeetCode problems often use a custom singly-linked `ListNode` with `val` and `next`.

### Common patterns for linked lists
1. **Iterative traversal** – traverse nodes using `while (head != null) { ... head = head.next; }`.
2. **Two pointers (Fast & Slow)** – one moves faster (e.g., 2 steps) than the other. Used for:
   - Finding the middle of the list.
   - Cycle detection (Floyd's algorithm).
   - Finding the nth node from the end.
3. **Merging** – merging two sorted lists using a dummy node.
4. **Reversing** – reversing links between nodes (iteratively or recursively).
5. **Arithmetic operations** – adding numbers represented as lists in reverse order (digit-by-digit with carry).
6. **Recursion** – many list problems can be solved recursively (e.g., reverse, merge), but this uses O(n) stack space.

### Complexity for singly linked list
- Access by index – O(n) (no random access).
- Search for an element – O(n).
- Insertion at head – O(1) (if you have a reference to head).
- Insertion after a known node – O(1).
- Deletion of a node (if previous is known) – O(1).
- Traversing all elements – O(n).

### Tips
- Always check that the list is not empty (`head != null`) before accessing `head.val` or `head.next`.
- For merging or building new lists, use a `dummy` node to simplify head handling.
- When using two pointers, carefully check loop conditions (e.g., `fast != null && fast.next != null`).
- For cycle detection, use Floyd's algorithm (tortoise and hare).
- Be mindful of recursion stack overflow for very long lists.