# LeetCode Solutions

This repository is where I keep my coding practice. Most solutions are in Java; I also use C, Python, and SQL for some problems.

## Folders

| Folder | What I practise |
| --- | --- |
| [Arrays](./Arrays) | Traversal, searching, and array manipulation |
| [Strings](./Strings) | Character handling and string operations |
| [Trees](./Trees) | Tree traversal and recursive solutions |
| [Math](./Math) | Number-based problems |
| [Sliding window](./Sliding%20window) | Subarray and substring patterns |
| [Two Pointers](./Two%20Pointers) | Pair and range-based traversal |
| [LeetCode](./LeetCode) | Problem-wise submissions synced from LeetCode |

The topic folders are for practising a concept. The `LeetCode/` folder keeps individual problem records. The contents change as I solve and revisit problems.

## Languages

- Java (main language)
- C
- Python
- SQL

## Submission sync

The GitHub Actions workflow in `.github/workflows/leetcode_sync.yml` uses `joshcai/leetcode-sync` to bring submissions into this repository.

- Runs daily at 18:00 UTC (23:30 IST).
- Can also be started manually from the Actions tab.
- Uses the repository secrets `LEETCODE_CSRF_TOKEN` and `LEETCODE_SESSION`.

These secrets contain session information. Keep them private and never add them to the repository.

## Clone

```bash
git clone https://github.com/padmanaban-mu/Leetcode.git
cd Leetcode
```

Many LeetCode Java submissions use the method signature and test harness provided by the platform, so a file may not have its own `main` method. Check the individual solution before trying to run it as a standalone program.

## Why I maintain this repository

I use it to practise consistently, revisit approaches, and get better at recognising patterns. A problem being added here does not mean the topic is complete; this is an ongoing learning record.

[GitHub profile](https://github.com/padmanaban-mu)
