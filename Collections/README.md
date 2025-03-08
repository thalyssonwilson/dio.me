# 📚 Guia Completo sobre Collections em Java

## 🔥 Introdução

As **Collections** em Java são estruturas fundamentais para armazenar e manipular conjuntos de dados de forma eficiente. Elas nos permitem organizar, buscar e processar informações de maneira otimizada. Neste guia, exploraremos as três principais interfaces: **List, Set e Map**, suas implementações, principais métodos e como realizar operações essenciais como **adição, remoção, pesquisa, filtragem e ordenação**.

Vamos tornar esse aprendizado prático, apresentando **exemplos de código antes e depois**, para que você possa visualizar como cada método funciona! 🚀

---

## 1️⃣ Interface List

A interface **List** representa uma coleção ordenada que aceita elementos duplicados e permite acesso direto por índice. As principais implementações são **ArrayList** e **LinkedList**.

### 🟢 1.1 ArrayList

**ArrayList** é baseado em um array dinâmico, sendo eficiente para buscas e ordenações.

#### ✍️ Criando um ArrayList:

```java
List<String> lista = new ArrayList<>();
lista.add("Java");
lista.add("Python");
lista.add("C++");
System.out.println(lista);
```

**Saída:** `[Java, Python, C++]`

#### 🔄 Operações Básicas:

##### ➕ Adicionar elementos:

```java
lista.add("JavaScript");
System.out.println(lista);
```

**Saída:** `[Java, Python, C++, JavaScript]`

##### ❌ Remover elementos:

```java
lista.remove("Python");
System.out.println(lista);
```

**Saída:** `[Java, C++, JavaScript]`

##### 🔍 Buscar elementos:

```java
boolean existe = lista.contains("Java");
System.out.println("A lista contém 'Java'? " + existe);
```

**Saída:** `A lista contém 'Java'? true`

##### 📊 Ordenação:

Antes:

```java
List<Integer> numeros = Arrays.asList(5, 2, 8, 1);
System.out.println("Antes da ordenação: " + numeros);
Collections.sort(numeros);
System.out.println("Depois da ordenação: " + numeros);
```

**Saída:**

```
Antes da ordenação: [5, 2, 8, 1]
Depois da ordenação: [1, 2, 5, 8]
```

### 🟢 1.2 LinkedList

**LinkedList** é baseado em uma lista encadeada, sendo mais eficiente para inserções e remoções.

#### ✍️ Criando um LinkedList:

```java
List<String> linkedList = new LinkedList<>();
linkedList.add("HTML");
linkedList.add("CSS");
linkedList.add("JavaScript");
System.out.println(linkedList);
```

**Saída:** `[HTML, CSS, JavaScript]`

#### 🔄 Operações Básicas:

##### ➕ Adicionar no início:

```java
linkedList.addFirst("XML");
System.out.println(linkedList);
```

**Saída:** `[XML, HTML, CSS, JavaScript]`

##### ❌ Remover do fim:

```java
linkedList.removeLast();
System.out.println(linkedList);
```

**Saída:** `[XML, HTML, CSS]`

##### 🔍 Busca:

```java
boolean contem = linkedList.contains("CSS");
System.out.println("A lista contém 'CSS'? " + contem);
```

**Saída:** `A lista contém 'CSS'? true`

##### 📊 Ordenação:

```java
Collections.sort(linkedList);
System.out.println(linkedList);
```

**Saída:** `[CSS, HTML, XML]`

---

## 2️⃣ Interface Set

A interface **Set** representa uma coleção **sem elementos duplicados**. As principais implementações são **HashSet, TreeSet e LinkedHashSet**.

### 🟠 2.1 HashSet

**HashSet** armazena os elementos sem garantir ordem.

#### ✍️ Criando um HashSet:

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Banana");
hashSet.add("Maçã");
hashSet.add("Uva");
System.out.println(hashSet);
```

**Saída:** `[Uva, Banana, Maçã]` (ordem pode variar)

##### 🔍 Busca:

```java
boolean existe = hashSet.contains("Maçã");
System.out.println("O conjunto contém 'Maçã'? " + existe);
```

**Saída:** `O conjunto contém 'Maçã'? true`

##### 📊 Ordenação (convertendo para List):

```java
List<String> sortedList = new ArrayList<>(hashSet);
Collections.sort(sortedList);
System.out.println(sortedList);
```

**Saída:** `[Banana, Maçã, Uva]`

### 🟠 2.2 LinkedHashSet
O **LinkedHashSet** mantém a **ordem de inserção** dos elementos.
```java
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Banana");
linkedHashSet.add("Maçã");
linkedHashSet.add("Uva");
System.out.println(linkedHashSet);
```
**Saída:** `[Banana, Maçã, Uva]`


### 🟠 2.3 TreeSet

**TreeSet** mantém os elementos ordenados automaticamente.

```java
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(5);
treeSet.add(20);
System.out.println(treeSet);
```

**Saída:** `[5, 10, 20]`

---

## 3️⃣ Interface Map

A interface **Map** representa uma coleção de pares **chave-valor**. As principais implementações são **HashMap, TreeMap e LinkedHashMap**.

### 🟢 3.1 HashMap

**HashMap** armazena elementos sem ordem específica.

```java
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("A", 1);
hashMap.put("B", 2);
System.out.println(hashMap);
```

**Saída:** `{A=1, B=2}`

##### 🔍 Busca:

```java
int valor = hashMap.get("B");
System.out.println("Valor associado à chave 'B': " + valor);
```

**Saída:** `Valor associado à chave 'B': 2`

### 🟢 3.2 LinkedHashMap
O **LinkedHashMap** mantém a **ordem de inserção** das chaves.
```java
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Banana", 1);
linkedHashMap.put("Maçã", 2);
linkedHashMap.put("Uva", 3);
System.out.println(linkedHashMap);
```
**Saída:** `{Banana=1, Maçã=2, Uva=3}`


### 🟢 3.3 TreeMap

**TreeMap** mantém os elementos ordenados pela chave.

```java
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Banana", 1);
treeMap.put("Maçã", 2);
System.out.println(treeMap);
```

**Saída:** `{Banana=1, Maçã=2}` (ordenado)

---

## 🎯 Conclusão

Este guia apresentou as **Collections** do Java, abordando suas principais interfaces e implementações, com exemplos detalhados de **adição, remoção, busca e ordenação**.


| Método                 | List  | Set  | Map  | Descrição |
|------------------------|-------|------|------|-----------|
| `add(E e)`            | ✅    | ✅   | 🚫   | Adiciona um elemento à coleção. |
| `add(index, E e)`     | ✅    | 🚫   | 🚫   | Adiciona um elemento em uma posição específica (apenas em **List**). |
| `remove(E e)`         | ✅    | ✅   | ✅   | Remove um elemento pelo valor (ou pela chave no **Map**). |
| `remove(index)`       | ✅    | 🚫   | 🚫   | Remove um elemento pelo índice (apenas em **List**). |
| `get(index)`          | ✅    | 🚫   | 🚫   | Retorna o elemento em um índice específico (**List**). |
| `contains(E e)`       | ✅    | ✅   | ✅   | Verifica se um elemento existe na coleção. |
| `containsKey(K k)`    | 🚫    | 🚫   | ✅   | Verifica se uma chave existe no **Map**. |
| `containsValue(V v)`  | 🚫    | 🚫   | ✅   | Verifica se um valor existe no **Map**. |
| `size()`              | ✅    | ✅   | ✅   | Retorna o número de elementos na coleção. |
| `isEmpty()`           | ✅    | ✅   | ✅   | Verifica se a coleção está vazia. |
| `clear()`             | ✅    | ✅   | ✅   | Remove todos os elementos da coleção. |
| `sort(Comparator)`    | ✅    | 🚫   | 🚫   | Ordena os elementos de uma **List**. |
| `iterator()`          | ✅    | ✅   | 🚫   | Retorna um iterador para percorrer a coleção. |
| `forEach(action)`     | ✅    | ✅   | ✅   | Executa uma ação para cada elemento da coleção. |
| `put(K key, V value)` | 🚫    | 🚫   | ✅   | Adiciona um par **chave-valor** no **Map**. |
| `get(K key)`          | 🚫    | 🚫   | ✅   | Retorna um valor associado a uma chave no **Map**. |
| `keySet()`            | 🚫    | 🚫   | ✅   | Retorna um **Set** contendo todas as chaves do **Map**. |
| `values()`            | 🚫    | 🚫   | ✅   | Retorna uma **Collection** com todos os valores do **Map**. |
| `entrySet()`          | 🚫    | 🚫   | ✅   | Retorna um **Set** de pares chave-valor do **Map**. |


---


# 📊 **Quadro para Escolher a Collection Ideal em Java**

## 1️⃣ **Classes de List**
- **ArrayList**  
  - Melhor para: Acesso rápido por índice.
  - Quando usar: Quando o número de leituras for maior do que as inserções e remoções.
  
- **LinkedList**  
  - Melhor para: Inserções e remoções frequentes.
  - Quando usar: Quando for necessário realizar muitas operações de inserção e remoção no meio da lista.

## 2️⃣ **Classes de Set**
- **HashSet**  
  - Melhor para: Desempenho geral e quando a ordem não importa.
  - Quando usar: Quando você precisa garantir a unicidade dos elementos e não se importa com a ordem.

- **LinkedHashSet**  
  - Melhor para: Manter a ordem de inserção.
  - Quando usar: Quando os elementos devem ser únicos e a ordem de inserção precisa ser preservada.

- **TreeSet**  
  - Melhor para: Manter os elementos ordenados.
  - Quando usar: Quando você precisa garantir a unicidade e quer que os elementos sejam automaticamente ordenados (em ordem crescente).

## 3️⃣ **Classes de Map**
- **HashMap**  
  - Melhor para: Desempenho geral e quando a ordem das chaves não importa.
  - Quando usar: Quando você precisa armazenar pares chave-valor e a ordem das chaves não é relevante.

- **LinkedHashMap**  
  - Melhor para: Manter a ordem de inserção das chaves.
  - Quando usar: Quando você precisa armazenar pares chave-valor e a ordem de inserção das chaves precisa ser preservada.

- **TreeMap**  
  - Melhor para: Manter as chaves ordenadas automaticamente.
  - Quando usar: Quando você precisa armazenar pares chave-valor e quer que as chaves sejam automaticamente ordenadas.

---

# 🧩 **Resumo da Aplicação das Classes**

| **Necessidade**                               | **Interface**  | **Classe Recomendada**         | **Melhor Aplicação**                                          |
|-----------------------------------------------|----------------|--------------------------------|---------------------------------------------------------------|
| Acesso rápido por índice                      | `List`         | `ArrayList`                    | Quando o número de leituras é maior que inserções/removões.    |
| Inserções e remoções frequentes               | `List`         | `LinkedList`                   | Quando há muitas inserções/remoções no meio da lista.         |
| Elementos únicos sem ordem                    | `Set`          | `HashSet`                      | Quando você não precisa de ordem, mas quer evitar duplicados. |
| Elementos únicos com ordem de inserção        | `Set`          | `LinkedHashSet`                | Quando a ordem de inserção deve ser preservada.               |
| Elementos únicos ordenados                    | `Set`          | `TreeSet`                      | Quando os elementos devem ser únicos e ordenados.             |
| Chaves e valores sem ordem                    | `Map`          | `HashMap`                      | Quando a ordem das chaves não é relevante.                    |
| Chaves e valores com ordem de inserção        | `Map`          | `LinkedHashMap`                | Quando a ordem de inserção das chaves precisa ser mantida.    |
| Chaves e valores ordenados por chave          | `Map`          | `TreeMap`                      | Quando as chaves precisam ser ordenadas automaticamente.      |


## 5. Conclusão
As **Collections** são fundamentais para manipular dados de maneira eficiente no Java. 
- Se precisar de **ordem**, use **TreeSet**, **TreeMap**, **LinkedHashSet** ou **LinkedHashMap**.
- Se priorizar **desempenho**, **HashSet** e **HashMap** são as melhores opções.
- Para armazenar **valores ordenados**, **List** é a escolha certa.



Feito por [Thalysson Wilson](www.linkedin.com/in/thalyssonwilson) 😃




