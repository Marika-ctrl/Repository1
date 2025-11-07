class TreeNode:
    def __init__(self, val=0):
        self.val = val
        self.left = None
        self.right = None

def count_leaves(root):
    # Базовый случай: пустое дерево
    if root is None:
        return 0
    
    # Ключевая строка: проверка, является ли узел листом
    if root.left is None and root.right is None:
        return 1
    
    # Рекурсивный случай: сумма листьев в левом и правом поддеревьях
    return count_leaves(root.left) + count_leaves(root.right)

# Пример использования
if __name__ == "__main__":
    # Создаём дерево (аналогично предыдущим примерам)
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    leaves = count_leaves(root)
    print(f"Количество листьев: {leaves}")
