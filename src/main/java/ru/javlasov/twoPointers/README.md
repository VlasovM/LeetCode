# Two Pointers / Два указателя

## Русский

### Когда использовать?
- Массив или строка **отсортированы** (или требуется имитировать сортировку).
- Нужно найти пару элементов с заданной суммой (Two Sum).
- Нужно проверить палиндром или симметрию.
- Требуется удалить дубликаты/переместить элементы **in-place**.
- Нужно слить два отсортированных массива.
- Задача на «контейнер с водой» или «ловушку дождя».

### Основные типы
1. **Встречные указатели (Left/Right)**
    - Один указатель в начале, другой в конце.
    - Двигаются навстречу, пока не встретятся.
    - Применяются для: проверки палиндрома, поиска пары с суммой, контейнера с водой, ловушки дождя.

2. **Однонаправленные (Fast/Slow)**
    - Оба движутся вперёд, но с разной скоростью или разной логикой (один читает, другой пишет).
    - Применяются для: удаления дубликатов, перемещения нулей, удаления элементов, поиска цикла в списке.

3. **Указатели на разных массивах**
    - Один указатель в первом массиве, другой во втором.
    - Используется для слияния двух отсортированных массивов или пересечения.

### Сложность
- Время: O(n) (один проход) в большинстве случаев.
- Память: O(1) дополнительно (без учёта входных данных).

### Советы
- Всегда проверяйте границы (выход за пределы массива).
- При встречных указателях условие `left < right` (или `left <= right` в некоторых случаях).
- При fast/slow указателе `slow` обычно отвечает за позицию записи, `fast` – за чтение.
- Для слияния с конца используйте индексы `i = m-1`, `j = n-1`, `k = m+n-1`.

---

## English

### What is it?
The **Two Pointers** technique uses two variables (indices or references) to traverse a data structure (usually an array or string). The pointers can move in the same direction, towards each other, or work on different arrays. This often allows solving problems in one pass (O(n)) with constant extra memory (O(1)).

### When to use?
- Array or string is **sorted** (or sorting is simulated).
- Need to find a pair with a given sum (Two Sum).
- Need to check palindrome or symmetry.
- Need to remove duplicates / move elements **in-place**.
- Need to merge two sorted arrays.
- Problems like "Container With Most Water" or "Trapping Rain Water".

### Main types
1. **Opposite-direction (Left/Right)**
    - One pointer at the start, the other at the end.
    - Move towards each other until they meet.
    - Used for: palindrome, pair sum, container with most water, trapping rain water.

2. **Same-direction (Fast/Slow)**
    - Both move forward, but at different speeds or with different logic (one reads, one writes).
    - Used for: removing duplicates, moving zeros, removing elements, detecting cycles in linked lists.

3. **Pointers on different arrays**
    - One pointer on the first array, another on the second.
    - Used for merging two sorted arrays or intersection.

### Complexity
- Time: O(n) (one pass) in most cases.
- Memory: O(1) extra (excluding input).

### Tips
- Always check boundaries (avoid out-of-bounds).
- For opposite-direction, use condition `left < right` (or `left <= right` in some cases).
- For fast/slow, `slow` usually points to the write position, `fast` to the read position.
- For merging from the end, use indices `i = m-1`, `j = n-1`, `k = m+n-1`.