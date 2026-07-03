📘 Day 22 – Optional, Method References & Advanced Streams

✅ What I learned today

1. Optional Class
   --------------

- Container object to avoid null checks

- Optional.ofNullable(), ifPresent(), orElse(), orElseThrow()

//Code
-------

Optional<String> opt = Optional.ofNullable(getName());
String name = opt.orElse("Guest");


2. Method References (::)
   -------------------------

Shortcut for lambdas

Types: Static (Math::max), Instance (System.out::println), Constructor (Employee::new)


3. Advanced Streams – Grouping
   ----------------------------

- Collectors.groupingBy(Function) → groups into Map<K, List<V>>

- Collectors.groupingBy(Function, downstream collector) → group + count/average

//Code
-------

// Group employees by department

Map<String, List<Employee>> byDept = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment));

// Count per department

Map<String, Long> counts = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

// Average salary per department
Map<String, Double> avgSalary = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment, 
             Collectors.averagingDouble(Employee::getSalary)));
