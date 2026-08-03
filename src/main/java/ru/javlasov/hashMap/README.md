# HashMap / Хеш-таблица

## Русский

### Что такое HashMap?
**HashMap** — это структура данных, которая хранит пары «ключ-значение» и позволяет выполнять операции вставки, удаления и поиска в среднем за **O(1)**. В Java реализована в виде `HashMap<K, V>`, где `K` — тип ключа, `V` — тип значения. Ключи должны быть уникальными, а значения могут повторяться. Для работы с хеш-таблицами также часто используются `HashSet` (хранит только ключи) и `LinkedHashMap` (сохраняет порядок вставки).

### Когда использовать?
- Нужно хранить соответствие между объектами (например, слово → частота, символ → индекс, строка → список анаграмм).
- Требуется быстрый поиск, вставка или удаление элементов.
- Задача на подсчёт количества вхождений (частотный анализ).
- Задача на поиск дубликатов или уникальных элементов.
- Необходимо проверить наличие элемента или получить его без полного перебора.

### Основные паттерны
1. **Подсчёт частот** – пройти по массиву/строке и подсчитать количество каждого элемента (`countMap.put(key, countMap.getOrDefault(key, 0) + 1)`). Примеры: `Ransom Note`, `Valid Anagram`.

2. **Отображение (Map) «один к одному»** – проверить взаимно-однозначное соответствие между двумя наборами (например, символы строки и слова). Используются две карты или одна карта + множество. Примеры: `Isomorphic Strings`, `Word Pattern`.

3. **Группировка** – сгруппировать элементы по некоторому ключу (например, анаграммы по отсортированной строке). Пример: `Group Anagrams`.

4. **Поиск пар с суммой** – при обходе массива сохранять уже виденные элементы и проверять наличие дополнения до целевой суммы. Пример: `Two Sum`.

5. **Обнаружение циклов / повторений** – сохранять состояния, чтобы понять, когда процесс зациклился. Пример: `Happy Number`, `Contains Duplicate II`.

6. **Дизайн структур данных** – комбинировать `HashMap` с `ArrayList` для реализации операций за O(1). Пример: `Insert Delete GetRandom O(1)`.

7. **Множества для уникальности** – использовать `HashSet` для быстрой проверки наличия элемента. Пример: `Longest Consecutive Sequence`.

### Сложность операций
- Вставка (put) – O(1) в среднем.
- Поиск (get, containsKey) – O(1) в среднем.
- Удаление (remove) – O(1) в среднем.
- Перебор (values, entrySet) – O(n).

### Советы по использованию
- Для строковых ключей используйте `String` как ключ (он иммутабельный и правильно реализует `hashCode`/`equals`).
- Для примитивов используйте обёртки (Integer, Character).
- Если нужно сохранить порядок вставки, используйте `LinkedHashMap`.
- Для работы с многопоточностью — `ConcurrentHashMap`.

---

## English

### What is HashMap?
**HashMap** is a data structure that stores key-value pairs and provides average **O(1)** time for insertion, deletion, and lookup. In Java, it is implemented as `HashMap<K, V>`, where `K` is the key type and `V` is the value type. Keys must be unique, while values may repeat. Related utilities include `HashSet` (stores only keys) and `LinkedHashMap` (preserves insertion order).

### When to use?
- Need to store mappings between objects (e.g., word → frequency, character → index, string → list of anagrams).
- Fast search, insertion, or deletion is required.
- Counting frequencies (frequency analysis).
- Finding duplicates or unique elements.
- Checking existence of an element without scanning all data.

### Common patterns
1. **Frequency counting** – traverse the array/string and count each occurrence (`countMap.put(key, countMap.getOrDefault(key, 0) + 1)`). Examples: `Ransom Note`, `Valid Anagram`.

2. **One-to-one mapping** – check bijection between two sets (e.g., string characters and words). Use two maps or one map + a set. Examples: `Isomorphic Strings`, `Word Pattern`.

3. **Grouping** – group elements by a key (e.g., anagrams by sorted string). Example: `Group Anagrams`.

4. **Pair sum search** – store seen elements while iterating, check for complement to target. Example: `Two Sum`.

5. **Cycle / duplicate detection** – store states to detect when a process repeats. Examples: `Happy Number`, `Contains Duplicate II`.

6. **Data structure design** – combine `HashMap` with `ArrayList` for O(1) operations. Example: `Insert Delete GetRandom O(1)`.

7. **Set for uniqueness** – use `HashSet` for fast existence checks. Example: `Longest Consecutive Sequence`.

### Complexity of operations
- Insert (put) – O(1) average.
- Lookup (get, containsKey) – O(1) average.
- Delete (remove) – O(1) average.
- Iteration (values, entrySet) – O(n).

### Tips
- For string keys, use `String` (immutable and implements `hashCode`/`equals` correctly).
- For primitives, use wrapper classes (Integer, Character).
- To preserve insertion order, use `LinkedHashMap`.
- For concurrency, use `ConcurrentHashMap`.