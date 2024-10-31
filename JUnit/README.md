# Mutant Revealer Lab

## Overview

This lab involves developing a robust test suite that can effectively distinguish between a correct implementation and various mutant implementations. The objective is to write tests that pass for the correct implementation and fail for any faulty (mutant) implementations, ensuring that each mutant is revealed by at least one test case.

## Project Structure

- **Correct Implementation**: The intended, correct implementation of the method, which should pass all test cases in the test suite.
- **Mutant Implementations**: 15 altered (mutant) versions of the method, each introducing subtle flaws. The goal is to catch these flaws with specific test cases.
- **Test Suite**: Written in `revealer/MutantRevealer.java`, this test suite should pass for the correct implementation and reveal each mutant by failing for at least one test case.
- **Evaluator**: `testthetests/RevealingMutantsEvaluator` is used to evaluate the test suite's effectiveness. It measures how many mutant implementations the test suite successfully identifies.

## How It Works

1. **Method Specification**: Provided as part of the project, defining the expected behavior of the method under test.
2. **Writing Tests**: The test suite in `MutantRevealer.java` contains test cases that exercise edge cases, typical inputs, and boundary conditions to ensure comprehensive coverage.
3. **Evaluation**: Running `RevealingMutantsEvaluator` evaluates the suite's success in identifying all mutant implementations.

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/MutantRevealerLab.git
2. **Set Up the Classpath:**
   Make sure to add mutants.jar to your classpath to access all implementations.

    ```bash
    java -cp .;mutants.jar testthetests.RevealingMutantsEvaluator


## Results

The test suite should:

1. Pass for the correct implementation.
2. Fail for each of the mutant implementations, successfully "revealing" them.
