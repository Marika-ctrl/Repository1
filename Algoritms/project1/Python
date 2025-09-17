#Массив
#Дан список чисел [5, 2, 9, 1, 5, 6]. Удалите дубликаты, отсортируйте список и выведите его.

# Исходный список
arr = [5, 2, 9, 1, 5, 6]

# Убираем дубликаты с помощью преобразования во множество
arr = list(set(arr))

# Сортируем список
arr.sort()

print("Результат:", arr)

#В Python есть встроенный тип list и мощные методы (sort(), преобразование set() для уникализации).
#Здесь нет необходимости вручную писать сортировку, хотя в учебных целях можно реализовать пузырьковую.

#Стек
#Реализуйте стек с операциями push, pop, peek и покажите пример работы.
class Stack:
    def __init__(self):
        self.stack = []

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return None

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        return None

    def is_empty(self):
        return len(self.stack) == 0


# Использование стека
s = Stack()
s.push(10)
s.push(20)
s.push(30)
print("Верхушка стека:", s.peek())
print("Извлекаем:", s.pop())
print("Стек сейчас:", s.stack)

#Python-список уже работает как динамический массив и подходит для стека.
#append() добавляет в конец, pop() снимает элемент — это эффективно.

#Список
#Реализуйте односвязный список с методами добавления в конец и вывода элементов.
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:   # если список пуст
            self.head = new_node
            return
        current = self.head
        while current.next:  # идем до конца
            current = current.next
        current.next = new_node

    def display(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")


# Проверка
ll = LinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.display()
#В Python нет встроенного LinkedList, поэтому его нужно реализовать через класс Node.
#Отличие от list: обычный список — это динамический массив, а связанный список хранит ссылки.
