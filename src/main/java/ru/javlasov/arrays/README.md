# Arrays / Массивы

## Русский

### Что такое массивы в задачах?
Массив — это базовая структура данных, представляющая собой непрерывную последовательность элементов одного типа, доступ к которым осуществляется по индексу. Задачи на массивы охватывают широкий спектр алгоритмических паттернов: от простых проходов до сложных техник, таких как префиксные суммы, развороты, двухпроходные алгоритмы и жадные стратегии. В этом разделе собраны задачи, которые не относятся к специфическим паттернам (как два указателя или скользящее окно), но требуют аккуратной работы с индексами, накопления значений или использования свойств массивов.

### Основные паттерны для массивов
1. **Префиксные/суффиксные произведения** – вычисление произведения всех элементов, кроме текущего, за один проход с использованием двух массивов (или переменных).  
   Пример: `Product of Array Except Self`.

2. **Развороты (Reversals)** – использование многократных разворотов для достижения циклического сдвига (поворота) массива.  
   Пример: `Rotate Array`.

3. **Подсчёт частот и голосование** – поиск элемента, встречающегося более чем n/2 раз, с использованием алгоритма Бойера-Мура (или хеш-таблицы).  
   Пример: `Majority Element`.

4. **Сортировка и сканирование** – сортировка массива с последующим линейным проходом для вычисления индекса (H-индекс) или других метрик.  
   Пример: `H-Index`.

5. **Двухпроходные алгоритмы** – два последовательных прохода для вычисления левых и правых значений (например, в задаче о конфетах, но там жадность). В этом разделе – префиксные произведения.

### Когда использовать?
- Нужно вычислить произведение всех элементов, кроме текущего, без деления.
- Требуется повернуть массив на k позиций (вправо или влево) с минимальной памятью.
- Необходимо найти элемент, который встречается более n/2 раз (гарантированно существует).
- Нужно вычислить h-индекс учёного по количеству цитирований.

### Сложность типичных операций
- Префиксные произведения – O(n) времени, O(1) дополнительной памяти (если использовать выходной массив как хранилище).
- Развороты – O(n) времени, O(1) памяти.
- Алгоритм Бойера-Мура – O(n) времени, O(1) памяти.
- Сортировка – O(n log n) времени, O(1) дополнительной памяти (для примитивов).

### Советы
- При вычислении префиксных произведений сначала заполните массив левыми произведениями, затем правыми.
- Для поворота массива используйте три разворота: всего массива, первых k элементов, оставшихся.
- Алгоритм Бойера-Мура требует двух переменных: кандидат и счётчик.
- Для H-индекса отсортируйте массив по убыванию или возрастанию и найдите точку, где `citations[i] >= i+1`.

---

## English

### What are arrays in problems?
An array is a fundamental data structure representing a contiguous sequence of elements of the same type, accessed by index. Array problems cover a wide range of algorithmic patterns: from simple traversals to advanced techniques like prefix sums, reversals, two-pass algorithms, and greedy strategies. This section collects problems that don't fit specific patterns (like two pointers or sliding window) but require careful index handling, accumulation, or using array properties.

### Common patterns for arrays
1. **Prefix/suffix products** – compute the product of all elements except the current one in one pass using two arrays (or variables).  
   Example: `Product of Array Except Self`.

2. **Reversals** – use multiple reversals to achieve cyclic shift (rotation) of the array.  
   Example: `Rotate Array`.

3. **Frequency counting and voting** – find the majority element (> n/2) using Boyer-Moore algorithm (or hash map).  
   Example: `Majority Element`.

4. **Sorting and scanning** – sort the array then linearly scan to compute an index (H-index) or other metrics.  
   Example: `H-Index`.

5. **Two-pass algorithms** – two sequential passes to compute left and right values (e.g., in candy problem, but that's greedy). In this section – prefix products.

### When to use?
- Need to compute product of all elements except current without division.
- Need to rotate array by k positions (right/left) with minimal memory.
- Need to find the majority element (> n/2) guaranteed to exist.
- Need to compute the h-index of a researcher by citation counts.

### Complexity of typical operations
- Prefix products – O(n) time, O(1) extra space (if using output array as storage).
- Reversals – O(n) time, O(1) space.
- Boyer-Moore – O(n) time, O(1) space.
- Sorting – O(n log n) time, O(1) extra space (for primitives).

### Tips
- For prefix products, first fill the array with left products, then right products.
- For rotation, use three reversals: entire array, first k, then remaining (take k % n).
- Boyer-Moore requires two variables: candidate and count.
- For H-index, sort ascending or descending and find where `citations[i] >= i+1`.

---