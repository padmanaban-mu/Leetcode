# LeetCode Solutions

A personal collection of coding-problem solutions and practice notes, maintained while improving my understanding of data structures, algorithms, and problem-solving.

Most of the solutions are written in **Java**. The repository also contains a small number of solutions in **C, Python, and SQL**.

## Repository Overview

The repository has two main ways of organizing solutions:

- **Topic-based folders** contain solutions grouped by the concept being practised.
- **`LeetCode/`** contains problem-wise records, including synced submissions and problem descriptions.

## Topics

| Folder | Focus |
| --- | --- |
| [`Arrays`](./Arrays) | Array traversal, searching, and manipulation |
| [`Strings`](./Strings) | String processing and character operations |
| [`Trees`](./Trees) | Tree-based problem solving |
| [`Math`](./Math) | Mathematical and number-based problems |
| [`Sliding window`](./Sliding%20window) | Subarray and substring window techniques |
| [`Two Pointers`](./Two%20Pointers) | Two-pointer problem-solving patterns |
| [`LeetCode`](./LeetCode) | Problem-wise submissions and synced problem records |

## Languages

- Java — primary language used in this repository
- SQL
- Python
- C

## Directory Structure

```text
Leetcode/
├── Arrays/
│   └── <problem-folder>/
│       └── Solution.java
├── Strings/
│   └── <problem-folder>/
│       └── Solution.java
├── Trees/
├── Math/
├── Sliding window/
├── Two Pointers/
├── LeetCode/
│   └── <problem-slug>/
│       ├── README.md
│       └── solution file(s)
├── .github/
│   └── workflows/
│       └── leetcode_sync.yml
└── README.md
```

The exact files inside each problem folder vary. LeetCode-provided method signatures may rely on the platform's test harness, so not every solution is designed to run as a standalone Java application.

## LeetCode Submission Sync

This repository includes a GitHub Actions workflow at `.github/workflows/leetcode_sync.yml` to sync LeetCode submissions into the `LeetCode/` directory.

- The workflow is scheduled to run daily at **18:00 UTC (23:30 IST)**.
- It can also be started manually from the repository's **Actions** tab using `workflow_dispatch`.
- The workflow uses the `joshcai/leetcode-sync` action.

To use the workflow in another repository, configure the required repository Actions secrets: `LEETCODE_CSRF_TOKEN` and `LEETCODE_SESSION`. GitHub provides the workflow's `GITHUB_TOKEN` automatically.

## Clone the Repository

```bash
git clone https://github.com/padmanaban-mu/Leetcode.git
cd Leetcode
```

Browse the topic folders to explore individual solutions. To compile and run a Java file locally, check its class name and whether it includes a `main` method; LeetCode submissions often use the method signature provided by the platform instead.

## Purpose

This repository is an ongoing record of my coding practice. I add solutions as I work through problems, revisit approaches, and learn new problem-solving patterns. The goal is consistent practice and a better understanding of the reasoning behind each solution—not simply collecting accepted submissions.

## Profile

- GitHub: [@padmanaban-mu](https://github.com/padmanaban-mu)
- Repository: [Leetcode](https://github.com/padmanaban-mu/Leetcode)
