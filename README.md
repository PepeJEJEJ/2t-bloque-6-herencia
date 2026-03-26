# 2t-bloque-6-herencia
---

# Bloque 5 y 6: Introducción a la Programación Orientada a Objetos (POO) y Herencia

## Índice
1. [Introducción a la Orientación a Objetos](#introducción-a-la-orientación-a-objetos)  
2. [Conceptos Fundamentales](#conceptos-fundamentales)  
3. [Componentes de una Clase](#componentes-de-una-clase)  
4. [Principios Básicos de la POO](#principios-básicos-de-la-poo)  
5. [Instanciación y Referencias](#instanciación-y-referencias)  
6. [Recolector de Basura (Garbage Collector)](#recolector-de-basura-garbage-collector)  
7. [Creación de Clases](#creación-de-clases)  
8. [Relaciones entre Clases (Composición)](#relaciones-entre-clases-composición)  
9. [Ampliación: Clases Especiales](#ampliación-clases-especiales)  

---

## Introducción a la Orientación a Objetos
En este tema dejamos atrás la idea de que un programa es solo una lista de instrucciones y pasamos a verlo como un conjunto de **objetos que se comunican entre sí**. Esto implica trabajar con **múltiples ficheros Java**, no uno solo.

---

## Conceptos Fundamentales

### ● Clase (El Molde)
Plantilla que define atributos y métodos comunes. No ocupa memoria hasta crear un objeto.

### ● Objeto (La Instancia)
Elemento concreto creado a partir de una clase. Tiene:
- Identidad (dirección de memoria)
- Estado (atributos)
- Comportamiento (métodos)

---

## Componentes de una Clase
### ● Atributos (Datos)
Variables que guardan el estado del objeto.  
Ejemplo:
```java
private String color;
private int velocidad;
```

### ● Métodos (Comportamiento)
Funciones que indican qué puede hacer el objeto.  
Ejemplo:
```java
public void acelerar() {}
public void frenar() {}
```

---

## Principios Básicos de la POO

### ● Abstracción
Nos centramos en lo esencial del objeto.

### ● Encapsulamiento
Ocultamos los datos internos usando `private` y exponemos solo lo necesario mediante getters y setters.

---

## Instanciación y Referencias
Para crear un objeto usamos `new`:

```java
Coche miCoche = new Coche();
```

---

## Recolector de Basura (Garbage Collector)
Java elimina automáticamente los objetos sin referencias.  
Ejemplo:

```java
miCoche = null; // el GC podrá eliminarlo
```

---

## Creación de Clases

### 0. Creación de la clase
El fichero debe llamarse igual que la clase:

```java
public class Persona {
}
```

### 1. Atributos
Siempre privados por convención:

```java
private String nombre;
private int edad;
```

### 2. Constructores
Método especial que inicializa el objeto:

```java
public Persona(String nombre) {
    this.nombre = nombre;
}
```

Si no creamos uno, Java genera un constructor vacío por defecto.

### 3. Getters y Setters

```java
public String getNombre() {
    return this.nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
```

### 4. toString
Permite imprimir el objeto de forma legible:

```java
public String toString() {
    return "Persona con nombre " + this.nombre + " y edad " + this.edad;
}
```

### 5. Métodos extra

```java
public boolean esMayorEdad() {
    return this.edad >= 18;
}
```

---

## Relaciones entre clases (Composición)
Un objeto puede contener a otro.  
Ejemplo: un **Cliente tiene una Dirección**.

### Clase 1: Dirección
```java
public class Direccion {
    private String calle;
    private int numero;

    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }
}
```

### Clase 2: Cliente
```java
public class Cliente {
    private String nombre;
    private Direccion domicilio;

    public Cliente(String nombre, Direccion domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
}
```

### Main
```java
public static void main(String[] args) {
    Direccion direccionAna = new Direccion("Calle Gran Vía", 25);
    Cliente ana = new Cliente("Ana García", direccionAna);
}
```

---

## Ampliación: Clases Especiales

### 1. Miembros Estáticos (static)
Un atributo estático pertenece a la **clase**, no a cada objeto.  
Se comparte entre todas las instancias.

### 2. Enumerados (enum)
Colección de constantes fijas:

```java
public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
```

---

---

# 🧬 Bloque 6: Herencia en Java

La **herencia** es uno de los pilares fundamentales de la Programación Orientada a Objetos.  
Permite crear nuevas clases basadas en otras ya existentes, reutilizando código y añadiendo nuevas funcionalidades.

---

## 📑 Índice

1. ¿Qué es la Herencia?  
2. Superclase y Subclase  
3. Uso de `extends`  
4. Atributos y Métodos Heredados  
5. Sobrescritura de Métodos (`@Override`)  
6. Uso de `super`  
7. Constructores y Herencia  
8. Herencia Múltiple (por qué no existe en Java)  
9. Ejemplo Completo  
10. Clases `final` y Métodos `final`  

---

# 🧭 1. ¿Qué es la Herencia?

La herencia permite que una clase (subclase) **herede atributos y métodos** de otra clase (superclase).  
Esto permite:

- Reutilizar código  
- Evitar duplicación  
- Crear jerarquías lógicas  
- Especializar clases  

Ejemplo conceptual:

```
Animal → Perro  
Animal → Gato  
```

---

# 🏛️ 2. Superclase y Subclase

- **Superclase**: clase general  
- **Subclase**: clase más específica que hereda de la superclase  

Ejemplo:

```java
public class Animal {
    protected String nombre;
}
```

```java
public class Perro extends Animal {
    private String raza;
}
```

---

# 🧩 3. Uso de `extends`

La palabra clave `extends` indica que una clase hereda de otra:

```java
public class Perro extends Animal {
}
```

---

# 📦 4. Atributos y Métodos Heredados

La subclase hereda:

- Atributos `public` y `protected`
- Métodos `public` y `protected`

No hereda:

- Constructores  
- Atributos/métodos `private`  

---

# 🔄 5. Sobrescritura de Métodos (`@Override`)

Una subclase puede **modificar** el comportamiento de un método heredado:

```java
@Override
public void hacerSonido() {
    System.out.println("Guau guau!");
}
```

---

# 🧱 6. Uso de `super`

`super` permite acceder a elementos de la superclase:

### Llamar a un método de la superclase

```java
super.hacerSonido();
```

### Acceder a atributos heredados

```java
super.nombre = "Bobby";
```

---

# 🏗️ 7. Constructores y Herencia

Los constructores **no se heredan**, pero la subclase puede llamar al constructor de la superclase:

```java
public Perro(String nombre, String raza) {
    super(nombre); // llama al constructor de Animal
    this.raza = raza;
}
```

---

# 🚫 8. Herencia Múltiple en Java

Java **no permite herencia múltiple de clases**:

```java
// ❌ Esto NO se puede hacer
public class Perro extends Animal, Mamifero { }
```

Esto evita conflictos de métodos duplicados.  
Para casos similares, Java usa **interfaces**.

---

# 🧪 9. Ejemplo Completo

### Superclase

```java
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}
```

### Subclase

```java
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
```

### Main

```java
public static void main(String[] args) {
    Perro p = new Perro("Toby", "Labrador");
    p.hacerSonido(); // Guau guau!
}
```

---

# 🔒 10. Clases `final` y Métodos `final`

### Clase `final`
No puede heredarse:

```java
public final class Utilidades { }
```

### Método `final`
No puede sobrescribirse:

```java
public final void metodoSeguro() { }
```

---

```
