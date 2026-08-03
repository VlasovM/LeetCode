# Greedy / Жадные алгоритмы

## Русский

### Что такое жадный алгоритм?
**Жадный алгоритм** — это подход, при котором на каждом шаге принимается **локально оптимальное** решение в надежде, что это приведёт к **глобально оптимальному** результату. Жадные алгоритмы обычно просты в реализации и эффективны, но работают только для задач, где локальный выбор не противоречит глобальному оптимуму (свойство оптимальной подструктуры и жадного выбора).

### Когда использовать?
- Задачи на **оптимизацию** (минимизация или максимизация некоторой величины).
- Можно разбить на подзадачи, где решение каждой подзадачи не зависит от будущих.
- Часто встречается в задачах с **интервалами** (выбор непересекающихся интервалов, минимальное количество точек для покрытия всех интервалов).
- В задачах на **прыжки** (Jump Game) – всегда выбирать максимально дальний прыжок.
- В задачах на **заправки** (Gas Station) – обнулять баланс при отрицательном остатке.
- В задачах на **раздачу конфет** (Candy) – два прохода для удовлетворения условий слева и справа.
- В задачах на **покупку/продажу акций** – суммировать все положительные разницы (II) или отслеживать минимум (I).

### Основные паттерны
1. **Выбор максимума/минимума на каждом шаге** – например, в задачах на прыжки мы расширяем максимальную достижимую позицию.
2. **Два прохода** – для учёта условий с обеих сторон (Candy, Trapping Rain Water).
3. **Сортировка и жадный проход** – как в задаче о стрелах (сортировка по концам).
4. **Сброс счётчика при отрицательном балансе** – Gas Station.

### Когда жадность не работает?
- Если задача требует учёта будущих состояний (например, задача о рюкзаке с дробными предметами — работает, а с целыми — нет).
- Если локальный выбор может привести к тупику.

### Сложность
- Часто O(n) или O(n log n) (если требуется сортировка).
- Память O(1) или O(n) в зависимости от задачи.

---

## English

### What is a greedy algorithm?
A **greedy algorithm** makes the **locally optimal** choice at each step, hoping that these local choices will lead to a **globally optimal** solution. Greedy algorithms are usually simple and efficient, but they only work for problems where the local choice never conflicts with the global optimum (optimal substructure and greedy choice property).

### When to use?
- **Optimization** problems (minimization or maximization of some value).
- The problem can be broken into subproblems where the solution to each subproblem is independent of future choices.
- Often used in **interval** problems (selecting non-overlapping intervals, minimum points to cover intervals).
- **Jump Game** problems – always choose the farthest reachable position.
- **Gas Station** – reset balance when negative.
- **Candy** – two passes to satisfy left and right conditions.
- **Stock trading** – sum all positive differences (II) or track minimum price (I).

### Common patterns
1. **Choosing max/min at each step** – e.g., extending farthest reach in jump problems.
2. **Two passes** – to consider both left and right conditions (Candy, Trapping Rain Water).
3. **Sorting + greedy pass** – like arrow problem (sort by end).
4. **Resetting counter on negative balance** – Gas Station.

### When greedy fails?
- If the problem requires considering future states (e.g., 0/1 knapsack – greedy fails, fractional knapsack works).
- If a local choice can lead to a dead end.

### Complexity
- Often O(n) or O(n log n) (if sorting is required).
- Space O(1) or O(n) depending on the problem.

---