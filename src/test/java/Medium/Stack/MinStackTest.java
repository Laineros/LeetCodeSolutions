package Medium.Stack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    @Test
    public void testMinStackOperations() {
        // 1. Создаем стек
        MinStack minStack = new MinStack();

        // 2. Добавляем элементы
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        // 3. Проверяем минимальный элемент (должен быть -3)
        assertEquals(-3, minStack.getMin());

        // 4. Удаляем верхний элемент
        minStack.pop();

        // 5. Проверяем верхний элемент (должен быть 0)
        assertEquals(0, minStack.top());

        // 6. Проверяем минимальный элемент (теперь должен быть -2)
        assertEquals(-2, minStack.getMin());
    }

}
