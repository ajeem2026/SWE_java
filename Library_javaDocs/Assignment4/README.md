# Media Library Manager

## Overview

This project is a **Media Library Manager** developed as part of a software development course. The project demonstrates the use of object-oriented programming principles in Java, focusing on **inheritance, interfaces, polymorphism, and collections** to manage different types of media items, including albums, movies, and audiobooks. The implementation is managed within **Eclipse IDE** and version-controlled with **Git**, showcasing practical software engineering skills in code organization, testing, and documentation.

## Features

- **Inheritance and Polymorphism**: Uses an abstract `MediaItem` class extended by concrete classes (`Album`, `Movie`, `AudioBook`) to manage different media types in a unified manner.
- **Interface Implementation**: Implements `Comparable` to enable natural ordering of media items.
- **Collection Usage**: Stores and manages media items within a Java Collection, illustrating flexibility and extensibility.
- **Javadocs Documentation**: Automatically generated documentation for easy reference and usability.

## Project Structure

1. **Classes**:
   - **MediaItem (Abstract)**: Base class with attributes like title, copyright year, playing time, and presence in collection.
   - **Album, Movie, AudioBook (Concrete)**: Extend `MediaItem`, each adding unique attributes and behaviors relevant to the specific media type.

2. **Driver Programs**:
   - **Array-Based Driver**: Demonstrates polymorphism by storing media items in an array.
   - **Collection-Based Driver**: Uses a Java Collection to manage media items, allowing for enhanced flexibility and efficiency.

3. **Testing**:
   - Test cases are embedded in the main methods of each class, validating behavior incrementally and ensuring functionality across different media types.

## Setup and Usage

### Prerequisites

- **Java** (at least version 8)
- **Eclipse IDE** (with Git support enabled)
- **GitHub** for version control

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/MediaLibraryManager.git
2. **Import into Eclipse:**
    1. Open Eclipse, go to File > Import > Existing Projects into Workspace, and select the cloned repository.
    2. Run Driver Programs:
          Right-click on the Driver.java files in each package and select Run As > Java Application to see the project in action.

### Documentation
Javadocs: Generated for all classes, providing clear descriptions and parameter/return details for each method.
To view the documentation, open the docs/index.html file in a web browser.

### Showcase
This project highlights my ability to:

1. Design and implement object-oriented systems.
2. Utilize Eclipse for efficient development.
3. Leverage Git for version control and collaborative workflows.
4. Write comprehensive documentation for easy usability.
