# Hotel Management & Reservation System

A Java desktop application for managing hotel rooms, guests, and reservations.

## Features

* Guest registration and management
* Room registration and management
* Room reservations
* Reservation details and reports
* Hotel dashboard
* MySQL database integration
* JasperReports for generating reports

## Technologies

* Java
* NetBeans
* MySQL
* JDBC
* JasperReports
* JCalendar
* Apache Ant

## Project Structure

```text
src/
├── Controller/
├── Model/
├── View/
└── hotel/reservation/system/

db/
└── db.sql

lib/
└── Project libraries
```

## Database Setup

1. Install and start MySQL.
2. Create the `hotel_system` database.
3. Import `db/db.sql`.
4. Make sure the database connection settings in `src/Model/DBConnection.java` match your MySQL configuration.

Default connection:

```text
Database: hotel_system
Username: root
Password: empty
```

## Running the Project

1. Open the project in NetBeans.
2. Make sure all required libraries in the `lib` folder are available.
3. Start MySQL.
4. Build the project.
5. Run `HotelReservationSystem.java`.

## Project

**Hotel Management & Reservation System**

A desktop-based hotel management system developed using Java Swing and MySQL.
