## 📌 Print All Divisors (Ascending Order)

### 🔹 Approach

* Iterate from `1` to `√n`
* If `i` divides `n`, then:

    * `i` → small divisor
    * `n / i` → paired (large) divisor
* Avoid duplicate when `i == n / i` (perfect square)

---

### ⚠️ Duplicate Handling

```java
if (i != n / i) {
    large.add(n / i);
}
```

---

### 🔢 Example

#### n = 36

| i | n % i == 0 | n / i | Add Small | Add Large | Reason                     |
| - | ---------- | ----- | --------- | --------- | -------------------------- |
| 1 | ✅          | 36    | 1         | 36        | pair                       |
| 2 | ✅          | 18    | 2         | 18        | pair                       |
| 3 | ✅          | 12    | 3         | 12        | pair                       |
| 4 | ✅          | 9     | 4         | 9         | pair                       |
| 5 | ❌          | -     | -         | -         | skip                       |
| 6 | ✅          | 6     | 6         | ❌         | duplicate (perfect square) |

---

### ✅ Output

```
1 2 3 4 6 9 12 18 36
```

---

### ⚡ Complexity

* **Time:** `O(√n)`
* **Space:** `O(√n)`

---

### 💡 Key Insight

> Divisors always come in pairs → optimize from `O(n)` to `O(√n)` 🚀
