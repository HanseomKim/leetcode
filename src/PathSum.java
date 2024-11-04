public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 트리가 비어있으면 false 반환
        if (root == null) {
            return false;
        }

        // 리프 노드에 도달했고, 합계가 targetSum과 일치하면 true 반환
        if (root.left == null && root.right == null && targetSum == root.val) {
            return true;
        }

        // 왼쪽 또는 오른쪽 서브트리에서 경로를 찾음
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
