# LeetCode Solutions & DSA Practice

A personal, evolving collection of coding-problem solutions and practice notes. The main goal is to strengthen problem-solving, data-structure knowledge, and the ability to explain why an approach works.

Most solutions are written in **Java**. A smaller number use C, Python, or SQL.

## How the repository is organised

Solutions are maintained in two complementary ways:

- **Topic folders** group exercises by the concept being practised.
- **`LeetCode/`** stores problem-specific folders, including synced submissions and problem notes where available.

| Folder | Focus |
| --- | --- |
| [Arrays](./Arrays) | Traversal, searching, sorting, and in-place updates |
| [Strings](./Strings) | Character processing and string algorithms |
| [Trees](./Trees) | Tree traversal and recursive problem solving |
| [Math](./Math) | Number theory and mathematical problems |
| [Sliding window](./Sliding%20window) | Contiguous subarray and substring patterns |
| [Two Pointers](./Two%20Pointers) | Pair and range-based traversal |
| [LeetCode](./LeetCode) | Problem-wise submissions and synced records |

The exact contents of each folder evolve as new problems are practised.

## Languages

- Java — primary language
- C
- Python
- SQL

## Submission sync

The workflow at `.github/workflows/leetcode_sync.yml` uses the `joshcai/leetcode-sync` action to synchronise submissions.

- Scheduled run: 18:00 UTC (23:30 IST).
- Manual run: available through GitHub Actions using `workflow_dispatch`.
- Required repository Actions secrets: `LEETCODE_CSRF_TOKEN` and `LEETCODE_SESSION`.
- GitHub supplies the workflow's `GITHUB_TOKEN`.

Keep session cookies private. Never place them in source files, commit messages, screenshots, or README content.

## Clone

```bash
git clone https://github.com/padmanaban-mu/Leetcode.git
cd Leetcode
```

Many LeetCode Java files use the platform-provided method signature and test harness, so they may not include a standalone `main` method. Check the individual solution before compiling it locally.

## Practice approach

For each problem, aim to record:

1. The key observation and brute-force approach.
2. The optimised approach and why it works.
3. Time and space complexity.
4. Edge cases that could break the implementation.

This repository is a learning record, not a claim that every problem or topic is complete.

## Maintainer

[padmanaban-mu](https://github.com/padmanaban-mu)
