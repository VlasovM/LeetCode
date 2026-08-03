# Sliding Window / Скользящее окно

## Русский

### Что такое скользящее окно?
**Скользящее окно** — это метод, при котором мы поддерживаем подмассив или подстроку (окно) с изменяемыми границами, перемещая их по массиву/строке для выполнения проверок или вычислений. Обычно используются два указателя (`left` и `right`), которые двигаются в одном направлении. Окно может быть:

- **Фиксированного размера** – границы сдвигаются синхронно (например, сумма подмассива длины `k`).
- **Переменного размера** – размер окна меняется в зависимости от условий (расширяется при добавлении элементов, сужается при выполнении условия).

### Когда использовать?
- Нужно найти подмассив/подстроку, удовлетворяющую определённому условию (сумма ≥ target, уникальные символы, покрытие всех символов и т.д.).
- Задача на **максимальную/минимальную длину** или **количество** подмассивов/подстрок.
- Массив или строка достаточно большие, и нужно избежать O(n²) перебора.
- Часто используется вместе с хэш-таблицами для подсчёта частот (например, при работе с символами или словами).

### Основные типы
1. **Фиксированное окно**
    - Окно имеет постоянную длину `k`.
    - На каждом шаге добавляем новый элемент справа и убираем самый левый.
    - Применяется для задач типа "максимальная сумма подмассива длины k".

2. **Переменное окно (динамическое)**
    - Окно расширяется вправо (`right++`), пока условие не выполнится.
    - Затем сужается слева (`left++`), чтобы найти минимальное окно.
    - Применяется для поиска минимальной длины подмассива с суммой ≥ target, максимальной подстроки без повторяющихся символов, минимального окна, содержащего все символы, и т.д.

### Как реализовать на Java
Обычно используется два указателя и цикл `while` или `for`:

---

# Sliding Window

## What is a sliding window?
**Sliding window** is a technique where we maintain a subarray or substring (window) with moving boundaries, sliding them across the array/string to perform checks or computations. We typically use two pointers (`left` and `right`) moving in the same direction. The window can be:

- **Fixed size** – boundaries move synchronously (e.g., sum of subarray of length `k`).
- **Variable size** – window size changes depending on conditions (expands when adding elements, shrinks when a condition is met).

## When to use?
- Need to find a subarray/substring satisfying a certain condition (sum ≥ target, unique characters, covering all characters, etc.).
- Problems asking for **maximum/minimum length** or **count** of subarrays/substrings.
- Array or string is large, and we need to avoid O(n²) brute force.
- Often paired with hash maps for frequency counting (e.g., characters or words).

## Main types
1. **Fixed window**
    - Window has a constant length `k`.
    - Each step: add a new element on the right, remove the leftmost.
    - Used for problems like "maximum sum of subarray of size k".

2. **Variable window (dynamic)**
    - Window expands to the right (`right++`) until the condition is satisfied.
    - Then shrinks from the left (`left++`) to find the minimum window.
    - Used for: minimum subarray sum ≥ target, longest substring without repeating characters, minimum window containing all characters, etc.

## Implementation in Java
Typically uses two pointers and a `while` or `for` loop:
