# Library Management System

A simple Java Library Management System built to practice design patterns step by step.

## Features

- Manage books through a single `LibraryService`
- Create books through a factory
- Add premium borrowing time with a decorator
- Support premium access for e-books
- Handle approval through Librarian, Manager, and Director
- Simplify borrowing with a facade
- Convert external book data with an adapter
- Notify users when books become available

## Design Patterns Used

- Singleton: `LibraryService`
- Factory Method: `BookFactory`, `DefaultBookFactory`
- Decorator: `BookDecorator`, `PremiumBook`
- Chain of Responsibility: `Librarian`, `Manager`, `Director`
- Facade: `BorrowFacade`
- Adapter: `BookJsonAdapter`
- Observer: `Book`, `User`

## Project Structure

```text
src/
  lms/
    adapter/
    app/
    approval/
    decorator/
    facade/
    factory/
    model/
    observer/
    service/
```

## Compile and Run

From the project root:

```powershell
javac -d out (Get-ChildItem -Recurse -File src -Filter *.java | ForEach-Object { $_.FullName })
```

```powershell
java -cp out lms.app.Main
```

## Notes

- This project is focused on learning and practicing design patterns.
- Some implementations are intentionally simple to keep the code easy to understand.
