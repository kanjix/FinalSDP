# SneakerShop Project
# Name of your final project: SneakerShop
# Group: SE-2210
# Team members: Aset Kuanyshbayev

## Project Overview

The SneakerShop project aims to simulate the operations of a sneaker store, offering users the ability to choose sneakers based on their preferences, sizes, and user type (student, school student, or regular buyer). The project integrates various design patterns to enhance flexibility, maintainability, and extensibility.

## Idea of the Project

The project focuses on creating a virtual sneaker store where users can select sneakers, choose different pricing strategies based on their user type, convert shoe sizes, and customize their purchase with additional services. The primary goal is to demonstrate the application of design patterns in a real-world scenario.

## Purpose of the Work

The purpose of the project is to showcase the implementation of design patterns in a practical setting, emphasizing the importance of flexible and scalable software design. Additionally, the project provides a user-friendly interface for customers to interact with the sneaker store.

## Objectives of the Work

- Implement various design patterns, including the Factory Method, Strategy, and Decorator patterns, to achieve a modular and extensible codebase.
- Simulate a user-friendly interaction for customers to select sneakers, choose pricing strategies, and customize their purchases.
- Showcase the use of adapters to convert shoe sizes between different formats.

## Main Body

### 1. Factory Method Pattern

- **SneakerFactory:** The abstract factory interface to create sneakers.
- **AdidasFactory, NikeFactory, NewBalanceFactory:** Concrete factories implementing the creation of specific brand sneakers.

### 2. Strategy Pattern

- **PricingStrategy:** Interface defining a strategy for calculating prices.
- **StudentPricingStrategy, SchoolPricingStrategy, RegularPricingStrategy:** Concrete implementations of pricing strategies based on user type.

### 3. Adapter Pattern

- **SizeAdapterCmToUs, SizeAdapterUsToUkEu:** Adapters to convert shoe sizes between different formats (centimeters, US, UK, EU).

### 4. Decorator Pattern

- **SneakerInBrandedPackaging, GiftCardDecorator:** Decorators adding extra features (branded packaging, gift card) to the basic sneaker.

## UML Diagram

![UML Diagram](link-to-your-uml-diagram-image)

## Conclusion

### Key Points

- The project successfully implements the Factory Method, Strategy, Adapter, and Decorator design patterns to enhance modularity and extensibility.
- The user interface allows customers to choose sneakers, pricing strategies, and additional services.

### Project Outcomes

- The implementation provides a clear separation of concerns, making it easy to add new brands, pricing strategies, and customization options.

### Challenges Faced

- Ensuring proper integration of design patterns and maintaining a balance between flexibility and simplicity.

### Future Improvements

- Expand the variety of sneakers, brands, and customization options.
- Implement additional design patterns for further enhancements.

This project serves as a comprehensive example of applying design patterns to create a flexible and scalable system for a virtual sneaker store.
