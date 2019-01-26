# ToDo List

Napisz program do wyświetlania listy zadań (ToDo list) w metodyce TDD.

Każde z zadań posiada:
- ID
- Tytuł
- Opis (opcjonalne)
- Datę dodania
- Datę deadline (opcjonalne)

Proponowane klasy: `CommandInterpreter`, `TaskRepository`, `Task`

### Wymagania:
##### Deadlines
* dodaj możliwość dodawania deadlinu do tasków za pomocą komendy `deadline <ID> <date>` (np. `deadline 323 2019-02-2019`)
* dodaj możliwość wyświetlania wszystkich tasków z deadlinem do dnia dzisiejszego za pomocą komendy `today`
##### Customisable IDs
* dodaj możliwość nadawania taskom ID, które nie są numerem
* nie pozwól nadawać ID zawierających spacje lub znaki specjalne
##### Deletion
* pozwól użytkownikom usuwać taski poleceniem `delete <ID>`
##### Views
* dodaj możliwość wyświetlania tasków z podziałem na daty
* dodaj możliwość wyświetlania tasków z podziałem na deadliny