##Quick Start
```java
    DataTable dataTable = new DataTable();

    dataTable.addColumn(new ColumnDescription("task", "Task", Type.STRING),
        new ColumnDescription("hours", "Hours per Day", Type.NUMBER));

    dataTable.addRow("Work", 11);
    dataTable.addRow("Eat", 2);
    dataTable.addRow("Commute", 2);
    dataTable.addRow("Watch TV", 2);
    dataTable.addRow("Sleep", 7);

    System.out.println(dataTable.toJson());
```
