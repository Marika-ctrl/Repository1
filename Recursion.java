class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class CountLeaves {
    // Функция для подсчета листьев
    public static int countLeaves(TreeNode root) {
        // Базовый случай: пустое дерево
        if (root == null) {
            return 0;
        }
        
        // Ключевая строка: проверка, является ли узел листом
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        // Рекурсивный случай: сумма листьев в левом и правом поддеревьях
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        // Создаём дерево (аналогично C++)
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int leaves = countLeaves(root);
        System.out.println("Количество листьев: " + leaves);
    }
}
