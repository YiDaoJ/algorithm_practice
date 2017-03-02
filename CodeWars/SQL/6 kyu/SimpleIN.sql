SELECT d.id, d.name
FROM departments d, sales s
WHERE d.id = s.department_id AND price IN (SELECT price FROM sales WHERE price > 98);