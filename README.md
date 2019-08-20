# DInj-IoC-IoC-Container
Dependency Injection and Inversion of Control are not DIP Implementations

**Inversion of Control** 

  - Is a principle in software engineering by which the control of objects or portions of a program is transferred to a container or framework. It’s most often used in the context of object-oriented programming.

    - Decoupling the execution of a task from its implementation
    - Making it easier to switch between different implementations
    - Greater modularity of a program
    - Greater ease in testing a program by isolating a component or mocking its dependencies and allowing components to communicate through contracts

  - Inversion of Control can be achieved through various mechanisms such as: Strategy design pattern, Service Locator pattern, Factory pattern, and Dependency Injection (DI).
  
**Dependency Injection (DI)** is a pattern through which to implement IoC, where the control being inverted is the setting of object’s dependencies.

Injection types:

  - Field Injection
  
  | pros | cons |
  |---|---|
  |Concise: does not require adding parameters to a constructor or a setter method.|Disallows immutable field declaration|
  | |Eases single responsibility principle violation|
  | |Behaviour of injection cannot be modified by code|
  | |Hard to test.|
  | |Dependencies are unnecessarily mutable.|
  
  - Setter injection
  
  | pros | cons |
  |---|---|
  |Immune to circular dependency issues.|Violates encapsulation.|
  | Highly coupled classes are easily identified as setters are added.|Circular dependencies are hidden.|
  | |The most boilerplate code of the three patterns.|
  | |Dependencies are unnecessarily mutable.|

  
  - Constructor injection (Good)
  
  | pros | cons |
  |---|---|
  |Dependencies can be immutable.|Constructors trickle down to subclasses.|
  |Recommended by Spring.|Prone to circular dependency issues.|
  |Easiest to test out of all the patterns. ||
  |Highly coupled classes are easily identified as constructor parameters grow.||
  |Familiar to developers coming from other platforms.||
  |No dependency on the @Autowired annotation.||
  
**IoC container** is a common characteristic of frameworks that implement IoC.
