# DSA

A structured **Data Structures & Algorithms (DSA)** practice repository focused on consistent problem solving in **Java** (primary) and **C++**.

## Overview
This repository documents day-by-day DSA progress, solution files, and coding workflow notes. It is designed as a learning and contribution space for interview preparation, competitive programming fundamentals, and open-source collaboration.

## Purpose
- Build strong DSA fundamentals through regular practice.
- Maintain a clear record of solved problems.
- Provide a beginner-friendly codebase where contributors can learn, improve, and contribute.

## Key Features
- Java-based `hundredDaysOfCode` DSA practice track.
- Additional C++ practice workspace.
- Day-wise problem files for easy tracking.
- Simple local compile/run workflow for quick iteration.
- Open to beginner-friendly contributions, especially for GSSOC.

## DSA Problem Record
Current problem-solving records are maintained in:
- `Java/hundredDaysOfCode/src/` → day-wise files such as `Day1.java`, `Day2.java`, ...
- `CPP/` → C++ practice and input/output-based runs.

As new problems are solved, add them in a consistent naming/organization pattern so progress remains easy to follow.

## Repository Structure
```text
DSA/
├── Java/
│   ├── hundredDaysOfCode/
│   │   ├── src/                # Day-wise Java DSA solutions
│   │   ├── pom.xml             # Maven config
│   │   └── build.gradle        # Gradle config
│   └── customizations/         # Local Java compile/run samples
├── CPP/                        # C++ DSA practice files
└── README.md
```

## Setup & Usage (Java DSA)
### Prerequisites
- Java JDK 17+
- Maven (optional, for project-based build)
- Gradle (optional)

### Quick run for a single Java file
From `Java/hundredDaysOfCode/src`:
```bash
javac Day1.java
java Day1
```

### Maven build/test
From `Java/hundredDaysOfCode`:
```bash
mvn test
```

> Note: This repository may include editor/local workflow configurations. Use whichever toolchain fits your environment.

## GSSOC Contribution Call-out 🌸
This repository is being prepared to be **GSSOC-friendly** and welcomes both **GSSOC organizers** and **first-time contributors**.

If you are a new contributor or GSSOC participant, you can start with:
- Improving solution explanations and readability.
- Adding optimized approaches for existing problems.
- Fixing edge cases and input handling.
- Organizing files and improving documentation.

## Contribution Guidelines
1. Fork the repository.
2. Create a feature branch (`feature/your-change`).
3. Keep changes focused and well-structured.
4. Test your changes locally.
5. Open a Pull Request with a clear description.

Please keep contributions respectful, beginner-friendly, and educational.

## License
This project is intended to use the **MIT License** for open collaboration.

If a `LICENSE` file is added/updated in this repository, that file will be the source of truth.
