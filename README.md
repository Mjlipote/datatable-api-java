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
    
//  {
//  "cols": [{ "id": "task", "label": "Task", "type": "string"}, { "id": "hours", "label": "Hours per Day", "type": "number"}],
//  "rows": [
//    { "c": [{ "v": "Work"}, { "v": 11}]}, 
//    { "c": [{ "v": "Eat"}, { "v": 2}]}, 
//    { "c": [{ "v": "Commute"}, { "v": 2}]}, 
//    { "c": [{ "v": "Watch TV"}, { "v": 2}]}, 
//    { "c": [{ "v": "Sleep"}, { "v": 7}]}]
//  }
```

