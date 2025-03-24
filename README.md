## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## DEFINITIONS LEARNED
## Section 1: JAVA Basics

## 1.1 Scope of Variables
- Scope of a variable: Section of program where the variable is visible
    - scope of a variable is determined when at compile time(not run time)

    TYPES:
    - Class-level scope
        - Class-level variable 
            - ^ variables a.k.a. fields, are declared inside a class and not in any methods
            - Accessible from anywhere within the class, also maybe from outside depending on the modifier in place
            ![alt text](image.png)
    - Method-Level Scope
        - method-level variable
            - declared inside our method, a.k.a. local variable. Visible to the method declarations, until the method returns. 
            - declared as part of the method signature and initialized when method is invoked
    - Block-Level Scope
        - defined by a pair or curly brackers
        - Can only be accessed from its declaration until the end of the curly brackets, and is not accessible to code outside the curly bracket block
    ** To know in Java: Variable declarations are bound to their scope, and you cannot redeclare a variable in the same scope. **
    
## 1.2 Structure of a Java Class
- Class Declaration:
    - Modifiers
    - The class keyword
    - The class name
    - If any, name of superclass
    - If any, list of interfaces implemented by class, preceded by implements keyword 
    - The class body, surrounded by { }
    ![alt text](image-1.png)

Field Declaration:


Method Declaration:

Constructor Declaration: