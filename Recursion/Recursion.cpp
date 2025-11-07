#include <iostream>
using namespace std;

// Структура узла дерева
struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

// Функция для подсчета листьев
int countLeaves(TreeNode* root) {
    // Базовый случай: пустое дерево
    if (root == nullptr) {
        return 0;
    }
    
    // Ключевая строка: проверка, является ли узел листом
    if (root->left == nullptr && root->right == nullptr) {
        return 1;
    }
    
    // Рекурсивный случай: сумма листьев в левом и правом поддеревьях
    return countLeaves(root->left) + countLeaves(root->right);
}

int main() {
    // Создаём дерево:
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5
    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);

    int leaves = countLeaves(root);
    cout << "Количество листьев: " << leaves << endl;

    return 0;
}
