# Matrix / Матрицы

## Русский

### Что такое матрица в задачах?
**Матрица** — это двумерный массив (массив массивов), где элементы располагаются по строкам и столбцам. Задачи на матрицы часто требуют аккуратной работы с индексами, границами и обходом в разных направлениях. В Java матрица обычно представляется как `int[][]` или `char[][]`.

### Основные паттерны для матриц
1. **Обход по спирали (Spiral Traversal)**
   - Движение по периметру, постепенно сужая границы (`top`, `bottom`, `left`, `right`).
   - Пример: `Spiral Matrix`.

2. **Поворот (Rotation)**
   - Поворот матрицы на 90° по часовой стрелке (или против).
   - Часто решается за два шага: транспонирование + отражение строк, либо замена четырёх элементов за раз.
   - Пример: `Rotate Image`.

3. **Обнуление строк и столбцов (Set Zeroes)**
   - Если элемент равен нулю, обнулить всю строку и столбец.
   - Используются маркеры в первой строке и первом столбце для экономии памяти.
   - Пример: `Set Matrix Zeroes`.

4. **Игра «Жизнь» (Game of Life)**
   - Одновременное обновление клеток по правилам, требует кодирования состояний (например, 2 – была жива, станет мёртвой; 3 – была мёртва, станет живой).
   - Пример: `Game of Life`.

5. **Проверка правил (Sudoku)**
   - Проверка уникальности в строках, столбцах и подквадратах (3×3).
   - Используются битовые маски или хэш-сеты.
   - Пример: `Valid Sudoku`.

### Сложность типичных операций
- Обход всех элементов (O(m×n)) – большинство задач требуют хотя бы одного полного прохода.
- Поворот, обнуление, игра «Жизнь» – O(m×n).
- Проверка судоку (фиксированный размер 9×9) – O(1) (константа).

### Советы
- Всегда проверяйте границы: `row >= 0 && row < rows && col >= 0 && col < cols`.
- Для обхода по спирали используйте четыре переменные границ и проверки `if` после каждого направления.
- При кодировании состояний (Game of Life) не забывайте отличать исходное состояние от нового при подсчёте соседей.
- Для маркеров в первой строке/столбце храните отдельные флаги для самих первой строки и столбца.

---

## English

### What is a matrix in problems?
A **matrix** is a two-dimensional array (array of arrays), where elements are arranged in rows and columns. Problems on matrices often require careful index handling, boundary checks, and traversal in different directions. In Java, a matrix is typically represented as `int[][]` or `char[][]`.

### Common patterns for matrices
1. **Spiral Traversal**
   - Moving along the perimeter while gradually shrinking boundaries (`top`, `bottom`, `left`, `right`).
   - Example: `Spiral Matrix`.

2. **Rotation**
   - Rotate the matrix 90° clockwise (or counter‑clockwise).
   - Often solved by two steps: transpose + reflect rows, or swapping four elements at a time.
   - Example: `Rotate Image`.

3. **Setting Rows and Columns to Zero (Set Zeroes)**
   - If an element is zero, set its entire row and column to zero.
   - Use markers in the first row and first column to save memory.
   - Example: `Set Matrix Zeroes`.

4. **Game of Life**
   - Simultaneous update of cells according to rules, requires state encoding (e.g., 2 – alive becomes dead; 3 – dead becomes alive).
   - Example: `Game of Life`.

5. **Validation (Sudoku)**
   - Check uniqueness in rows, columns, and 3×3 sub‑boxes.
   - Use bit masks or HashSets.
   - Example: `Valid Sudoku`.

### Complexity of typical operations
- Traversing all elements (O(m×n)) – most problems require at least one full pass.
- Rotation, zeroing, Game of Life – O(m×n).
- Sudoku validation (fixed size 9×9) – O(1) (constant).

### Tips
- Always check boundaries: `row >= 0 && row < rows && col >= 0 && col < cols`.
- For spiral traversal, use four boundary variables and `if` checks after each direction.
- When encoding states (Game of Life), remember to distinguish original state from new state when counting neighbours.
- For markers in the first row/column, keep separate flags for the first row and first column themselves.

---