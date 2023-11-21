# FINAL_SDP
Barbershop Environment Modeling System
Project Overview
Project Name: Barbershop Modeling System
Group: SE-2210
Student: Kaskyrbayev Mukhammed

Description
This project is a comprehensive and adaptable system designed for managing services in a barbershop. By incorporating various design patterns and adhering to SOLID principles, the goal is to create a maintainable and extensible codebase.

Idea of the Project
The primary concept revolves around modeling a virtual barbershop environment, where customers can seamlessly select from an array of stylist services. The system accommodates diverse services such as men's haircuts, women's haircuts, children's haircuts, and manicures. Additionally, customers have the option to include extra services like hair washing and massages.

Purpose of the Project
The project serves as a showcase of design patterns, including Singleton, Strategy, Observer, Factory, Decorator, and Adapter. The adherence to SOLID principles ensures a robust and logically structured system.

Main Body
Service Modeling with Strategy Pattern
The Strategy pattern is employed to model various barbershop services (Men's Haircut, Women's Haircut, Manicure) as separate strategies, implementing the ServiceStrategy interface.

The Strategy Component
[Include an image or diagram showcasing the Strategy pattern implementation]

Flexible Service Creation with Factory Pattern
The Factory pattern is utilized to dynamically create services based on user preferences. The ServiceFactoryProvider selects the appropriate factory, and the chosen factory creates the specific service.

Enhanced Customization with Decorator Pattern
The Decorator pattern allows customers to customize their chosen services. Additional features like hair washing or massages are implemented as decorators, enhancing service customization.

Database Connection Management with Singleton Pattern
To ensure efficiency and avoid redundant database connections, the Singleton pattern is employed. This guarantees a single, globally accessible instance of the database connection.

Real-Time Updates with Observer Pattern
The Observer pattern is used to instantly inform the Manager and Receptionist when a service is completed, enabling quick actions or immediate information sharing.

Service Adaptation with Adapter Pattern
The Adapter pattern is utilized to make non-standard services (e.g., Manicure) fit the standard ServiceStrategy interface, ensuring a uniform interface for all services.

Adapter Component
[Include an image or diagram showcasing the Adapter pattern implementation]

Adaptee Component
[Include an image or diagram showcasing the Adaptee component]

Conclusion
In conclusion, this project demonstrates the effective utilization of design patterns and SOLID principles to create a flexible barbershop management system. It excels in handling diverse services, providing real-time updates, and ensuring a seamless user experience. Continuous improvement can be achieved by adding more services, refining method implementations, and enhancing adaptability in various scenarios. The project adheres to principles such as SOLID, DRY, KISS, and YAGNI for optimal code quality and maintainability.
