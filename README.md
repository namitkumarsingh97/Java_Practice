# Java Basics – Key Learnings & Rules (Quick Notes)

These notes summarize **all the important Java concepts** that I learnt on the daily basis while solving problems. Keep this as a checklist whenever you write Java code 👇

---

## 1️⃣ Java Program Structure (Order Matters)

A basic Java file looks like this:

```java
package mypackage;        // optional
import java.util.Scanner; // optional

public class Main {
    // variables
    // methods
    public static void main(String[] args) {
        // code execution starts here
    }
}
```

### Order:
1. `package` (if used)
2. `import` statements
3. `class`
4. variables & methods
5. `main()` method

---

## 2️⃣ package Keyword

```java
package introduction;
```

### What it does:
- Groups related classes
- Matches folder structure
- Avoids name conflicts

### When needed:
- ✅ Real projects / IDEs
- ❌ Online judges (often skipped)

---

## 3️⃣ import Statement

```java
import java.util.Scanner;
```

### Why needed:
- To use classes **outside `java.lang`**

### `java.lang` is auto-imported
So these need **NO import**:
- `System`
- `String`
- `Math`

### These DO need import:
- `Scanner`
- `ArrayList`
- `HashMap`

---

## 4️⃣ Class Rules (Very Important)

### Valid:
```java
public class Main { }
class Main { }
```

### Invalid:
```java
private class Main { }   // ❌ not allowed
protected class Main { } // ❌ not allowed
```

### Rules:
- Top-level class can be **public or default only**
- If class is `public`, file name **must match class name**

---

## 5️⃣ main() Method Rules

```java
public static void main(String[] args)
```

### Why:
- `public` → JVM must access it
- `static` → JVM calls it without object
- `void` → no return expected

👉 **Execution always starts from `main()`**

---

## 6️⃣ Methods (Functions in Java)

Java does NOT use `function` keyword ❌

### Correct method syntax:
```java
public static boolean evenOdd(int n) {
    return n % 2 == 0;
}
```

### Rules:
- Must specify return type
- Must specify parameter types
- Use `return`, not `print`

---

## 7️⃣ Return vs Print (Critical Difference)

❌ Wrong for logic:
```java
System.out.println(true);
```

✅ Correct:
```java
return true;
```

### Rule:
- **Methods return values**
- `main()` prints values

---

## 8️⃣ Operators Reminder

| Operator | Meaning |
|-------|--------|
| `=` | assignment |
| `==` | comparison |

Example:
```java
if (n % 2 == 0) // correct
```

---

## 9️⃣ static Keyword (Basic Understanding)

- `static` members belong to **class**
- Can be used without object

### main() is static, so:
- Methods it calls should be static
- Variables used should be static OR local

---

## 🔟 Scanner Usage Pattern

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
```

- `Scanner` must be imported
- Can be inside `main()` or static at class level

---

## 1️⃣1️⃣ Access Modifiers (Where to use them)

| Place | Allowed modifiers |
|----|----|
| Top-level class | public / default |
| Methods | public / private / protected / default |
| Variables | public / private / protected / default |

👉 `private` is mostly for **variables & methods** (encapsulation)

---

## 1️⃣2️⃣ Mental Model to Remember

> **main() = manager**  
> **methods = workers**

- main handles input/output
- methods handle logic

---

## ✅ Final Checklist (Read Before Coding)

✔️ Class defined correctly
✔️ main() present
✔️ Method return types correct
✔️ No `function` keyword
✔️ Correct imports used
✔️ `==` used for comparison
✔️ Logic inside methods, printing in main

---

📌 These rules cover **90% of beginner Java mistakes**.
Once these are solid, Java becomes smooth.

You can now safely move to:
- DSA problems
- OOP concepts
- Real-world Java projects

