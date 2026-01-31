# New-Scene-New-Me-Project

# Project: New Scene, New Me

## Introduction

Software engineers develop programs to create visual and audio experiences using object-oriented programming. As we begin 2026, your goal is to create an animation program that reflects on your experiences from 2025 and visualizes your goals and aspirations for the year ahead using the Theater and Scene API.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, algorithms, and the Theater/Scene API to create your animation program:
- **Write Scene subclasses** – Create two Scene subclasses: one to visualize your 2025 recap (LastYear) and another to project your 2026 goals (ThisYear). Each class must include both a no-argument constructor and a parameterized constructor.
- **Use private instance variables** – Implement proper encapsulation by declaring instance variables as private in your Scene subclasses.
- **Create 1D arrays** – Create at least two 1D arrays to store data for your scenes. One array must be created using an initializer list, and one array must be populated by reading from a text file using the FileReader class.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Access and modify array elements** – Use algorithms to traverse, access, and/or modify elements in your 1D arrays to display personalized content in your scenes.
- **Use logic and iteration** – Incorporate selection statements (if/if-else) and loops (while, for, or enhanced for) to control the flow and display of content in your scenes.
Incorporate variety of media – Use at least four different types of Scene API methods across both scenes (examples: drawImage(), drawText(), drawRectangle(), drawEllipse(), playSound(), setTextStyle(), setFillColor(), etc.).
- **Create a UML diagram** – Design a UML class diagram showing your Scene subclasses with their instance variables, constructors, and methods before you begin coding.
- **Document your code** – Use multi-line comments to explain the purpose of each method (including preconditions and postconditions) and single-line comments to explain code segments.

## UML Diagram 


![UML Diagram for my project](UML.png) 

## Description of 2025 recap

My 2025 recap scene (LastYear) shows three categories from my year: Family, Places, and Baseball. The scene displays nine photos total, with three photos shown for each category. I added background music, sound effects, and pauses to create an animated slideshow of my memories from 2025.

## Description of 2026 goals

My 2026 goals scene (ThisYear) focuses on what I want to accomplish in the new year. In this scene, I displayed my goals inside a caption box to make them clear and organized. The goals I included are getting better grades in school, working out consistently to stay healthy, saving money to be more responsible, and improving my baseball skills through practice. This scene represents my aspirations for 2026 and what I want to work toward throughout the year.

## Scene API Usage

To create my animation, I used several different methods from the Scene API. I used drawImage() to display title images and photos, and drawText() to show category labels and goals on the screen. I also used drawRectangle() and setFillColor() to create a caption box for my 2026 goals. Sound effects and background music were added with playSound(), and pause() was used to control the timing of the animation so each image and goal appears clearly. I also used text styling methods like setTextStyle() and setTextColor() to make the text easier to read. These methods helped me build an organized and creative animation project.
