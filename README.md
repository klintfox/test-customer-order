# Introducción
Este proyecto tiene como objetivo mostrar ejemplos prácticos de TDD (Test-Driven Development) y DDD (Domain-Driven Design) utilizando Java y JUnit 5. Ambos enfoques son metodologías de desarrollo de software que permiten crear aplicaciones más robustas, escalables y fáciles de mantener, pero se aplican de maneras diferentes.

# ¿Qué es TDD?
TDD (Test-Driven Development) es una metodología de desarrollo en la que los desarrolladores escriben primero las pruebas antes de escribir el código de producción. El flujo de trabajo de TDD es el siguiente:

Escribir una prueba que falle: Primero escribimos una prueba que describe el comportamiento esperado del sistema.
Escribir el código de producción: Después escribimos el código suficiente para pasar la prueba.
Refactorizar: Finalmente, refactorizamos el código para mejorar su diseño, sin cambiar su funcionalidad.

# ¿Qué es DDD?
DDD (Domain-Driven Design) es un enfoque para el desarrollo de software que pone énfasis en entender el dominio del negocio y usar ese conocimiento para diseñar el software. En DDD, el código de la aplicación se organiza en torno al dominio (el área de conocimiento y actividad para la que el software se está desarrollando) y se buscan crear modelos que representen de manera precisa ese dominio.

## Archivos de prueba:
- **TDD: BankAccountTest.java**

Este archivo contiene un conjunto de pruebas que siguen la metodología TDD. Se prueba el comportamiento de un objeto BankAccount, que representa una cuenta bancaria. Las pruebas aseguran que las operaciones de depósito y retiro funcionen correctamente, y que el saldo de la cuenta no sea negativo.

- **DDD: OrderServiceTest.java**

Este archivo contiene pruebas relacionadas con el dominio de las órdenes. Se usan clases como Customer, Order, OrderService, y OrderRepository. Este enfoque de prueba está más centrado en la lógica de negocio y la gestión de pedidos en una tienda, asegurando que las órdenes se puedan crear, completar y cancelar correctamente.

## Test: TDD (Test-Driven Development)
En TDD, primero escribimos las pruebas antes de implementar la lógica de los objetos o servicios. Aquí se muestra un ejemplo de cómo aplicar TDD para un objeto BankAccount (Cuenta Bancaria).

Código de la prueba
[BankAccountTest.java:]()

**Descripción de las pruebas:**
- testDeposit(): Prueba que se pueda hacer un depósito de dinero en la cuenta bancaria.
- testWithdraw(): Prueba que se pueda retirar dinero de la cuenta bancaria correctamente.
- testBalanceCannotBeNegative(): Prueba que el saldo de la cuenta no sea negativo después de realizar un retiro mayor que el saldo disponible.

## Test: DDD (Domain-Driven Design)
En DDD, las pruebas se centran en los conceptos del dominio, por ejemplo, cómo interactúan los objetos del dominio como Order, Customer, OrderService, etc. En este ejemplo, trabajamos con un servicio que gestiona las órdenes en una tienda.

Código de la prueba 
[OrderServiceTest.java:]()

**Descripción de las pruebas:**
- testCreateOrder(): Verifica que se pueda crear una orden para un cliente y que tenga un estado inicial de "PENDING".
- testCompleteOrder(): Verifica que se pueda completar una orden, cambiando su estado a "COMPLETED".
- testCancelOrder(): Verifica que se pueda cancelar una orden, cambiando su estado a "CANCELLED".

### Diferencias entre TDD y DDD en este proyecto
**Enfoque:**

- TDD: Se enfoca en escribir pruebas para pequeñas unidades de código (en este caso, la clase BankAccount), asegurándose de que cada función individual se comporte de manera correcta antes de escribir la lógica.
- DDD: Se enfoca en el modelo del dominio, es decir, en cómo las entidades del negocio (como Order, Customer) interactúan entre sí y cómo los servicios (como OrderService) gestionan estas entidades.

**Objetivo:**

- TDD: Asegurarse de que cada unidad de código funcione correctamente antes de avanzar con la implementación.
- DDD: Asegurarse de que el sistema como un todo modela correctamente el dominio y los procesos de negocio.