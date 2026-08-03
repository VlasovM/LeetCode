# String / Строки

## Русский

### Что такое строки в задачах?
Строки — одна из самых частых тем в алгоритмических интервью. В Java строки **неизменяемы (immutable)**, поэтому для частых модификаций используют `StringBuilder` или `char[]`. Задачи на строки проверяют навыки работы с символами, индексами, регексами, а также знание структур данных (стеки, хеш-таблицы, очереди) и алгоритмических паттернов.

### Основные паттерны для строк
1. **Два указателя (Two Pointers)**
    - Проверка палиндрома, сравнение с конца, поиск подстроки.
    - Примеры: `Valid Palindrome` (в другом разделе).

2. **Скользящее окно (Sliding Window)**
    - Поиск максимальной/минимальной подстроки по условию.
    - Примеры: `Longest Substring Without Repeating Characters` (в Sliding Window).

3. **Стек (Stack)**
    - Проверка скобок, упрощение путей, вычисление выражений.
    - Примеры: `Valid Parentheses`, `Simplify Path` (в Stack).

4. **Развороты (Reversals)**
    - Переворот строки или слов, зигзагообразное чтение.
    - Примеры: `Reverse Words in a String`, `Zigzag Conversion`.

5. **Математические преобразования**
    - Преобразование римских чисел в целые и обратно.
    - Примеры: `Roman to Integer`, `Integer to Roman`.

6. **Жадные и симуляционные алгоритмы**
    - Выравнивание текста, построчное форматирование.
    - Примеры: `Text Justification`, `Length of Last Word`.

7. **Префиксные проверки**
    - Поиск общего префикса группы строк.
    - Примеры: `Longest Common Prefix`.

### Сложность строковых операций
- `charAt()` – O(1).
- `substring()` – O(k) (создаёт новую строку).
- `toCharArray()` – O(n) (копирует).
- `StringBuilder.append()` – в среднем O(1) (амортизировано).
- `split()` – O(n) (создаёт массив подстрок).

### Советы
- Для построения строк в циклах используйте `StringBuilder` (или `StringBuffer` для многопоточности).
- При работе с символами можно использовать `char[]` для быстрого доступа и модификации.
- Для проверки наличия подстроки используйте `String.indexOf()` (если разрешено).
- Не забывайте обрабатывать пустые строки и пробелы (особенно в задачах на разбиение и форматирование).

---

## English

### What are strings in algorithmic problems?
Strings are a frequent topic in coding interviews. In Java, strings are **immutable**, so for heavy modifications we use `StringBuilder` or `char[]`. Problems test skills in character manipulation, indexing, regex, as well as knowledge of data structures (stacks, hash maps, queues) and algorithmic patterns.

### Common patterns for string problems
1. **Two Pointers**
    - Palindrome checking, comparing from both ends, substring search.
    - Examples: `Valid Palindrome` (in another section).

2. **Sliding Window**
    - Finding min/max substrings satisfying a condition.
    - Examples: `Longest Substring Without Repeating Characters` (in Sliding Window).

3. **Stack**
    - Valid parentheses, path simplification, expression evaluation.
    - Examples: `Valid Parentheses`, `Simplify Path` (in Stack).

4. **Reversals**
    - Reverse entire string or words, zigzag reading.
    - Examples: `Reverse Words in a String`, `Zigzag Conversion`.

5. **Math conversions**
    - Roman numeral conversion.
    - Examples: `Roman to Integer`, `Integer to Roman`.

6. **Greedy & simulation**
    - Text justification, last word length.
    - Examples: `Text Justification`, `Length of Last Word`.

7. **Prefix checks**
    - Finding common prefix among strings.
    - Examples: `Longest Common Prefix`.

### Complexity of string operations
- `charAt()` – O(1).
- `substring()` – O(k) (creates a new string).
- `toCharArray()` – O(n) (copies).
- `StringBuilder.append()` – amortized O(1).
- `split()` – O(n) (creates an array of substrings).

### Tips
- Use `StringBuilder` (or `StringBuffer` for multithreading) for building strings in loops.
- When working with characters, you can use `char[]` for fast access and modification.
- For substring checks, use `String.indexOf()` if allowed.
- Always handle empty strings and whitespace (especially in splitting and formatting problems).

---