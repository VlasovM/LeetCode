# Intervals / Интервалы

## Русский

### Что такое интервалы?
**Интервал** — это отрезок на числовой прямой, заданный двумя числами: началом (`start`) и концом (`end`). Обычно интервалы представляются как массивы или объекты с полями `[start, end]`. Задачи на интервалы часто требуют их объединения, вставки, определения пересечений или поиска минимального количества точек для покрытия всех интервалов.

### Основные паттерны
1. **Сортировка** – большинство задач начинаются с сортировки интервалов по началу (или концу). Это позволяет обрабатывать их последовательно.
2. **Объединение пересекающихся интервалов (Merge)** – проход по отсортированным интервалам и слияние тех, где `next.start ≤ current.end`.
3. **Вставка интервала (Insert)** – вставка нового интервала в уже отсортированный список с объединением пересечений.
4. **Минимальное количество точек (стрел)** – сортировка по концам и жадный выбор позиции для точки (стрелы), чтобы покрыть максимальное количество интервалов.
5. **Поиск разрывов / формирование диапазонов** – обход отсортированного массива и создание строковых представлений непрерывных последовательностей.

### Когда использовать?
- Задачи на объединение перекрывающихся отрезков (например, календари, бронирования).
- Необходимо вставить новый отрезок в существующее множество.
- Нужно найти минимальное количество точек, чтобы каждый отрезок содержал хотя бы одну точку (задача о стрелах).
- Требуется преобразовать массив чисел в диапазоны (Summary Ranges).

### Советы
- Всегда проверяйте пустой вход (вернуть пустой список).
- При объединении сравнивайте `current.end` и `next.start` (если `next.start ≤ current.end`, они пересекаются).
- При вставке используйте `merged` интервал и обновляйте его границы.
- Для задачи о стрелах сортируйте по концам и стреляйте в конец первого интервала.
- При формировании диапазонов используйте начало и конец последовательности.

### Сложность
- Сортировка O(n log n) плюс проход O(n) – итого O(n log n) для большинства задач.
- Вставка и Summary Ranges могут быть O(n) без сортировки (если вход уже отсортирован).
- Память O(1) дополнительно, кроме выходного списка.

---

## English

### What are intervals?
An **interval** is a segment on the number line defined by a start and an end (`[start, end]`). In problems, intervals are typically represented as arrays or objects with `start` and `end` fields. Interval problems often involve merging, insertion, detecting overlaps, or finding minimum points to cover all intervals.

### Common patterns
1. **Sorting** – most interval problems start with sorting by start (or end). This allows sequential processing.
2. **Merging overlapping intervals** – iterate over sorted intervals and merge those where `next.start ≤ current.end`.
3. **Inserting an interval** – insert a new interval into the sorted list while merging overlaps.
4. **Minimum number of points (arrows)** – sort by end, then greedily choose a point (arrow) to cover as many intervals as possible.
5. **Detecting gaps / forming ranges** – traverse sorted array and create string ranges for consecutive numbers.

### When to use?
- Problems about merging overlapping intervals (e.g., calendars, bookings).
- Need to insert a new interval into an existing set.
- Find minimum points to cover all intervals (balloon burst).
- Convert array of numbers into ranges (Summary Ranges).

### Tips
- Always check for empty input (return empty list).
- For merging, compare `current.end` with `next.start` (if `next.start ≤ current.end`, they overlap).
- For insertion, maintain a `merged` interval and update its bounds.
- For arrow problems, sort by end and shoot at the end of the first interval.
- For ranges, track the start and end of the current sequence.

### Complexity
- Sorting O(n log n) plus linear pass O(n) – total O(n log n) for most problems.
- Insertion and Summary Ranges can be O(n) without sorting (if input is already sorted).
- Space O(1) extra besides the output list.
